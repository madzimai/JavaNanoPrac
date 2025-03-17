import java.util.ArrayList;

abstract class Vehicle {
	public String name;

	public Vehicle(String name){
	this.name = name;
	}
		
	abstract void move();

	public void displayInfo() {
		System.out.println("Details:  "+ name);

	}

	
}

class Boat extends Vehicle {

	public Boat(String name){

	super( name);
	}

	@Override
	public void move(){
		System.out.println(name + "   is snailing on water");
	}

	
	public void anchor(){
		System.out.println(name + "  is dropping the anchor.");

	}	



}
interface Flyable {
	void fly();
}

class Plane extends Vehicle implements Flyable{

	public Plane (String name) {
		super( name);
	}
	@Override
	public void fly(){
	System.out.println(name + "  is moving in the runway.");
	
	}
	@Override
	public void move() {
	System.out.println(name + " is flying in ths sky");

	}

}

 class Car extends Vehicle {
	public Car(String name){
		super(name);
	}
	@Override
	public void move(){
		System.out.println (name +"  is moving on the road");
	}
	
	public void honk() {
		System.out.println("Beep Beep! Car horn!");


	}
}
public class VehicleManager {
	public static void main(String[] args) {
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add (new Car("Isuzu"));
		list.add (new Boat("Titanic"));
		list.add (new Plane ("Boeing 747"));

		for(Vehicle v : list){
		v.move();
		}
	
	if(list.get(0) instanceof Car) {
	
	((Car) list.get(0)).honk();
	}

	if(list.get(1) instanceof Boat) {
	((Boat) list.get(1)).anchor();
	}

	if(list.get(2) instanceof Plane){
	((Plane) list.get(2)).fly();
	}


		}	
		
}
