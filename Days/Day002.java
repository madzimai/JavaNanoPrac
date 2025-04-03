import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Day002 {

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern
	("dd/MM/yyyy HH:mm:ss");

	public static void main(String[] args) {
	LocalDateTime  currentDateTime = LocalDateTime.now();
	String formattedDateTime = currentDateTime.format(FORMATTER);
	System.out.println(formattedDateTime);
	LocalDate date = LocalDate.of(2025,07,01);
	System.out.println(date);
	}



}
