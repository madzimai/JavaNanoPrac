import java.util.*; // Java API(Collections, Scanner, etc.)
import java.util.function.Predicate; // For lambda

//====Inheritance ===
class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	void speak() {
		System.out.prinntln(name+ "makes a sound.");
	}
}

class Dog extends Animal {
	Dog(String name) {
		super(name);
	}

	@Override 
	void speak() {
		System.out.println(name + "barks.");
	}

}







}
