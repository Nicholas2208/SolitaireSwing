package solitaire;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Solitaire extends JFrame{
	
	static protected GamePanel gamePanel;
	public static final int PANEL_WIDTH = 640, PANEL_HEIGHT = 500;
	
	public Solitaire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamePanel = new GamePanel();
		gamePanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		add(gamePanel);
		pack();
	}

	public static void main(String[] args) {
		new Solitaire().setVisible(true);
	}

}
