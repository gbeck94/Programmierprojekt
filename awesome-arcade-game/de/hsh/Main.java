package de.hsh;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	public static final int SIZE = 500;
	public static final int MARGIN = 200;
	public int score;
	private MenuScreen menuScreen;

	public static void main(String[] args) {
		new Main().start();
	}

	private void start() {
		setTitle("Field$");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(SIZE+MARGIN, SIZE+MARGIN));
		menuScreen = new MenuScreen(this);
		setScreen(menuScreen);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		score = 0;
		
	}

	public void setScreen(JPanel pScreen) {
		//getContentPane().removeAll();
		getContentPane().removeAll();
		getContentPane().add(pScreen);
		System.out.println("Screens: "+getContentPane().getComponentCount());
		//getContentPane().getComponentCount()
	}
	public List<Battlefield> createBattlefields(int level) {
		List<Battlefield> fields = new ArrayList<Battlefield>();
		
		switch(level) {
			case 5: 
			{
				Battlefield field = new Battlefield();
		
				field.addPoint(0, 0);
				field.addPoint(Main.SIZE, 0);
				field.addPoint(Main.SIZE, Main.SIZE);
				field.addPoint(Main.SIZE / 2, Main.SIZE);
				field.addPoint(Main.SIZE / 2, Main.SIZE / 2);
				field.addPoint(0, Main.SIZE / 2);
		
				fields.add(field); }
				break;
			case 2:
			{
				Battlefield field = new Battlefield();
				
				field.addPoint(0, 0);
				field.addPoint(Main.SIZE, 0);
				field.addPoint(Main.SIZE, Main.SIZE);
				field.addPoint(2*Main.SIZE / 3, Main.SIZE);
				field.addPoint(2*Main.SIZE / 3, Main.SIZE / 2);
				field.addPoint(Main.SIZE / 3, Main.SIZE / 2);
				field.addPoint(Main.SIZE / 3, Main.SIZE);
				field.addPoint(0, Main.SIZE);
		
				fields.add(field); }
				break;
			case 3:
			{
				Battlefield field = new Battlefield();
				
				field.addPoint(0, 0);
				field.addPoint(Main.SIZE, 0);
				field.addPoint(Main.SIZE, Main.SIZE/2);
				field.addPoint(2*Main.SIZE / 3, Main.SIZE/2);
				field.addPoint(2*Main.SIZE / 3, Main.SIZE);
				field.addPoint(Main.SIZE / 3, Main.SIZE);
				field.addPoint(Main.SIZE / 3, Main.SIZE/2);
				field.addPoint(0, Main.SIZE/2);
		
				fields.add(field); }
				break;
			case 4:
			{
				Battlefield field = new Battlefield();
				
				field.addPoint(Main.SIZE/3, 0);
				field.addPoint(2*Main.SIZE/3, 0);
				field.addPoint(2*Main.SIZE/3, Main.SIZE/3);
				field.addPoint(Main.SIZE, Main.SIZE/3);
				field.addPoint(Main.SIZE, 2*Main.SIZE/3);
				field.addPoint(2*Main.SIZE / 3, 2*Main.SIZE/3);
				field.addPoint(2*Main.SIZE / 3, Main.SIZE);
				field.addPoint(Main.SIZE / 3, Main.SIZE);
				field.addPoint(Main.SIZE / 3, 2*Main.SIZE/3);
				field.addPoint(0, 2*Main.SIZE/3);
				field.addPoint(0, Main.SIZE/3);
				field.addPoint(Main.SIZE/3, Main.SIZE/3);
				
				
				
				//field.addPoint(0, Main.SIZE/2);
		
				fields.add(field); }
				break;
			case 1:
			{
				Battlefield field = new Battlefield();
				
				field.addPoint(0, 0);
				field.addPoint(Main.SIZE/3, 0);
				field.addPoint(Main.SIZE/3, Main.SIZE/3);
				field.addPoint(2*Main.SIZE/3, Main.SIZE/3);
				field.addPoint(2*Main.SIZE/3, 0);
				field.addPoint(Main.SIZE, 0);
				field.addPoint(Main.SIZE, Main.SIZE);
				field.addPoint(2*Main.SIZE/3, Main.SIZE);
				field.addPoint(2*Main.SIZE / 3, 2*Main.SIZE/3);
				field.addPoint(Main.SIZE/3, 2*Main.SIZE/3);
				field.addPoint(Main.SIZE/3, Main.SIZE);
				field.addPoint(0, Main.SIZE);
				
				
				
				//field.addPoint(0, Main.SIZE/2);
		
				fields.add(field); }
				break;
			default:
			{	Battlefield field = new Battlefield();
				
				field.addPoint(0, 0);
				field.addPoint(Main.SIZE, 0);
				field.addPoint(Main.SIZE, Main.SIZE);
				field.addPoint(Main.SIZE / 2, Main.SIZE);
				field.addPoint(Main.SIZE / 2, Main.SIZE / 2);
				field.addPoint(0, Main.SIZE / 2);
		
				fields.add(field);}
		}
		return fields;
	}
}
