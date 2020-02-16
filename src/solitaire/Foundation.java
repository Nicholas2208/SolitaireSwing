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
		}else {
			g.drawImage(this.topCard().getCardImage(),
					0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public void moveFromWaste(Waste source, Card card) {
		if(accepts(card)) {
			this.push(source.pop());
			source = null;
		}
	}
	
	public void moveTo(Tableau destination, Card card) {
		if(destination.accepts(card)) {
			destination.push(this.pop());
		}
	}

	public boolean accepts(Card card) {
		if(!this.isEmpty()) {
			return this.topCard().getValue() == card.getValue() - 1 &&
					this.topCard().getSuit().equals(card.getSuit());
		}
		return card.getValue() == 1 && intToSuit(card.getSuit()); // Ace
	}
	
	private boolean intToSuit(String pSuit) {
		if (pSuit.equals("c")) {
			return this.suit == 3;
		} else if (pSuit.equals("s")) {
			return this.suit == 1;
		} else if (pSuit.equals("h")) {
			return this.suit == 2;
		} else if (pSuit.equals("d")) {
			return this.suit == 4;
		}
		return false;
	}

}
