public class TestClass {
	public static void main (String[] args) {
	String ta = "A";
	ta = ta.concat("B");
	String tb = "C";
	ta = ta.concat(tb);
	ta.replace('C','D');
	ta = ta.concat(tb);
	System.out.println(ta);
	String str = " ";
	str.trim();
	System.out.println(str.equals("")+" "+str.isEmpty());
				
	}



}
