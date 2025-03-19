import java.time.*;
import java.time.Period;
import java.time.Duration;

public class DateTime{

public static void main(String[] args){

StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

sb.insert (5 ,",");

sb.replace(0,5, "Hi");

sb.delete(3,5);
sb.reverse();
System.out.println(sb);
System.out.println();
String a =("kkk");

String abc = "".concat(a);

abc.concat("def");
System.out.println(abc);

 LocalDate date = LocalDate.now();  // Get current date
 LocalTime time = LocalTime.now();
 LocalDate futureDate = date.plus(Period.ofDays(10));  // ✅ Add 10 days
 LocalTime futureTime = time.plus(Duration.ofHours(5));  // ✅ Add 5 hours

System.out.println("10 days later: " + futureDate);
System.out.println("5 hours later: " + futureTime);

	}

}
