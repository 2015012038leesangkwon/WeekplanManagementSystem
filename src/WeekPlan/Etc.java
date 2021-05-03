package WeekPlan;

import java.util.Scanner;

public class Etc extends Weekplan implements Weekplaninput {
	public Etc(Weekplanfind kind) {
		super(kind);
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
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case OOPHomework:
			skind = "OOP";
			break;
		case MaterialmechanicsHomwork:
			skind = "Materialmechanics";
			break;
		case ComprehensivedesignReport:
			skind = "ComprehensivedesignReport";
			break;
		case etc:
			skind = "etc";
			break;
		default:
			
		}
		System.out.println ("number : " + weeknum +" /Object : "+ skind+ " /Week plan : "+ weekplan+ " /Week date : " + sdate + " /End date : " + edate);
	}
}
