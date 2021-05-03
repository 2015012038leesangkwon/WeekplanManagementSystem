import java.util.ArrayList;
import java.util.Scanner;

import WeekPlan.ComprehensivedesignReport;
import WeekPlan.Etc;
import WeekPlan.MaterialmechanicsHomwork;
import WeekPlan.OOP;
import WeekPlan.Weekplan;
import WeekPlan.Weekplanfind;
import WeekPlan.Weekplaninput;

public class WeekPlanManager {
	ArrayList<Weekplaninput> weekplans = new ArrayList<Weekplaninput>();
	Scanner input;
	WeekPlanManager(Scanner input){
		this.input = input;
		
	}
	public void addWeekplan() {	
		int kind =0;
		Weekplaninput weekplaninput;
		while(kind!=1 && kind !=2 && kind !=3 && kind!=4) {
			System.out.println("1 for OOP Homework");
			System.out.println("2 for Material Mechanics Homwork");
			System.out.println("3 for Comprehensive design Report");
			System.out.println("4 for etc.(개인 자격증 공부, 관리비납부등) ");
			System.out.print("Select Week Plan Kind between1 and 4 : ");
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
	}
	public void deleteWeekplan() {
		
//		System.out.print("Which day plan delete? : ");
//		String deletedayweekplan = input.next();
		System.out.print("What delete Week Plan number ? : ");
		int deleteweeknum = input.nextInt();
		int index=-1;
		for(int i=0; i<weekplans.size(); i++) {
			if(weekplans.get(i).getWeeknum() == deleteweeknum) {
				index = i;
				break;
				
			}
		}
		if(index>=0) {
			weekplans.remove(index);
		System.out.println("The week plan Number "+deleteweeknum+" is deleted!");
		}
		else {
			System.out.println("This week plan has not been registered.");
			return;
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
					
					System.out.println("1.Edit start date ");
					System.out.println("2.Edit week plan ");					
					System.out.println("3.Edit end date ");					
					System.out.println("4.EXit ");
					System.out.print("select one number between 1-4:");
					num = input.nextInt();
									
					if(num == 1){
						System.out.print("Start date :");
						int sdates = input.nextInt();
						weekplaninput.setSdate(sdates);
					}
						
					else if(num == 2) {
						System.out.print("Week plan : ");
						String weekplan1 = input.next();
						weekplaninput.setWeekplan(weekplan1);
					}					
					else if(num ==3) {						
						System.out.print("End plan :");
						int edates = input.nextInt();
						weekplaninput.setEdate(edates);
					}
					else if(num ==4) {
						System.out.println("Exit");
					}
					else {
						continue;
					}
					
						
						
					
					}
			}
		}
		
		
	}


}

