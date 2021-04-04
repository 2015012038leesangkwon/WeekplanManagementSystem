import java.util.Scanner;

public class WeekPlanManager {
	Weekplan weekplan;
	Scanner input;
	WeekPlanManager(Scanner input){
		this.input = input;
		
	}
	public void addWeekplan() {
		weekplan = new Weekplan();
		System.out.print("Week date : ");
	    weekplan.sdate = input.next();
		System.out.print("Week plan : ");
		weekplan.weekplan = input.next();
		System.out.print("When week plan end? : ");
	    weekplan.edate = input.next();
		
	}
	public void deleteWeekplan() {
		
		System.out.print("Which day plan delete? : ");
		String deletedayweekplan = input.next();
		System.out.print("What delete Week Plan ? : ");
		String deleteweekplan = input.next();
		if(weekplan == null) {
			System.out.println("This week plan has not been registered.");
			return;
		}
		if(weekplan.weekplan == deletedayweekplan) {
			weekplan = null;
			System.out.println("The week plan is deleted!");
		}
		
	}
	public void viewWeekplan() {
		
		System.out.print("Which day plan View? : ");
		String viewdayweekplan = input.next();
		System.out.print("which Week plan want to view? : ");
		String viewweekplan = input.next();
		if(weekplan.weekplan == viewweekplan) {	
			weekplan.printInfo();
		}
			
		
		
	}
	public void EditWeekplan() {
		
		System.out.print("Which day plan Edit? : ");
		String editdayweekplan = input.next();
		System.out.print("What edit Week Plan ? : ");
		String editweekplan = input.next();
		if(weekplan.weekplan == editweekplan) {			
			System.out.println("The week plan to be edited is " + editweekplan );
		}
		
	}


}
