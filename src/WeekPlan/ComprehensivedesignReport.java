package WeekPlan;

import java.util.Scanner;

public class ComprehensivedesignReport extends Weekplan {
	public ComprehensivedesignReport(Weekplanfind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		System.out.print("number : ");
	    int weeknum = input.nextInt();
	    this.setWeeknum(weeknum);
		
	    char answer= 'x';
	    while(answer !='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
	    System.out.print("지도교수님의 서명이 필요한 보고서입니까 ? (Y/N) : ");
	    answer = input.next().charAt(0);
	    if(answer == 'Y'||answer == 'y') {
	    	System.out.print("Week date : ");
	    	int sdate = input.nextInt();
	 	    this.setSdate(sdate);
	 	   System.out.print("Week plan : ");
			String weekplan = input.next();
			this.setWeekplan(weekplan);
	 	   System.out.print("When week plan end(서명일자)? : ");
		    int edate = input.nextInt();
		    this.setEdate(edate);
		    break;
	    }
	    else if(answer == 'n' || answer == 'N') {
	    	this.setSdate(sdate);
	    	this.setWeekplan(weekplan);
	    	this.setEdate(edate);
	    	break;
	    }
	    else {
	    	
	    }
	    }
		
		
	}

	
}
