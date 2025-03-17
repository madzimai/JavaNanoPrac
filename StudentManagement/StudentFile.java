import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class StudentFile {
	public static void saveStudentsToFile(ArrayList<Student> students) {
   		 try (FileWriter writer = new FileWriter("students.txt")) {  // ✅ Open file for writing
        		for (Student stud : students) {
        	    writer.write(stud.getName() + "," + stud.getAge() + "," + stud.getGrade() + "\n");
        	}
        		System.out.println("\n✅ Student data saved to students.txt!");
    		} catch (IOException e) {
       			 System.out.println("❌ Error writing to file: " + e.getMessage());
    	}
}
	public static ArrayList<Student> loadStudentsFromFile() {
	    ArrayList<Student> students = new ArrayList<>();

    		try (Scanner fileScanner = new Scanner(new File("students.txt"))) {  // ✅ Open file for reading
        	while (fileScanner.hasNextLine()) {
           	 String line = fileScanner.nextLine();
           	 String[] data = line.split(",");  // ✅ Split CSV line

            	String name = data[0];
            	int age = Integer.parseInt(data[1]);
            	double grade = Double.parseDouble(data[2]);

           	 students.add(new Student(name, age, grade));  // ✅ Recreate Student object
        	}
        	System.out.println("\n✅ Student data loaded from students.txt!");
    	} catch (IOException e) {
        	System.out.println("❌ Error reading from file: " + e.getMessage());
    	}

    	return students;
}

	public static void deleteStudent(String studentName) {
    ArrayList<Student> students = loadStudentsFromFile(); // Load students from file
    boolean found = false;

    // Remove student with matching name
    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getName().equalsIgnoreCase(studentName)) {
            students.remove(i);
            found = true;
            break;
        }
    }

    // Save updated list back to file
    if (found) {
        saveStudentsToFile(students);
        System.out.println("\n✅ " + studentName + " has been removed from students.txt!");
    } else {
        System.out.println("\n❌ Student not found!");
    }
}

	public static void updateStudentGrade(String studentName, double newGrade) {
    ArrayList<Student> students = loadStudentsFromFile();
    boolean found = false;

    for (Student stud : students) {
        if (stud.getName().equalsIgnoreCase(studentName)) {
            stud.setGrade(newGrade); // Update grade
            found = true;
            break;
        }
    }

    // Save updated data back to file
    if (found) {
        saveStudentsToFile(students);
        System.out.println("\n✅ " + studentName + "'s grade has been updated to " + newGrade + "!");
    } else {
        System.out.println("\n❌ Student not found!");
    }
}


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    // Get user input for students
    System.out.print("Enter the number of students: ");
    int numStudents = scan.nextInt();
    scan.nextLine(); // Consume newline

    for (int i = 0; i < numStudents; i++) {
        System.out.println("\nEnter details for Student " + (i + 1) + ":");

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Age: ");
        int age = scan.nextInt();
        scan.nextLine(); // Consume newline

        System.out.print("Grade: ");
        double grade = scan.nextDouble();
        scan.nextLine(); // Consume newline

        students.add(new Student(name, age, grade));
    }

    //  Save students to file
    saveStudentsToFile(students);

    //  Load students from file
    ArrayList<Student> loadedStudents = loadStudentsFromFile();
    System.out.println("\nStudents loaded from file:");
    for (Student stud : loadedStudents) {
        System.out.println(stud.getName() + ", Age: " + stud.getAge() + ", Grade: " + stud.getGrade());
    }

   
    System.out.print("\nWould you like to (1) Delete a student, (2) Update a grade, or (3) Exit? ");
    int choice = scan.nextInt();
    scan.nextLine(); // Consume newline

    if (choice == 1) {
        System.out.print("\nEnter the name of the student to delete: ");
        String nameToDelete = scan.nextLine();
        deleteStudent(nameToDelete);

    } else if (choice == 2) {
        System.out.print("\nEnter the name of the student to update: ");
        String nameToUpdate = scan.nextLine();

        System.out.print("Enter new grade: ");
        double newGrade = scan.nextDouble();
        updateStudentGrade(nameToUpdate, newGrade);

    } else {
        System.out.println("\nExiting... Goodbye!");
    }

    scan.close();
}


}
