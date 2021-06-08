package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.WeekPlanAdder;
import GUI.WeekPlanVeiwer;
import GUI.Windowframe;

public class ButtonAddListener implements ActionListener {
	Windowframe f;
	
	public ButtonAddListener(Windowframe f) {
		this.f = f;
	}

	
	public void actionPerformed(ActionEvent e) {
		
		f.getContentPane().removeAll();
		f.getContentPane().add(f.getSa());
		f.revalidate();
		f.repaint();
		
	}

}
