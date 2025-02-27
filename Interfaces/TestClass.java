interface A {
	default void hello(){
		System.out.println("Interface A");

	}

}
interface B extends A {

	default  void hello(){

		A.super.hello();
	}
}

public class TestClass implements B {
	 public void hello(){
                        B.super.hello();
                }
                  
	public static void main(String[] args) {

	A a = new TestClass();
	a.hello();

	}

}
