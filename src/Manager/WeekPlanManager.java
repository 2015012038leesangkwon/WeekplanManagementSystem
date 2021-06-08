package Manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import WeekPlan.ComprehensivedesignReport;
import WeekPlan.Etc;
import WeekPlan.MaterialmechanicsHomwork;
import WeekPlan.OOP;
import WeekPlan.Weekplan;
import WeekPlan.Weekplanfind;
import WeekPlan.Weekplaninput;

public class WeekPlanManager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8469621747413754917L;
	
	ArrayList<Weekplaninput> weekplans = new ArrayList<Weekplaninput>();
	transient Scanner input;
	WeekPlanManager(Scanner input){
		this.input = input;
		
	}
	public void addWeekplan(int weeknum, String sdate, String plan, String edate) {
		Weekplaninput weekplaninput = new OOP(Weekplanfind.OOPHomework);
		weekplaninput.getUserInput(input);
		weekplans.add(weekplaninput);
	}
	public void addWeekplan(Weekplaninput winput) {
		Weekplaninput weekplaninput = new OOP(Weekplanfind.OOPHomework);
		weekplaninput.getUserInput(input);
		weekplans.add(weekplaninput);
	}
	public void addWeekplan() {	
		int kind =0;
		Weekplaninput weekplaninput;
		while(kind!=1 && kind !=2 && kind !=3 && kind!=4) {
			try {
			showmenu();
			
			kind = input.nextInt();
			if(kind ==1) {
				weekplaninput = new OOP(Weekplanfind.OOPHomework);
				weekplaninput.getUserInput(input);
				weekplans.add(weekplaninput);
				break;
				
			}
			else if(kind ==2) {
				weekplaninput = new MaterialmechanicsHomwork(Weekplanfind.MaterialmechanicsHomwork);
				weekplaninput.getUserInput(input);
				weekplans.add(weekplaninput);
				break;
			}
			else if(kind ==3) {
				weekplaninput =new ComprehensivedesignReport(Weekplanfind.ComprehensivedesignReport);
				weekplaninput.getUserInput(input);
				weekplans.add(weekplaninput);
				break;
			}
			else if(kind ==4) {
				weekplaninput =  new Etc(Weekplanfind.etc);
				weekplaninput.getUserInput(input);
				weekplans.add(weekplaninput);
				break;
			}
			else {
				System.out.print("Select Week Plan Kind between 1 and 4 : ");
			}
		}
		
		catch(InputMismatchException e) {
			System.out.println("Please put an Integer between 1and 4!");
			if(input.hasNext()) {
				input.next();
			}
			kind = -1;
		}
	}
}
	public void deleteWeekplan() {
		
//		System.out.print("Which day plan delete? : ");
//		String deletedayweekplan = input.next();
		System.out.print("What delete Week Plan number ? : ");
		int deleteweeknum = input.nextInt();
		int index= findindex(deleteweeknum);
		removefromWeekplan(index, deleteweeknum);
		
	}
	
	public int findindex(int deleteweeknum) {
		int index=-1;
		for(int i=0; i<weekplans.size(); i++) {
			if(weekplans.get(i).getWeeknum() == deleteweeknum) {
				index = i;
				break;
			
			}
		}
		return index;
		
	}
	public int removefromWeekplan(int index, int deleteweeknum) {
		if(index>=0) {
			weekplans.remove(index);
		    System.out.println("The week plan Number "+deleteweeknum+" is deleted!");
		    return 1;
		}
		else {
			System.out.println("This week plan has not been registered.");
			return -1;
		}
	}
	public void viewWeekplans() {
		
//		System.out.print("Which day plan View? : ");
//		String viewdayweekplan = input.next();
//		System.out.print("which Week plan want to view? : ");
//		String viewweekplan = input.next();
		for(int i=0; i<weekplans.size(); i++) {
			weekplans.get(i).printInfo();
		}
								
		
	}
	public void EditWeekplan() {
			
		System.out.print("Week plan number : ");
		int editweekplannum = input.nextInt();
		for(int i =0; i<weekplans.size(); i++) {
			
			Weekplaninput weekplaninput = weekplans.get(i);
			if(weekplans.get(i).getWeeknum() == editweekplannum) {	
				int num =-1;
				while(num !=4) {	
					showeditmenu();
					
					num = input.nextInt();
					switch(num) {
					case 1:
						setweeksdate(weekplaninput, input);
						break;
					case 2:
						setweekplans(weekplaninput, input);
						break;
					case 3:
						setweekedate(weekplaninput, input);
						break;
					case 4:
						System.out.println("Exit");
						break;
					default :
						continue;
						
					
					}
					}
			}
		}
		
		
	}
	public void showmenu() {
		System.out.println("1 for OOP Homework");
		System.out.println("2 for Material Mechanics Homwork");
		System.out.println("3 for Comprehensive design Report");
		System.out.println("4 for etc.(개인 자격증 공부, 관리비납부등) ");
		System.out.print("Select Week Plan Kind between1 and 4 : ");
		
	}
	public void showeditmenu() {
		System.out.println("1.Edit start date ");
		System.out.println("2.Edit week plan ");					
		System.out.println("3.Edit end date ");					
		System.out.println("4.EXit ");
		System.out.print("select one number between 1-4:");
		
	}
	public void setweeksdate(Weekplaninput sdate, Scanner input) {
		System.out.print("Start date :");
		int sdates = input.nextInt();
		sdate.setSdate(sdates);
		
	}
	public void setweekplans(Weekplaninput plan, Scanner input) {
		System.out.print("Week plan : ");
		String weekplan1 = input.next();
		plan.setWeekplan(weekplan1);
		
	}
	public void setweekedate(Weekplaninput edate, Scanner input) {
		System.out.print("End plan :");
		int edates = input.nextInt();
		edate.setEdate(edates);
		
	}
	public int size() {
		return weekplans.size();
	}
	public Weekplaninput get(int index) {
		return (Weekplan) weekplans.get(index);
	}


}

