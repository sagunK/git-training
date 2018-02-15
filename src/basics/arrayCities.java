package basics;

public class arrayCities {

	public static void main(String[] args) {
	// Declare and define arrays
		
	for (int i = 0; i < 4; i++) {
		
		String[] cities = {"New York", "San Francisco", "Miami", "dallas"};
		System.out.println(cities[i]);
/*		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
*/
	}
		//Declare the array
		
		String[] states = new String[5];
		states[0] = "Bagmati";
		states[1] = "Narayani";
		states[2] = "Gandaki";
		states[3] = "Dhaulagiri";
		states[4] = "koshi";
		int i = 0;
		do {
		System.out.println(states[i]);
		i++;
		} while (i<5);
		
		

	}

}
