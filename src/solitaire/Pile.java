package solitaire;

import java.util.Stack;

import javax.swing.JPanel;

public abstract class Pile extends JPanel {
	
	protected int x, y;
	protected Stack<Card> cards;

	public Pile(int x, int y) {
		super.setLocation(x, y);
		cards = new Stack<>();
		
	}
	
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	

}
