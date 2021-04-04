import java.util.Scanner;

public class WeekPlanMenuManagement {
	public static void main(String[]args) {		
			
		Scanner input = new Scanner(System.in);
		WeekPlanManager weekplanmanager = new WeekPlanManager(input);
		int num =-1;
		
		while(num !=5) {	
		System.out.println("1.Add Weekly Plan ");
		System.out.println("2.Delete Weekly Plan ");
		System.out.println("3.View Weekly Plan ");
		System.out.println("4.Edit Weekly Plan ");
		System.out.println("5.EXit ");
		System.out.print("select one number between 1-5:");
		num = input.nextInt();
		switch(num) {
		case 1:
			weekplanmanager.addWeekplan();
			
			break;
		case 2:
			weekplanmanager.deleteWeekplan();
			break;
			
		case 3:
			weekplanmanager.viewWeekplan();
			break;
		case 4:
			weekplanmanager.EditWeekplan();
			break;
		case 5:
			System.out.println("Exit");
			break;
		default :
			System.out.println("ERROR!!!!");
			break;
			
			
		
		}
		
		}
		

	}
	




}
