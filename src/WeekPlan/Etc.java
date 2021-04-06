package WeekPlan;

import java.util.Scanner;

public class Etc extends Weekplan {
	

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
