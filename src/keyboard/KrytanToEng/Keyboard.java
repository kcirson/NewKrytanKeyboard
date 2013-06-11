package keyboard.KrytanToEng;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;

import keyboard.imageLoader.BufferedImageLoader;
import keyboard.imageLoader.SpriteSheet;

@SuppressWarnings("serial")
public class Keyboard extends JPanel{
	private KeyboardButton[] buttonArray;
	
	public Keyboard(final KrytanToEng kte) {
		this.setPreferredSize(new Dimension(620, 350));
		
		BufferedImageLoader loader = new BufferedImageLoader();
		BufferedImage spriteSheet = null;
		
		try {
			spriteSheet = loader.loadImage("/res/spritesheet.png");
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		SpriteSheet ss = new SpriteSheet(spriteSheet);
		
		int j = 0;
		String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
				"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		int lettersSize = letters.length; 
		
		buttonArray = new KeyboardButton[lettersSize];
		
		for(int i = 0; i < lettersSize; i++) {
			buttonArray[i] = new KeyboardButton(j, letters[i], ss, kte);
			kte.add(buttonArray[i]);
			j += 30;
		}
	}
}