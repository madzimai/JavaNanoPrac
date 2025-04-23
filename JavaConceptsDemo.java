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

//=== Exception Handling ===
	public void devide(int a, intb) {
	try {
		int result = a/b;
		System.out.println("Result: " + result);

	}catch (ArithmeticException e) {
		System.out.println("Error: Divison by zero");

		}

	}
public static void main(String[] args) {
	
	JavaConceptsDemo demo = new JavaConceptsDemo();

//=== Decision connstructs + operators ===
	if(demo.isActive && demo.id > 100) {
		System.out.println("Active ID");
		}
// === Loops + arrays ===
	System.out.println("Scores:");
	for (int score : demo.scores){
		System.out.println(score);
		}

	}
}
