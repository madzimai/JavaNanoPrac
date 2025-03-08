import java.util.Optional;

public class OptionalDemo {
 public static void main (String[] args){
	String email = null;
	String emailof = "hellonetsai@gmail.com";
	//of , empty, ofNullable 
	Optional<Object> emptyOptional = Optional.empty();
	System.out.println(emptyOptional);

//	Optional<Object> emptyOptional1 = Optional.of(email);
//	System.out.println(emptyOptional1);

	Optional<Object> stringOptional = Optional.ofNullable(emailof);
	System.out.println(stringOptional);
		


	}




}
