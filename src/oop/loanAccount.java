package oop;

public class loanAccount implements iRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	
	public void setTerm(int term){
		
		System.out.println("Setting the term into " + term + " years ");
	}
	
	public void setSchedule() {
		
		System.out.println("Amortization Schedule");
	}

}
