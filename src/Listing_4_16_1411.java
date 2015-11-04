public class Listing_4_16_1411 {
	public static void main(String[] args) {
		
		// uppercase letters
		int startingValue = 65; // A was 65, our starting value
		int endingValue = 90 - 65 + 1; 	/*Z was 90
		* but Math.random excludes the upper limit, so we added one 
		* more to ensure it included Z in the possible outputs.*/
		
		/* Math.random example copied from Brennon Cupp's 
		 * previous work: work_class.java */
	
		System.out.println((char)(startingValue + Math.random()*(endingValue)));
	}
}
