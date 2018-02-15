package javaProject;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("213458997", 1000);
		BankAccount acc2 = new BankAccount("233458998", 2000);
		BankAccount acc3 = new BankAccount("243458999", 3000);
		
		acc1.setName("Sushan");
		System.out.println(acc1.getName());
		acc1.makeDeposit(1000);
		acc1.makeDeposit(1000);
		acc1.payBill(1500);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}

}

 class BankAccount implements IInterest{
	 
	 // properties of bank account
	 
	private static int id = 1000; 				//internal ID
	private String accountNumber;	//ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "00454001";
	private String name;
	private String SSN;
	private double balance;
	
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		id++;
		setAccountNumber();
	}
	 
	private void setAccountNumber() {
		
		int random = (int) (Math.random() * 100);
		accountNumber = id + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number:" + accountNumber);
	}
	

	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void payBill(double amount) {
		
		balance  = balance - amount;
		System.out.println("paying bill of " + amount);
		showBalance();
		
	}
	
	public void makeDeposit(double amount){
		
		balance = balance + amount;
		System.out.println("Making deposit of " + amount);
		showBalance();
	}
	
	public void showBalance() {
		
		System.out.println("Your current balance " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1+ rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		
		return "[Name: " + name + "]\n[AccountNumber: " + accountNumber + "]\n" + " [Routing Number: " + routingNumber + "\n [balance: " + balance + "]" ;  
	}
	
	
 }

