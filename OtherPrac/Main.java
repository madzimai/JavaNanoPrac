import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Today is   ");
	String today = scan.nextLine();
	System.out.println("Today is  " + today);
	System.out.println("Names of the cars ");
	String[]  cars = new String [3];
	cars[0] = scan.nextLine();
	cars[1] = scan.nextLine();
	cars[2] = scan.nextLine();
	
	System.out.println("List of cars");
	for(int i = 0,j=1; i< cars.length && j<3;i++){
	System.out.println(j + cars[i]);
	j++;
	System.out.println();
	}
	
	}

}
