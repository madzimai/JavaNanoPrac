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
		int i,k, j;
		i=k=j=100;
		System.out.println(i + j + k);
		Person per = new Person();
		per.name = "Original name";

		TestClass obj = new TestClass();
		obj.modify(per);
		System.out.println(per.name);
}
	}
