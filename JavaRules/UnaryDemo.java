public class UnaryDemo {
	public static void main(String[] args){

	int result = +1;
	
	System.out.println(result);
	
	 result--;
	
	System.out.println(result);

	 result++;
	
	System.out.println(result);

	 result = - result;

	System.out.println(result);

	int i = 3;
	
	i++;
	System.out.println(i);


	++i;

	System.out.println(i);

	System.out.println(++i);

	System.out.println(i++);

	System.out.println(i);

	int value1 = 1;
	int value2 = 2;


	if((value1 == 1) && (value2 == 2))
                System.out.println("value1 is 1 AND value2 is 2");
	if((value1 ==1) && (value2 == 1))
		System.out.println("value1 is 1 AND value2 is 1");
	if((value1 == 1) || (value2 == 1))
		System.out.println("value1 is 1 OR value2 is 1");
	if((value1 == 2) && (value2 == 1))
                System.out.println("value1 is 2 OR value2 is 1");

}


}
