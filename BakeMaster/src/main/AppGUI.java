package main;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppGUI {
	public AppGUI() {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	panel.setBackground(new Color(148,150,78));
	panel.setSize(500,800);
	
	
	frame.setTitle("BakeMaster");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 800);
	frame.setResizable(false);
	frame.setVisible(true);
	frame.add(panel);
	
	
	
		
		
		
	}
	

}
