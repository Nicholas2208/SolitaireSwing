package solitaire;

import java.awt.Graphics;

public class Waste extends Pile{

	public Waste(int x, int y) {
		super(x, y);
		super.setSize(72, 96);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Card.getCardOutline(), 0, 0, 72, this.getHeight(), this);
	}
	
	

}
