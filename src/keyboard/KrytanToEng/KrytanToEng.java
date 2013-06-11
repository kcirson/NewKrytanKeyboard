package keyboard.KrytanToEng;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class KrytanToEng extends JFrame implements ActionListener{
	private JLabel lb1;
	private JTextField tf1;
	private JButton clear, backspace, spacebar;
	private JPanel textPanel, keybPanel;
	private Keyboard kb;

	public KrytanToEng() {
		super("New Krytan Keyboard");
		setLayout(new FlowLayout());

		textPanel = new JPanel();
		keybPanel = new JPanel();
		keybPanel.setSize(600, 200);
		
		lb1 = new JLabel("Translation: ");

		tf1 = new JTextField(35);
		
		clear = new JButton("CE");
		clear.addActionListener(this);
		
		backspace = new JButton("<=");
		backspace.addActionListener(this);
		
		spacebar = new JButton("SPACE");
		spacebar.addActionListener(this);

		textPanel.add(lb1);
		textPanel.add(tf1);
		textPanel.add(backspace);
		textPanel.add(clear);

		add(textPanel);
		add(kb = new Keyboard(this));
		add(spacebar);
	}
		
	public void setResultText(String s) {
		tf1.setText(tf1.getText() + s);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backspace) {
			if(!tf1.getText().equals("")) {
				tf1.setText(tf1.getText().substring(0, tf1.getText().length()-1));
			}				
		}
		if(e.getSource() == clear) {
			tf1.setText("");
		}
		if(e.getSource() == spacebar) {
			tf1.setText(tf1.getText() + " ");
		}
	}
}
