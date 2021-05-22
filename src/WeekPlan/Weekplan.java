package WeekPlan;

import java.io.Serializable;
import java.util.Scanner;


public abstract class Weekplan implements Weekplaninput, Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 7377365813405593446L;
	
	protected Weekplanfind kind = Weekplanfind.OOPHomework;
	protected int weeknum;
	protected int sdate;
	protected String weekplan;
	protected int edate;
	public Weekplan(Weekplanfind kind) {
		this.kind = kind;
	}
	
	public Weekplanfind getKind() {
		return kind;
	}

	public void setKind(Weekplanfind kind) {
		this.kind = kind;
	}

	public int getWeeknum() {
		return weeknum;
	}

	public void setWeeknum(int weeknum) {
		this.weeknum = weeknum;
	}

	public int getSdate() {
		return sdate;
	}

	public void setSdate(int sdate) {
		
		this.sdate = sdate;
	}

	public String getWeekplan() {
		return weekplan;
	}

	public void setWeekplan(String weekplan) {
		
		this.weekplan = weekplan;
	}

	public int getEdate() {
		return edate;
	}

	public void setEdate(int edate) {
		this.edate = edate;
	}
	
	public Weekplan(){
		
	}
	
	public Weekplan(int weeknum, int sdate, String weekplan, int edate) {
		this.weeknum = weeknum;
		this.sdate = sdate;
		this.weekplan = weekplan;
		this.edate = edate;
	}
	public Weekplan(Weekplanfind kind, int weeknum, int sdate, String weekplan, int edate) {
		this.kind = kind;
		this.weeknum = weeknum;
		this.sdate = sdate;
		this.weekplan = weekplan;
		this.edate = edate;
	}

	public abstract void printInfo();

	

}
