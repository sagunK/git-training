package oop;

class person {
	
	String name;
	String email;
	String number;
	
	
	void walk() {
		
		System.out.println(name + " is walking");
	}
	
	void eat() {
		
		System.out.println(email);
		
	}
	
	void sleep() {
		
		System.out.println(name + " is sleeping");
		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiating an object
		person person1 = new person();
		
		// Defined properties
		person1.name = "Joe";
		person1.email = "Joe@gmail.com";
		person1.number = "123456789";
		
		//Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		person person2 = new person();
		person2.name = "Sara";
		
		person2.sleep();
		
/*		String name = "Joe";
		String email = "Joe@gmail.com";
		String phone = "123456789";
		
		//Action, Activity , behaviour
		walking(name);
		System.out.println(name + " is walking");
		System.out.println(name + " is eating");
	}

	static void walking(String name) {
		
		System.out.println(name + " is walking");
*/
	}

}
