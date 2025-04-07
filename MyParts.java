public class MyParts {
	public static int x = 7;
	public int y = 5;

	public static void main (String[] args){
	MyParts a = new MyParts();

	MyParts b = new MyParts();
	a.y = 5;
	b.y = 6;
	MyParts.x = 1;
	MyParts.x = 2;
//	x = 4;
//	y = 2;cannot be referenced in a static context.
//The last value asigned to a static variable is shared across all instances.

	System.out.println("a.y = " + a.y); 
	System.out.println("b.y = " + b.y); 
	System.out.println("a.x = " + a.x); 
	System.out.println("b.x = " + x);
	System.out.println("MyParts.x = " + MyParts.x); 
	

	}

}
