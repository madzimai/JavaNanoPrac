public class ReferenceVsPrimitive {
	public static void main(String[] args) {
	int num1 = 5;   // Primitive variable stores actual value
        int num2 = num1; // Copy value
        num2 = 10; 
        
        String text1 = "Hello";  // Reference variable stores address
        String text2 = text1;     // Both refer to same object
        text2 = "World";  // text2 now refers to a different object
        
        System.out.println("num1: " + num1 + ", num2: " + num2);
        System.out.println("text1: " + text1 + ", text2: " + text2);


	}


}
