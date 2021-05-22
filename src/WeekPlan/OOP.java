package WeekPlan;

import java.util.Scanner;



public class OOP extends Weekplan  {
	public OOP(Weekplanfind kind) {
		super(kind);
	}
	protected int parentSdate;
	protected String parentWeekplan;
	protected int parentEdate;
	
	public void getUserInput(Scanner input) {
		System.out.print("number : ");
	    int weeknum = input.nextInt();
	    this.setWeeknum(weeknum);
		
	    char answer= 'x';
	    while(answer !='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
	    System.out.print("기간이 정해진 과제 입니까 ? (Y/N) : ");
	    answer = input.next().charAt(0);
	    if(answer == 'Y'||answer == 'y') {
	    	System.out.print("When Weekly plan starts? : ");
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
	    answer= 'x';
	    while(answer !='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
	    System.out.print("This Plan is Project Report  ? (Y/N) : ");
	    answer = input.next().charAt(0);
	    if(answer == 'Y'||answer == 'y') {
	    	System.out.print("When Project report starts? : ");
	    	int sdate = input.nextInt();
	 	    this.setSdate(sdate);
	 	   System.out.print("Project report : ");
			String weekplan = input.next();
			this.setWeekplan(weekplan);
	 	   System.out.print("WhenProject report end? : ");
		    int edate = input.nextInt();
		    this.setEdate(edate);
		    break;
	    }
	    else if(answer == 'n' || answer == 'N') {
	    	this.setSdate(sdate);
	    	this.setWeekplan(weekplan + " (Does not include project reports)");
	    	this.setEdate(edate);
	    	break;
	    }
	    else {
	    	
	    }
	    }
	    
	}
	public void printInfo() {
		String skind = getkindString();
		System.out.println ("number : " + weeknum +" /Object : "+ skind+ " /Week plan : "+ weekplan+ " /Week date : " + sdate + " /End date : " + edate);
		System.out.println("=> Project Started date : " + sdate +" /Project plan : "+weekplan+" /Project ended date : "+edate);
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

		
		


