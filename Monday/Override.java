class Meme{
	protected int getOne(){
		return 20;
	}		
	
	private String getName(){
		return "Meme class";
	}	
}

public class Override extends Meme {
	protected int getOne(){
		return super.getOne() +70;
	}
	private String getName (){
		return "Override class";
	}

	public static void main (String[] args){
		System.out.println(new Override().getOne());
		System.out.println(new Meme().getOne());
		System.out.println(new Override().getName());
	}

}
