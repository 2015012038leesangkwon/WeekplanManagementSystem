package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.WeekPlanadderListener;
import Manager.WeekPlanManager;

public class WeekPlanAdder extends JPanel {
	Windowframe f;
	 WeekPlanManager w;
	
	public WeekPlanAdder(Windowframe f, WeekPlanManager w) {
		this.f = f;
		this.w = w;
		
		JPanel p = new JPanel();
		p.setLayout(new SpringLayout());
		
		JLabel labelnum = new JLabel("number: ", JLabel.TRAILING);
		JTextField filednum = new JTextField(10);
		labelnum.setLabelFor(filednum);
		p.add(labelnum);
		p.add(filednum);
		
		JLabel labelsdate = new JLabel("Started Date: ", JLabel.TRAILING);
		JTextField filedsdate = new JTextField(10);
		labelsdate.setLabelFor(filedsdate);
		p.add(labelsdate);
		p.add(filedsdate);
		
		JLabel labelplan = new JLabel("Weekly Plan: ", JLabel.TRAILING);
		JTextField filedplan = new JTextField(10);
		labelplan.setLabelFor(filedplan);
		p.add(labelplan);
		p.add(filedplan);
		
		JLabel labeledate = new JLabel("Ended Date: ", JLabel.TRAILING);
		JTextField filededate = new JTextField(10);
		labeledate.setLabelFor(filededate);
		
		JButton save = new JButton("save");
		save.addActionListener(new WeekPlanadderListener(filednum,filedsdate,filedplan,filededate,w));
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ButtonAddcancelListener(f));
		
		p.add(labeledate);
		p.add(filededate);
		
		p.add(save);
		p.add(cancel);
		
		SpringUtilities.makeCompactGrid(p,5,2,6,6,6,6);
		
		 
		 this.add(p);
		 this.setVisible(true);
	}

}
