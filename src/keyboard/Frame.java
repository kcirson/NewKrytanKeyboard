package keyboard;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import keyboard.KrytanToEng.KrytanToEng;
import keyboard.engToKrytan.EngToNewKrytan;

@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener{
	JButton translateKrytan, translateEng;
	JPanel panel;
	
	public Frame() {
		setLayout(new FlowLayout());
		
		translateEng = new JButton("English => New Krytan");
		translateEng.addActionListener(this);
		
		translateKrytan = new JButton("New Krytan => English");
		translateKrytan.addActionListener(this);
		
		panel = new JPanel();
		
		add(translateEng);
		add(translateKrytan);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == translateEng) {
			EngToNewKrytan enk = new EngToNewKrytan();
			enk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			enk.setSize(500, 320);
			enk.setResizable(true);
			enk.setVisible(true);
			enk.setLocationRelativeTo(null);
			this.dispose();
		}
		if(e.getSource() == translateKrytan) {
			KrytanToEng kte = new KrytanToEng();
			kte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			kte.setSize(600, 320);
			kte.setResizable(false);
			kte.setVisible(true);
			kte.setLocationRelativeTo(null);
			this.dispose();
		}
	}
}