public class ReferenceTest{
	public static void modifyRef(Person p){
		p.setAge(p.getAge() +5);//Modify the object's age
		p.setName("Lucky ");
		System.out.println("Inside method: " + p.getAge());

	}

	public static void reassignPer(Person p){
	p = new Person("Mitchell ", 22);
	System.out.println("in method: " +p.getName());
	System.out.println(p.height +5);	
	System.out.println("in method: " +p.getAge());
	}
	

	public static void main(String[] args) {
		Person person = new Person("Kudzai", 25);
		System.out.println("Before method " + person.getAge());
		System.out.println("Static height:  " + person.height);
		
		modifyRef(person);
		reassignPer(person);
		System.out.println("Static height after:  " + person.height);	
		System.out.println("After method: " + person.getAge()); // ✅ Shows modified age
        	System.out.println("Final name: " + person.getName()); 

	}

}
