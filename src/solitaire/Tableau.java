package solitaire;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Tableau extends Pile{

	public Tableau(int x, int y, int initSize) {
		super(x, y);
		super.setSize(72, 450);
		super.setOpaque(false);
		for(int i = 0; i < initSize; ++i) {
			push(GamePanel.getDeck().pop());
		}
		
		if(initSize > 0) {
			topCard().showFace();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.drawLine(0, 0, this.getWidth(), 0);
		g2d.drawLine(0, 0, 0, 96);
		g2d.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, 96);
		
		g2d.setPaint(new GradientPaint(36, 0, new Color(255, 255, 255, 160), 36, 60, new Color(0, 0, 0, 0)));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int cardYPos = 0;
		if(this.isEmpty()) {
			
		}else {
			for(Card c : this.cards) {
				if(c.isFaceUp()) {
					g.drawImage(c.getCardImage(), 0, cardYPos, 72, 96, this);
				}else {
					g.drawImage(Card.getCardBack(), 0, cardYPos, 72, 96, this);
					cardYPos += 20;
				}
			}
		}
	}
	
	

}
