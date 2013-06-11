package keyboard.KrytanToEng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import keyboard.imageLoader.SpriteSheet;

@SuppressWarnings("serial")
public class KeyboardButton extends JButton implements ActionListener{
	private String s;
	private KrytanToEng kte;

	public KeyboardButton(int x, String s, SpriteSheet ss, KrytanToEng kte) {
		super(new ImageIcon(ss.grabSprite(x)));
		this.s = s;
		this.kte = kte;
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this) {
			kte.setResultText(s);
		}
	}
}
