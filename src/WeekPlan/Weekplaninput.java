package WeekPlan;

import java.util.Scanner;



public interface Weekplaninput {
	
public void getUserInput(Scanner input);
	
	public int getWeeknum();
	public int getSdate();
	public String getWeekplan();
	public int getEdate();
	
	public void setSdate(int sdate);
	
	public void setWeekplan(String weekplan);
	
	public void setEdate(int edate);
	
	public void printInfo();
	
	
	

}
