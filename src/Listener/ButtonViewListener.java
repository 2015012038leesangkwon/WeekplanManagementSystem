package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.WeekPlanVeiwer;
import GUI.Windowframe;

public class ButtonViewListener implements ActionListener {
	Windowframe f;
	
	public ButtonViewListener(Windowframe f) {
		this.f = f;
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		WeekPlanVeiwer viewer = f.getWv();
		f.setupPanel(viewer);
		
	}

}
