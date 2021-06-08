package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Manager.WeekPlanManager;
import WeekPlan.Weekplan;
import WeekPlan.Weekplaninput;

public class WeekPlanVeiwer extends JPanel {
	Windowframe f;
	 WeekPlanManager w;

	public WeekPlanManager getW() {
		return w;
	}

	public void setW(WeekPlanManager w) {
		this.w = w;
		
	}

	public  WeekPlanVeiwer(Windowframe f,  WeekPlanManager w) {
		this.f = f;
		this.w = w;
		
		System.out.println("***"+w.size()+"***");
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("num");
		model.addColumn("Started Date");
		model.addColumn("Weekly Plan");
		model.addColumn("Ended Date");
		
		for(int i=0; i<w.size(); i++) {
			Vector row = new Vector();
			Weekplaninput wpi = w.get(i);
			row.add(wpi.getWeeknum());
			row.add(wpi.getSdate());
			row.add(wpi.getWeekplan());
			row.add(wpi.getEdate());
			model.addRow(row);
		}
		
		JTable t = new JTable(model);
		JScrollPane sp = new JScrollPane(t);
		
		this.add(sp);
		
			
	}
}
