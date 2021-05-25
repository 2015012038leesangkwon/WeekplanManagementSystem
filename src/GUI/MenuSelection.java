package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	
	public MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l = new JLabel("Menu Selection");
		
		JButton botton1 = new JButton("Add Weekly Plan");
		JButton botton2 = new JButton("Delete Weekly Plan");
		JButton botton3 = new JButton("View Weekly Plan");
		JButton botton4 = new JButton("Edit Weekly Plan");
		JButton botton5 = new JButton("EXIT");
		
		p2.add(l);
		p.add(botton1);
		p.add(botton2);
		p.add(botton3);
		p.add(botton4);
		p.add(botton5);
		
		
		this.add(p2, BorderLayout.NORTH);
		this.add(p, BorderLayout.CENTER);
		this.setVisible(true);
		
	}

}
