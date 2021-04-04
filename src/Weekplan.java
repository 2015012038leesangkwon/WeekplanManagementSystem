
public class Weekplan {
	String sdate;
	String weekplan;
	String edate;
	public Weekplan(){
		
	}
	
	public Weekplan(String sdate, String weekplan, String edate) {
		this.sdate = sdate;
		this.weekplan = weekplan;
		this.edate = edate;
	}


	public void printInfo() {
		System.out.println( "Week plan : "+ weekplan+ "Week date : " + sdate + "End date : " + edate);
	}
	

}
