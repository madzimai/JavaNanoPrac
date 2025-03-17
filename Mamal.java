 class Animal{
	public String name;

	public Animal(){

		name = "Big Dog";
		}

		public void eat(){

		System.out.println("Eating is important"+ name);
	}
	
	protected void walk(){

		System.out.print("Always walk");
	}

}



public class Mamal extends Animal {
	public String name;
	public Mamal(){
	super();
	this.name = "Small Dg";
	}

		@Override
		public void eat(){
			super.eat();
			System.out.println("Chew befor you swallow");
		}

		@Override
		public void walk (){
		System.out.println("Walk very fast");
	}
	

	public static void main(String[] args) {

		Animal a = new Mamal();
		Mamal b = new Mamal();
		Animal c =new  Mamal();

		a.eat();
		System.out.println(a.name);
		b.eat();
		c.walk();
		

	}
}


