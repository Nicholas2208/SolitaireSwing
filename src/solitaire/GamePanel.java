package solitaire;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	protected static int XShift = 80;
	public static Point DECK_POSITION = new Point(500, 20);
	public static Point TABLEAU_POSITION = new Point(20, 150);
	private static int TABLEAU_OFFSET = 80;
	private static Deck deck;
	private static Waste waste;
	private static Foundation[] foundationPiles;
	private static Tableau[] tableau;

	public GamePanel() {
		super.setLayout(null);
		initializePiles();
		
		GameMoveListener l = new GameMoveListener();
		addMouseListener(l);
		addMouseMotionListener(l);
	}



	private void initializePiles() {
		deck = new Deck(DECK_POSITION.x, DECK_POSITION.y);
		add(deck);
		waste = new Waste(DECK_POSITION.x - XShift, DECK_POSITION.y);
		add(waste);
		foundationPiles = new Foundation[4];
		for(int i = 0; i < foundationPiles.length; ++i) {
			foundationPiles[i] = new Foundation(20 + XShift * i, 20, i + 1);
			add(foundationPiles[i]);
		}
		tableau = new Tableau[7];
		for(int tableauIndex = 1; tableauIndex <= tableau.length; ++tableauIndex) {
			tableau[tableauIndex - 1] = new Tableau(TABLEAU_POSITION.x + TABLEAU_OFFSET * (tableauIndex - 1),
					TABLEAU_POSITION.y,
					tableauIndex + 1);
			add(tableau[tableauIndex - 1]);
		}
	}



	public static Foundation[] getFoundationPiles() {
		return foundationPiles;
	}



	public static Waste getWastePile() {
		return waste;
	}



	public static Deck getDeck() {
		return deck;
	}



	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
	}

	
}
