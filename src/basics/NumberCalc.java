package basics;

public class NumberCalc {

	public static void main(String[] args) {
		
		printName();
		int numa = 10;
		int numb = 20;
		addNumber(numa, numb);
	int product	= multiplyNumber(numa, numb);
	System.out.println("The product is " + product);
		
	}
	static void printName() {
		
		System.out.println("My name is Sagun");
	}
	
	static void addNumber(int numbera, int numberb) {
		
		int sum = numbera + numberb;
		System.out.println("sum is " + sum);
		
		
	}
	
	static int multiplyNumber(int numa, int numb) {
		
		int product = numa * numb ;
		return product;
	}

}
