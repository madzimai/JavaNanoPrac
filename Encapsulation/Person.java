public class Person{
	private String name;
	private int age;
	public static int  height;

	static{
	height = 150;
	}

	public Person(){
		System.out.println("no-arguement constructor");
	}

	public Person (String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	
	public  void setName(String name){
		this.name = name;
	}

	protected  void setAge(int age){
		this.age = age;
	}

	public static void talk(){
		System.out.println("I am talking ...");
	}
	
	public void talk(String message) {
		System.out.println("I am saying: " + message);
	}
	@Override
	public Strint toString() {
		return "Person{name'" +name+ "', age=" +age+ ", height="+ height + "}";

	}

}

