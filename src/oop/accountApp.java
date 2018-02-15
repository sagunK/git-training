package oop;

public class accountApp {

	public static void main(String[] args) {

		loanAccount la = new loanAccount();
		la.increaseRate();
		la.setRate();
		la.setSchedule();
		la.setTerm(20);
		
		
		// polymorphism changes where we are pointing
		iRate account1 = new loanAccount();
		account1.increaseRate();
		account1.setRate();
		
	}

}
