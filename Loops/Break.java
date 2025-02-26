public class Break{
	public static void main(String[] args){

	String[] programmers = {"Outer", "Inner"};
 	String[] programmers2 = {"Oute2r", "2Inner"};
		for (String outer : programmers) {
    			for (String inner : programmers2) {
        	if (inner.equals("2Inner"))
            break;
        System.out.print(inner + ":");
    }
}

	}


}
