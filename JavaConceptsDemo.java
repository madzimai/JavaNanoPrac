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
public class JavaConceptsDemo {

// === Data Types ===
	int id = 101;
	String message = "Java is awesome!";
	boolean isActive = true;

//===Arrays ====
	int[] scores = {85,90,78};

// === Encapsulation (private + getter) ===
	private String secret = "TopSecret";

	public String getSecret() {
		return secret;
	}

//=== Method ===

	public int add(int a, int b) {

		return a + b;
	}

}
