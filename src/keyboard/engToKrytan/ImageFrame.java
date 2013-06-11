package keyboard.engToKrytan;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;

import keyboard.imageLoader.BufferedImageLoader;
import keyboard.imageLoader.SpriteSheet;

@SuppressWarnings("serial")
public class ImageFrame extends JPanel{
	SpriteSheet ss;
	int[] xValue;

	public ImageFrame(int[] xValue) {
		this.xValue = xValue;
		setPreferredSize(new Dimension(480, 400));
		
		BufferedImageLoader loader = new BufferedImageLoader();
		BufferedImage spriteSheet = null;
		
		try {
			spriteSheet = loader.loadImage("/res/spritesheet.png");
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		ss = new SpriteSheet(spriteSheet);
	}
	
	public void paint(Graphics g){
		for(int i = 0; i < xValue.length; i++) {
			g.drawImage(ss.grabSprite(i * 30), i*30, 0, null);
		}
	}
}