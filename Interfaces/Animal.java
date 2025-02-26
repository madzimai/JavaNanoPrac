interface Jumpable{
	int MIN_DISTANCE  = 10;
	abstract String currentPosition();
	static int maxDist(){
		return 100;
	}
}
interface Moveable{
	String MIN_DISTANCE = "small";
	abstract String currentPosition();
	static String maxDist(){ 
                return "forest";
        }
}
 class Animal implements Jumpable, Moveable {
	Animal(){
		System.out.println(Jumpable.MIN_DISTANCE);
	
	}

	 public String currentPosition() {
        	return "Home";
    }

	static String maxDist(){
		return "to me";

	}	
}
