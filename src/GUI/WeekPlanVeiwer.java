package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WeekPlanVeiwer extends JFrame {

	public  WeekPlanVeiwer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("num");
		model.addColumn("Started Date");
		model.addColumn("Weekly Plan");
		model.addColumn("Ended Date");
		
		JTable t = new JTable(model);
		JScrollPane sp = new JScrollPane(t);
		
		this.add(sp);
		 this.setSize(300,300);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		 this.setVisible(true);
	}

}
