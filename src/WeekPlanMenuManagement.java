import java.util.Scanner;

public class WeekPlanMenuManagement {
	public static void main(String[]args) {		
		int num =0;
		Scanner input = new Scanner(System.in);
		
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
			addWeekplan();
			
			break;
		case 2:
			deleteWeekplan();
			break;
			
		case 3:
			viewWeekplan();
			break;
		case 4:
			EditWeekplan();
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
	public static void addWeekplan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Week date : ");
	    String weekdate = input.next();
		System.out.print("Week plan : ");
		String weekplan = input.next();
		System.out.print("When week plan end? : ");
	    String enddate = input.next();
		
	}
	public static void deleteWeekplan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which day plan delete? : ");
		String deletedayweekplan = input.next();
		System.out.print("What delete Week Plan ? : ");
		String deleteweekplan = input.next();
		
	}
	public static void viewWeekplan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which day plan View? : ");
		String viewdayweekplan = input.next();
		System.out.print("which Week plan want to view? : ");
		String viewweekplan = input.next();
	}
	public static void EditWeekplan() {
		Scanner input = new Scanner(System.in);
		System.out.print("Which day plan Edit? : ");
		String editdayweekplan = input.next();
		System.out.print("What edit Week Plan ? : ");
		String editweekplan = input.next();
		
	}





}
