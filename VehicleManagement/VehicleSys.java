import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

abstract class Vehicle {

	public String name;

	public Vehicle(String name) {
		this.name = name;

	}

	abstract void move();

	public void displayInfo() {

		System.out.println("Details: " + name);
	}


	public abstract String toFileFormat();


}

class Car extends Vehicle { 

	public Car(String name){
		super(name);
	}

	@Override
	void move(){
	System.out.println(name + " is moving on the road.");

	}	

	public void honk() {
		System.out.println("Beep Beep car horn!");
	}


	@Override
	public String toFileFormat() {
		return "Car, " + name;
	}

}

class Boat extends Vehicle {
	public Boat(String name) {
		super(name);
	}


	@Override
	void move() {
		System.out.println(name + " is sailing on water.!");
	
	}

	public void anchor() {
		System.out.println(name + "is dropping the anchor.");
	}


	@Override
	public String toFileFormat() {
		return "Boat, " +name; 
	}

	
	interface Flyable {
    		void fly();

	}

}
class Plane extends Vehicle implements Flyable {

	public Plane(String name){
	super(name);
	}

	@Override
	public void move() {
		System.out.println(name + " is moving on the runway.");
	}

	@Override
	public void fly(){
		System.out.println(name +" is flying in the sky.");
	}


       @Override
       public String toFileFormat() {
        return "Plane," + name;
      }
}
public static void saveVehiclesTofile(ArrayList<Vehicle> vehicles) {
	try(FileWriter writer = new FileWriter("vehicle.txt")){
		for(Vehicle v : vehicles) {
		writer.write(v.toFileFormat() + "\n");
	}
	System.out.pritn.ln("\n Vehicles saved to vehicles.txt!");
	} catch (IOException e) {
		System.out.println("❌ Error saving vehicles: " + e.getMessage());
	}


}

public static ArrayList<Vehicle> loadVehiclesFromFile() {

		ArrayList<Vehicle> vehicles = new ArrayList<>();
		try(Scanner fileScanner = new Scanner(new file ("vehicle.txt"))) {

		while(fileScanner.hasNextLine()) {

		String line = fileScanner.nextLine();
		String[] data = line.split(",");

		String type = data[0];
		String name = data[1];

	switch (type) {
		case "Car":
			vehicles.add(new Car(name));
		break;
		case "Boat":
			vehicles.add(new Boat(name));
		break;
		case "Plane":
			vehicles.add(new Plane(name));
		break;
		default:
			System.out.println("❌ Unknown vehicle type: " + type);


	}


}
	 System.out.println("\n✅ Vehicles loaded from vehicles.txt!");
	}catch (IOException e) {

	System.out.println(" ❌ error loading vehicles:"+ e.getMessage());

}

return vehicles;


}

public class VehicleSys {
	public static void main(String[] args) {

	Scanner scan = Scanner(System.in);
	ArrayList<Vehicles> vehicles = new ArrayList<>(); 
	int numVehicles  = scan.nextInt();
	scan.nextLine();

	for (int i = 0;i < numVehicles;i++) {

	System.out.println("\n Enter details for Vehicle  " +(i +1) +":");
	System.out.println("Type (Car/Boat/Plane): ");
	String type = scan.nextLine();
	System.out.print("Name: ");
	String name = scan.nextLine();

	switch (type.toLowerCase()) {

		case "car":
			vehicles.add(new Car(name));
			break;
		case "boat":
			vehicles.add(new Boat(name));
			break;
		case "plane":
			vehicles.add(new Plane(name));
			break;
		default:
			System.out.println("❌ Invalid vehicle type! Skipping...");	


		}

	}

	saveVehiclesToFile(vehicles);

	ArrayList<Vehicle> loadVehicles = loadVehiclesFromFile();
	System.out.println("\n Vehicles loaded from file: ");
	for (Vehicle v : loadedVehicles){

	v.move();
	}
	scann.close();
}




}
