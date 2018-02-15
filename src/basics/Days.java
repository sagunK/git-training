package basics;

public class Days {
	
	public static void main (String[] args) {
	// Different block of codes based on value of condition
		
		String DaysOfWeek = "Tuesday";
		
		switch (DaysOfWeek) {
		case "Monday" : 
			System.out.println("Today is monday");
			break;
		case "Tuesday" : 
			System.out.println("Today is tuesday");
			break;
		case "wednesday" : 
			System.out.println("Today is wednesday");
			break;
		case "friday" : 
			System.out.println("Today is friday");
			break;
		case "Thursday" : 
			System.out.println("Today is thursday");
			break;
		default: System.out.println("error!");
		
		}
		
		
	}

}
