package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Manager.WeekPlanManager;
import WeekPlan.OOP;
import WeekPlan.Weekplanfind;
import WeekPlan.Weekplaninput;

public class WeekPlanadderListener implements ActionListener {
	JTextField filednum;
	JTextField filedsdate;
	JTextField filedplan;
	JTextField filededate;
    WeekPlanManager w;
	
	
	public WeekPlanadderListener(JTextField filednum, 
			JTextField filedsdate,
			JTextField filedplan,
			JTextField filededate,
			WeekPlanManager w
			) {
		super();
		this.filednum = filednum;
		this.filedsdate = filedsdate;
		this.filedplan = filedplan;
		this.filededate = filededate;
		this.w = w;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		Weekplaninput weekplan = new OOP(Weekplanfind.OOPHomework);
		
		weekplan.setSdate(Integer.parseInt(filedsdate.getText()));
		weekplan.setWeekplan(filedplan.getName());
		weekplan.setEdate(Integer.parseInt(filededate.getText()));
		w.addWeekplan(weekplan);
		putobject(w,"weekplanmanager.ser");
		weekplan.printInfo();
		
	}
public static void putobject(WeekPlanManager weekplanmanager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			 out.writeObject(weekplanmanager);
			 out.close();
			 file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
