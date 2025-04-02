import java.security.SecureRandom;

public  class Day001 {
	public static final SecureRandom SECURE_RANDOM = new SecureRandom();
	
	public static void main(String[] args) {
	System.out.println("Generating a number between 20 and 100...");
	System.out.println(randomNumberBetween(20, 100));
	}

	private static int randomNumberBetween(int minimum, int maximum) {
		return SECURE_RANDOM.nextInt(maximum - minimum) + minimum;

	}

}
