package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.WeekPlanManager;
import WeekPlan.Weekplan;

public class Windowframe extends JFrame {
	
	
	MenuSelection ms ;
	WeekPlanAdder sa ;
    WeekPlanVeiwer wv;
    WeekPlanManager w;
    
	public Windowframe( WeekPlanManager w) {
		 this.setSize(500,300);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.w = w;
		 this.ms = new MenuSelection(this);
		 this.sa = new WeekPlanAdder(this,this.w);
	     this.wv = new WeekPlanVeiwer(this,this.w);
	    
		this.setupPanel(ms);
		 
		 this.setVisible(true);
	}
	public void setupPanel(JPanel p) {
		this.getContentPane().removeAll();
		this.getContentPane().add(p);
		this.revalidate();
		this.repaint();
		
	}
	
	public MenuSelection getMs() {
		return ms;
	}
	public void setMs(MenuSelection ms) {
		this.ms = ms;
	}
	public WeekPlanAdder getSa() {
		return sa;
	}
	public void setSa(WeekPlanAdder sa) {
		this.sa = sa;
	}
	public WeekPlanVeiwer getWv() {
		return wv;
	}
	public void setWv(WeekPlanVeiwer wv) {
		this.wv = wv;
	}
	

}
