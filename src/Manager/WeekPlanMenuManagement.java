package Manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


import GUI.Windowframe;
import log.EventLogger;



public class WeekPlanMenuManagement {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[]args) {	
		
	
			
		Scanner input = new Scanner(System.in);
		WeekPlanManager weekplanmanager = getobject("weekplanmanager.ser");
		if(weekplanmanager == null) {
			weekplanmanager = new WeekPlanManager(input);
		}
				
		Windowframe wf = new Windowframe(weekplanmanager);
		selectmenu(input, weekplanmanager);
		putobject(weekplanmanager,"weekplanmanager.ser");

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
			logger.log("add Weekly Plan");
			break;
		case 2:
			weekplanmanager.deleteWeekplan();
			logger.log("delete Weekly Plan");
			break;
			
		case 3:
			weekplanmanager.viewWeekplans();
			logger.log("view Weekly Plan");
			break;
		case 4:
			weekplanmanager.EditWeekplan();
			logger.log("edit Weekly Plan");
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
	public static WeekPlanManager getobject(String filename) {
		WeekPlanManager weekplanmanager = null;
		
		
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			 weekplanmanager=(WeekPlanManager)in.readObject();
			 in.close();
			 file.close();
		} catch (FileNotFoundException e) {
			return weekplanmanager;
		}
		 catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return weekplanmanager;
	}
	public static void putobject(WeekPlanManager weekplanmanager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			 out.writeObject(weekplanmanager);
			 out.close();
			 file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	




}