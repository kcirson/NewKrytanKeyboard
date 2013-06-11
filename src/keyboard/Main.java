package keyboard;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(200, 100);
		f.setResizable(false);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
	}
}