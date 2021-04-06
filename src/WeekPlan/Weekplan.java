package WeekPlan;

import java.util.Scanner;

public class Weekplan {
	


	protected Weekplanfind kind = Weekplanfind.OOPHomework;
	protected int weeknum;
	protected int sdate;
	protected String weekplan;
	protected int edate;
	
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


	public void printInfo() {
		System.out.println("number : " + weeknum + " /Week plan : "+ weekplan+ " /Week date : " + sdate + " /End date : " + edate);
	}
	public void getUserInput(Scanner input) {
		System.out.print("number : ");
	    int weeknum = input.nextInt();
	    this.setWeeknum(weeknum);
		System.out.print("Week date : ");
	    int sdate = input.nextInt();
	    this.setSdate(sdate);
		System.out.print("Week plan : ");
		String weekplan = input.next();
		this.setWeekplan(weekplan);
		System.out.print("When week plan end? : ");
	    int edate = input.nextInt();
	    this.setEdate(edate);
	}

}
