package solitaire;

import java.awt.Graphics;

public class Foundation extends Pile{
	
	private int suit;

	public Foundation(int x, int y, int i) {
		super(x, y);
		super.setSize(72, 96);
		this.suit = i;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.isEmpty()) {
			g.drawImage(Card.getFoundationBase(suit), 0, 0,
					this.getWidth(), this.getHeight(), this);
		}
	}
	
	

}
