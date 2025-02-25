class Primate{
	public Primate(){
	String name = "Netsai".concat("Chyakaka").trim();
		System.out.println("Primate" +name);
	}
}

class Ape extends Primate {
	public Ape() {
		System.out.println("Age");
	}

}

public class Chimpanzee extends Ape {
	public static void main(String[] args){
		new Chimpanzee();
	}

}
