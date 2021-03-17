import java.util.Scanner;

public class WeekPlanMenuManagement {
	public static void main(String[]args) {
		int num =0;
		Scanner input = new Scanner(System.in);
		
		while(num !=4) {	
		System.out.println("1.Add WeekPlan ");
		System.out.println("2.Delete WeekPlan ");
		System.out.println("3.View WeekPlan ");
		System.out.println("4.Exit ");
		System.out.print("select one number between 1-4: ");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.print("Week date : ");
		    String weekdate = input.next();
			System.out.print("Week plan : ");
			String weekplan = input.next();
			System.out.print("∏∂∞®¿œ : ");
		    String enddate = input.next();
			break;
		case 2:
			System.out.print("which Week plan delete? : ");
			String deleteweekplan = input.next();
			break;
			
		case 3:
			System.out.print("which Week plan want to view? : ");
			String viewweekplan = input.next();
			break;
		case 4:
			System.out.print("Exit");
			break;
			
		default :
			System.out.println("ERROR!!!!");
			break;
			
			
		
		}
		}
	}


}
