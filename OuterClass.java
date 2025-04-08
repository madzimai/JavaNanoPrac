public class OuterClass {
	public String name = "Outer class name";
	static String  staticField = "Static outer field";


	class Inner {
	
	void accessOuter(){
	System.out.println(name);
	System.out.println(staticField);

		}
	}

	static class StaticInner {
		void accessField (OuterClass outer){
		System.out.println(outer.name);
		System.out.println(staticField);
		
		}
		
	}

	public static void main(String[] args){
		System.out.println("\nInner class");
		System.out.println("888888888888");
		OuterClass outerOb = new OuterClass();
		OuterClass.Inner inner = outerOb.new Inner();
		inner.accessOuter();


		System.out.println("\nStatic Inner class");
		System.out.println("+++++++");
		StaticInner staticOb = new StaticInner();
		staticOb.accessField(outerOb);

		
		System.out.println("\nTop level class");
		 System.out.println("%%%%%%%%%%");
		TopLevel top = new TopLevel();
		top.display(outerOb);
	}


	
}

 class TopLevel {
	void display(OuterClass outer) {
	System.out.println(outer.name);
	System.out.println(OuterClass.staticField);
	

	}


}
