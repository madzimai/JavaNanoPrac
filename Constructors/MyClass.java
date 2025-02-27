//Default constructor only generated when there is no other present constructor

class Dog{
	public int age;
	public String name;


	public Dog(String name, int age){
	this.name =  name;
	this.age = age;

	}
}

class Person {
protected String name;
}
//make private constructor and create instance using static methods

class Animal {
	static int num;
	static  String type;

    	private Animal(int num, String type) {
	 Animal.num = num;
	Animal.type = type;

	}
	  // Static factory method to create an instance
    	public static Animal createInstance(int num, String type) {
        return new Animal(num, type);
       }
	public static String took() {
		return num+"  " + type;
	}

}
public class MyClass {
	public static void main(String[] args) {

	Dog d = new Dog("Bingo ", 9);
	//Dog e = new Dog (); no arguement not found
	Person n =new Person();
	
	// Creating an Animal instance using static method
        Animal ani = Animal.createInstance(2, "Mammal");

        // Calling the static method correctly
        String result = Animal.took();
        System.out.println(result);

	}

}
