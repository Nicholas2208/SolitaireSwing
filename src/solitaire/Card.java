package solitaire;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Card {
	
	public static String cardBackFilename = "back001";
	public static String directory = "cards", extension = ".gif";
	private Image im;
	
	public static Image getCardBack() {
		ImageIcon ii = new ImageIcon(
				Card.class.getResource(directory + "/" + cardBackFilename + extension));
		Image image = ii.getImage();
		return image;
	}

}
