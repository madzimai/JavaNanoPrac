import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortStudent {
	public static void sortByAge(ArrayList<Student> studs) { 
	Collections.sort(studs, Comparator.comparingDouble(Student::getGrade));

	System.out.println("\nStudents sorted by grade(ascending): ");

	for(Student stud : studs) {
		System.out.println(stud.getName() +",Age: "+ stud.getAge()
		+" Grade: "+stud.getGrade());

		}

	}


	public static void sortByAlphabet(ArrayList<Student> sts){
	
	Collections.sort(sts, Comparator.comparing(Student::getName));

	System.out.println("\nStudents sorted by name (A-Z): ");

	for(Student st : sts) {
	System.out.println(st.getName() + ", Age: "+st.getAge() + ", Grade: " + st.getGrade());

		}

	}


	public static void topStudent(ArrayList<Student> tops) { 
	Student top =	Collections.max(tops, Comparator.comparingDouble(Student::getGrade));

	System.out.println("\n Top Student: ");
	System.out.println(top.getName() +  "  You're amaizing !!");
	} 

	public static void main (String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Grace", 23, 54.0));
		students.add(new Student("Mamo", 28, 64.0));
		students.add(new Student("Linna", 33, 77.9));
		students.add(new Student("Traace", 23, 54.0));


		sortByAge(students);

		sortByAlphabet(students);

		topStudent(students);
	}


}
