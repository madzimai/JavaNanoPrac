public class DataTypes {
	public static void main (String[] args) {

	int myInt = 12;
	double myDouble = 5.2;
	char myChar = 'a';

	//Implicit casting (smaller to larger type)
	double result = myInt;
	
	// Explicit casting (larger to smaller type)
	int newInt = (int) myDouble;
	int charInt = myChar;
	System.out.println(charInt);
	System.out.println("Casted into double  " + result);
	System.out.println("Casted into int  " + newInt);



	}

}
