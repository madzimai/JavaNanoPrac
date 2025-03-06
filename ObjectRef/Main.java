class Person{
	String name;	

	}

class TestClass {
	void modify(Person p) {
	p.name = "Updated";
	
	}


}

public class Main {
	public static void main(String[] args) {
		Person per = new Person();
		per.name = "Original name";

		TestClass obj = new TestClass();
		obj.modify(per);
		System.out.println(per.name);
}
	}
