package oop;

public class BankAccountApp {

	public static void main(String[] args) {

	// Creating a new bank account >> instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountnumber = "22222";
//		acc1.name = "Roger Hunt";
		acc1.setName("Roger Hunt");
		acc1.setSSN("147852369");
		
		System.out.println(acc1.getName());
		System.out.println(acc1.getSSN());
		
		acc1.balance = 10000;
		
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.deposit(1000);
		acc1.withdraw(2000);
		System.out.println(acc1.toString());
		
		acc1.setRate();
		acc1.increaseRate();
		
		//polymorphism through overloading
		BankAccount acc2 = new BankAccount("checking");
		BankAccount acc3 = new BankAccount("saving", 10000);
	
		System.out.println(acc1.routingnumber);
		System.out.println(acc2.routingnumber);
		System.out.println(acc3.routingnumber);
		
		
		
		//Demo for inheritance
		
		CDClass cd1 = new CDClass();
		cd1.balance = 1000000;
		cd1.setName("Julia");
		cd1.getName();
		cd1.accountnumber = "333333";
		System.out.println(cd1.toString());
		cd1.compoundInterest();
		
	}

}
