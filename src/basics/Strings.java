package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bookTitle;
		String wordChoice = "Rings";
		
		bookTitle = "The lord of the Rings";
		
		if (bookTitle.contains("Rings")) {
			
			System.out.println("The Book contains the word Rings");
		}
		
		if (bookTitle.contains(wordChoice)) {
			
			System.out.println("The book contains word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Tie";
		String secondName = "Short";
		
		System.out.println(firstName.substring(0, 1) + secondName.substring(0,1));
	}

}
