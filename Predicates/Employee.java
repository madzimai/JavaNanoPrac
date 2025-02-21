import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employ {
	String name;
	int salary;


	Employ(String name, int salary) {

	this.name = name;
	this.salary = salary;

	}


	@Override
	public String toString() {
	return name + "earns $" + salary;
	}

}
	public class Employee{
		public static void main(String[] args){

		List<Employ> employees = Arrays.asList(

		new Employ("Alice",5000),
		new Employ("Bob",3000),
		new Employ("Charlie",7000),
		new Employ("David",4000)

		);

	Predicate<Employ> highSalary = emp ->emp.salary > 4000;
	

	List<Employ> filteredEmployees = employees.stream()
						.filter(highSalary)
						.collect(Collectors.toList());
	System.out.println(filteredEmployees);
		



	}

}
