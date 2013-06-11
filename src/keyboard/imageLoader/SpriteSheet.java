package keyboard.imageLoader;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	public BufferedImage spriteSheet;
	
	public SpriteSheet(BufferedImage image) {
		spriteSheet = image;
	}
	
	public BufferedImage grabSprite(int x) {
		BufferedImage sprite = spriteSheet.getSubimage(x, 0, 30, 30);
		return sprite;
	}
}