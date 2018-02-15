package secondProject;

public class Lab2 {

	public static void main(String[] args) {
		
	 Student stu1 = new Student("Janice", "66666666"); 
//	 Student stu2 = new Student("Jasmine", "77777777"); 
//	 Student stu3 = new Student("Jesmith", "88888888"); 
	 
	 stu1.enroll("Math151");
	 stu1.enroll("English255");
	 stu1.enroll("Nepali257");
	 
//	 stu1.showCourses();
	 stu1.checkBalance();
	 stu1.pay(800);
	 stu1.checkBalance();
	 System.out.println("\n" + stu1.toString());

	}	

}


class Student {
	
	//properties
	private static int ID = 0;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String userId;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	private void setEmail() {
		
		email = name.toLowerCase() + "." + ID + "@fra-uas.de\n";
		System.out.println("Your email: " + email);
		
	}
	
	public String getEmail() {
		
		return email;
	}
	
	
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public Student(String name, String ssn) {
		
		ID++;
		this.name = name; 
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	
	
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max-min)));
		randNum = randNum + min;
		
		userId = ID + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userId);
		
	}
	
	public void enroll(String courses) {
		
		this.courses = this.courses + "\n" + courses;
		System.out.println(courses);
		balance = balance + costOfCourse;
		
	}
	
	
	public void pay(int amount) {
		
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
		
	}
	
	public void checkBalance() {
		
		System.out.println("Balance: $" + balance);
		
	}
	
	public void showCourses() {
		
		System.out.println(courses);
	}
	
	public String toString() {
		
		return "[Name: " + name + "]\n[Courses" + courses +  "]\n[ balance: " + balance + "]";
	}
	
	
}
