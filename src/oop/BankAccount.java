package oop;

public class BankAccount implements iRate{
	
	// Define variables
	String accountnumber;
	
	// static belongs to the class not to the object
	// final >> constant (often static final)
	static final String routingnumber = "1111";
	private String name;
	private String ssn;
	String accounttype;
	double balance; 
	
	//Constructor definition: unique methods
		//1. to define/setup/ initialize of an object
		//2. Constructors are implicitly called upon instantiation
		//3. The same name as the class itself
		//4. No return type at all
	
	
	BankAccount() {
		
		System.out.println("New account created");
	}
	
	//Overloading : call same method name with diff arguments
	
	BankAccount(String accounttype) {
		
		System.out.println("BankAccount type is " + accounttype);
		
	}
	
	BankAccount(String accounttype, double deposit) {
		
		System.out.println("BankAccount type is " + accounttype + " with deposit " + deposit);
	}
	
	
	
	// Getter and setters
	//Allow the user to define the name
	// hide the variables , making them private and using methods to
	// send data 
	
	public void setName(String name){
		
		this.name = "Mr. " + name;
		
	}
	
	public String getName() {
		
		return name;
		
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSSN(){
		return ssn;
	}
	
	
	//interface methods
	
	public void setRate() {
		
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		
		System.out.println("Increased Rate");
		
	}
	
	
	// Define Methods
	public void deposit(double amount){
		
		balance = balance + amount;
		showActivity(" Deposit ");
	}
	
	public void withdraw(double amount) {
		
		balance = balance + amount;
		showActivity(" WithDraw ");
		
	}
	
	//Private can only be called from within class
	private void showActivity(String Activity) {
		
		System.out.println("Your recent transaction: " + Activity);
		System.out.println("your balance: " + balance);
	}
	
	
	
	void checkBalance(){
		
	}
	
	void getstatus() {
		
	}
	
	@Override
	public String toString() {
		
		return "Name: " + name + ". ACCOUNT #" + accountnumber + ". ROUTING #" + routingnumber + " Balance: $ " + balance;
	}

}
