public class OperatorTest {
	static boolean a;
	static boolean b;
	static boolean c;
	public static void main (String [] args) {
		boolean bool = (a = true) || (b = true) && (c = true);
		System.out.println(a +", "+ b+", "+c);
		boolean booll = (a = true) | (b = true) & (c = true);
                System.out.println(a +", "+ b+", "+c);


	}

}
