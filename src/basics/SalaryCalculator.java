package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
	//Lets create variable to define our career
	
	//declare a variable
	String career;
	System.out.println("Program is starting");
	
	//defined a variable
	career = "Software Developer";
	System.out.println("My career is: " + career);
	
	//Declare and Define
	int hoursperweek = 40;
	int weeksperyear = 52;
	double rate = 42.50;
	
	double salary = hoursperweek * weeksperyear * rate;
	
	System.out.println("My salary as a " + career + " at the rate of " + rate + " is " + salary + " per year.");
	
	
	//compute our annual salary
	// rate * hoursperweek * weekperYear
	
		
	}
}
