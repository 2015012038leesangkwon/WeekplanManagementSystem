package WeekPlan;

import java.util.Scanner;



public class MaterialmechanicsHomwork extends Weekplan {
	public MaterialmechanicsHomwork(Weekplanfind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		System.out.print("number : ");
	    int weeknum = input.nextInt();
	    this.setWeeknum(weeknum);
		
	    char answer= 'x';
	    while(answer !='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
	    System.out.print("기간이 정해진 과제입니까? (Y/N) : ");
	    answer = input.next().charAt(0);
	    if(answer == 'Y'||answer == 'y') {
	    	System.out.print("Week date : ");
	    	int sdate = input.nextInt();
	 	    this.setSdate(sdate);
	 	   System.out.print("Week plan : ");
			String weekplan = input.next();
			this.setWeekplan(weekplan);
	 	   System.out.print("When week plan end? : ");
		    int edate = input.nextInt();
		    this.setEdate(edate);
		    break;
	    }
	    else if(answer == 'n' || answer == 'N') {
	    	this.setSdate(0);
	    	this.setWeekplan("");
	    	this.setEdate(0);
	    	break;
	    }
	    else {
	    	
	    }
	    }
		
		
	}
	public void printInfo() {
		String skind = getkindString();
		System.out.println ("number : " + weeknum +" /Object : "+ skind+ " /Week plan : "+ weekplan+ " /Week date : " + sdate + " /End date : " + edate);
	}
	public String getkindString() {
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
		return skind;
		
	}

}