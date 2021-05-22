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
	    answer= 'x';
	    while(answer !='y'&&answer!='Y'&&answer!='n'&&answer!='N') {
	    System.out.print("��ǥ�غ� �ؾ��ϴ� �����Դϱ� ? (Y/N) : ");
	    answer = input.next().charAt(0);
	    if(answer == 'Y'||answer == 'y') {
	    	System.out.print("��ǥ�غ� ���� : ");
	    	int sdate = input.nextInt();
	 	    this.setSdate(sdate);
	 	   System.out.print("��ǥ���� : ");
			String weekplan = input.next();
			this.setWeekplan(weekplan);
	 	   System.out.print("��ǥ�غ� ������? : ");
		    int edate = input.nextInt();
		    this.setEdate(edate);
		    break;
	    }
	    else if(answer == 'n' || answer == 'N') {
	    	this.setSdate(sdate);
	    	this.setWeekplan(weekplan+ "(��ǥ�� �ʿ� ���� ���� �Դϴ�)");
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
		System.out.println("=> ��ǥ�غ� ������ : " + sdate +" /��ǥ���� : "+weekplan+" /��ǥ�غ� ������ : "+edate);

	
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