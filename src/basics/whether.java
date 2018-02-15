package basics;

public class whether {
	public static void main(String[] args) {

	//This program will give suggestions of what to wear base on weather (temperature)
	
		int temperature = 65;
		String suncondition = "overcast";
		
		if (temperature > 80) {
			
			System.out.println("its a pleasant. wear shorts");
		}
		else if ((temperature > 60) && (suncondition == "sunny")) {
			System.out.println("little cooler. wear jacker");
			System.out.println("wear hat to prevent sunburn");
		}
		else if ((temperature > 50) || (suncondition == "overcast")) {
			System.out.println("cool day. wear full clothes");
			
		}
		else {
			System.out.println("cold. wear sweater jacket and everything");
			
		}
		
	}

}
