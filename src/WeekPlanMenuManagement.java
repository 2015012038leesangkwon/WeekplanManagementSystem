import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekPlanMenuManagement {
	public static void main(String[]args) {		
			
		Scanner input = new Scanner(System.in);
		WeekPlanManager weekplanmanager = new WeekPlanManager(input);
		
		selectmenu(input, weekplanmanager);

	}
	public static void selectmenu(Scanner input, WeekPlanManager weekplanmanager) {
		int num =-1;
		
		while(num !=5) {	
		try {
		showmenu();
		num = input.nextInt();
		switch(num) {
		case 1:
			weekplanmanager.addWeekplan();
			
			break;
		case 2:
			weekplanmanager.deleteWeekplan();
			break;
			
		case 3:
			weekplanmanager.viewWeekplans();
			break;
		case 4:
			weekplanmanager.EditWeekplan();
			break;
		case 5:
			System.out.println("Exit");
			break;
		default :
			System.out.println("ERROR!!!!");
			continue;
			
			
		
				}
			}
		catch(InputMismatchException e) {
			System.out.println("Please put an Integer between 1and 5!");
			if(input.hasNext()) {
				input.next();
			}
			num = -1;
			
		}
		}		
	}
	public static void showmenu() {
		System.out.println("1.Add Weekly Plan ");
		System.out.println("2.Delete Weekly Plan ");
		System.out.println("3.View Weekly Plans ");
		System.out.println("4.Edit Weekly Plan ");
		System.out.println("5.EXit ");
		System.out.print("select one number between 1-5:");
		
	}
	




}
