package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		tellAJoke.addActionListener((e)->{JOptionPane.showMessageDialog(null, "What do you call an unintentional pun? A punintentional!");});
		randNumber.addActionListener((x)->{JOptionPane.showMessageDialog(null, "Here's a random 0-100 integer: " + (int)(Math.random() * 101));});
		addNumbers.addActionListener((z)->{JOptionPane.showMessageDialog(null, "This is the sum of those two numbers: " +  (Integer.parseInt(JOptionPane.showInputDialog("Type in an integer.")) + Integer.parseInt(JOptionPane.showInputDialog("Type in a second integer."))));});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
