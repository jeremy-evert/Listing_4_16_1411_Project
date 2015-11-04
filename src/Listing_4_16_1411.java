public class Listing_4_16_1411 {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		// A was 65
		// Z was 90
		// we want to start at 65 and go to 65 + 
		// a is 65
		// b is going to be 25
		// Copied from Brennon Cupp's previous work: work_class.java
		int number = (int)(65 + Math.random()*(25+1));
		System.out.println(number);
		char letter = (char)number;
		System.out.print(letter);
	}
}
