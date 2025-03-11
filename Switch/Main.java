public class Main {
	public static void main(String[] args) {
	Rectangle rectangle = new Rectangle(5);
	System.out.println("," +rectangle.hasEdges());


	}


}

class Shape {
	public Shape() {
	System.out.println("Shape");
	}
	public Shape(int edge) { 
        System.out.println("ShapeEdge");
	}
	private boolean hasEdges() {
	return false;
	}
	

}

class Rectangle extends Shape {
	public Rectangle (int age){
	System.out.println("Rectangle");

	}
	public boolean hasEdges() {
	return true;

	}
}
