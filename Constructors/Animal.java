class Gorilla {
	public int age;
	public String name;
public Gorilla(int age, String name) {
	super();
	this.age = age;
	 this.name = name;
}
public Gorilla(int age) {
	super();
		
	this.age = age;
	 this.name = null;
	} 
}
public  class Animal extends Gorilla {
	 public Animal(int age) {
		super(age,"Gorilla  ");

 }
	public Animal() {
	 super(5);
}

	 public static void main(String[] args){

		Animal n = new Animal(2);
		Gorilla c =new Animal(14);
		// do no compile Animal f  =  (Gorilla(Animal()));
		Gorilla nt = new Gorilla(9,"animal");
	System.out.println(n.name + n.age);
	System.out.println(nt.name);
	System.out.println(c.name + c.age);
}
 
 }

