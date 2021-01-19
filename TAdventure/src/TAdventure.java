import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class TAdventure 
{
	public static void main(String[] args) {
		new TAdventure();
		 try {
			    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
			 } catch (Exception e) {
			            e.printStackTrace();
			 }
		
	}
	public TAdventure()
	{
		JFrame window;
		JPanel titleNamePanel, startButtonPanel;
		JLabel titleNameLabel;
		JButton startButton;
		Container con;
		Font titleFont = new Font("Times New Roman", Font.PLAIN, 80);
		Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);
		
		window = new JFrame();
		window.setSize(700, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 500, 100);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("ADVENTURE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 350, 125, 75);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.white);
		startButton.setForeground(Color.black);
		startButton.setFont(normalFont);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		window.setVisible(true);
	}
}
