package javaTest01;
import java.awt.*;
import javax.swing.*;

public class windowGUI {

	public static void createWindow() {
		JFrame frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel textLabel = new JLabel("EMPTY",SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension (400,400));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
	
		createWindow();
	}
}
