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
	    System.out.print("������������ ������ �ʿ��� �����Դϱ� ? (Y/N) : ");
	    answer = input.next().charAt(0);
	    if(answer == 'Y'||answer == 'y') {
	    	System.out.print("Week date : ");
	    	int sdate = input.nextInt();
	 	    this.setSdate(sdate);
	 	   System.out.print("Week plan : ");
			String weekplan = input.next();
			this.setWeekplan(weekplan);
	 	   System.out.print("When week plan end(��������)? : ");
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
