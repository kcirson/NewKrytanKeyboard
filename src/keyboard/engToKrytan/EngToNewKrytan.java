package keyboard.engToKrytan;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EngToNewKrytan extends JFrame implements ActionListener{
	JTextField inputTextfield;
	JButton translateButton;
	JPanel content, inputPanel;
	ArrayList<Character> letters = new ArrayList<Character>();

	public EngToNewKrytan(){
		super("English to New Krytan Translator");
		setLayout(new FlowLayout());
		
		inputTextfield = new JTextField(35);
		translateButton = new JButton("Translate");
		translateButton.addActionListener(this);

		inputPanel = new JPanel();
		
		inputPanel.add(inputTextfield);
		inputPanel.add(translateButton);
		
		add(inputPanel);
		
		char[] values = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for(int i = 0; i < values.length; i++) {
			letters.add(i, values[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == translateButton) {
			ArrayList<Integer> tempArray = new ArrayList<Integer>();
			int j = 0;
			int[] xValue;
			
			if(inputTextfield.getText() != "") {
				char[] text = inputTextfield.getText().toUpperCase().toCharArray();
				
				for(char c : text) {
					tempArray.add(letters.indexOf(c));
				}
				xValue = new int[tempArray.size()];
				
				for(int i = 0; i< tempArray.size(); i++) {
					xValue[j] = (int)tempArray.get(i);
				}

				if(xValue.length != 0) {
					ImageFrame imgF = new ImageFrame(xValue);
					this.add(imgF);
				}
				validate();
			}
		}
	}
}