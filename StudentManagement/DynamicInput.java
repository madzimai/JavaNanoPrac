import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DynamicInput {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<>();


	System.out.println("Enter the number of students:  ");
	int numStudents = scan.nextInt();
	scan.nextLine();


	for(int i = 0; i < numStudents; i++) {
	System.out.println("\nn Enter details for Students  " + (i + 1) + ":");


	System.out.print("Name: ");
	String name = scan.nextLine();

	System.out.print("Age:  ");
	int age = scan.nextInt();

	System.out.print("Grade:  ");
	double grade = scan.nextDouble();

	students.add(new Student(name, age, grade));


	}

	Collections.sort(students, Comparator.comparing(Student::getName));
	System.out.println("\nStudents sorted by name (A-Z):  ");
	for (Student stud : students) { 
		System.out.println(stud.getName());
	}


	Student top = Collections.max(students, Comparator.comparingDouble(Student::getGrade));
	System.out.println("\n Top Student");
	System.out.println(top.getName());

	scan.close();



	}



}
