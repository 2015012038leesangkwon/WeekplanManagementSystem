package WeekPlan;

import java.util.Scanner;



public class ComprehensivedesignReport extends Weekplan {
	public ComprehensivedesignReport(Weekplanfind kind) {
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
	    answer= 'x';
	    while(answer !='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
	    System.out.print("발표준비를 해야하는 과제입니까 ? (Y/N) : ");
	    answer = input.next().charAt(0);
	    if(answer == 'Y'||answer == 'y') {
	    	System.out.print("발표준비 시작 : ");
	    	int sdate = input.nextInt();
	 	    this.setSdate(sdate);
	 	   System.out.print("발표내용 : ");
			String weekplan = input.next();
			this.setWeekplan(weekplan);
	 	   System.out.print("발표준비 마감일? : ");
		    int edate = input.nextInt();
		    this.setEdate(edate);
		    break;
	    }
	    else if(answer == 'n' || answer == 'N') {
	    	this.setSdate(sdate);
	    	this.setWeekplan(weekplan+ "(발표가 필요 없는 과제 입니다)");
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
		System.out.println("=> 발표준비 시작일 : " + sdate +" /발표내용 : "+weekplan+" /발표준비 마감일 : "+edate);

	
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