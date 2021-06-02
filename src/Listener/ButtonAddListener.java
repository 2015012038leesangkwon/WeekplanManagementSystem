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
		JButton b = (JButton)e.getSource();
		WeekPlanAdder viewer = f.getSa();
		f.setupPanel(viewer);
		
	}

}
