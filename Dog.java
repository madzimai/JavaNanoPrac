abstract class Animal {
	public abstract void speak();

}

abstract class Mamal extends Animal {

	public abstract void walk();
}

public class Dog extends Mamal {
	@Override
	public void speak() {

	System.out.println("Wolf");
	}

	@Override
	public void walk(){
	System.out.println("Dog can walk");
	}
	
	public static void main(String[] args) {
	Dog dog = new Dog();
	dog.speak();
	dog.walk();
		



	}



}
