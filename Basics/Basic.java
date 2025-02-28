import java.util.Scanner;


public class Basic {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name  ");
		String name = scanner.nextLine();

		System.out.println("Enter a number  ");
		int x = scanner.nextInt();

		System.out.println(name+"   "+x);

		scanner.close();






}

}
