import java.util.ArrayList;

import java.util.List;


public class StudentManager {
	

	public static ArrayList<Student> studentList() { 
	
	ArrayList<Student> list = new ArrayList<>();
	list.add(new Student("Alece", 20, 75.5));
	list.add(new Student("John", 22, 50.0));
	list.add(new Student("Sce", 20, 45.9));
	list.add(new Student("Kudai",31, 90.5));
	
	return list;

	}
	

	public static void modifyRef(Student s, double newGrade){
		s.setGrade(newGrade);
		 System.out.println("Updated Student: "+s.getName() + ",Age: "+s.getAge()+
                ",Grade: " + s.getGrade());

	}
	

	public static void main(String[] args){

		Student std = new Student("Alice", 20, 75.5);
	
		System.out.println("Static mumber:  " +std.totalStudents);

		System.out.println("Student: "+std.getName() + ",Age: "+std.getAge()+
		",Grade: " + std.getGrade());

		std.hasPassed();


		Student bob = new Student("Bob", 20, 45.5);
		modifyRef(bob, 55.0);
		bob.hasPassed();
		
		System.out.println("Static total: " +  Student.totalStudents);
		

		ArrayList<Student> students = studentList();
		
		System.out.println("\nAll Students:  ");
		
		for (Student student : students) {
			System.out.println(student.getName() + ", Age: " + student.getAge() 
			+"  Grade: " + student.getGrade());
			}
		System.out.println("\nThey passed:  ");
		int count = 0;
		for(Student stud : students){
		if(stud.getGrade() >= 50.0){
			count++;
			System.out.println(stud.getName() + ", Age: " + stud.getAge()
                        +"  Grade: " + stud.getGrade());
		
			

			} 
		}
		 System.out.println("\n Total students who passed:  " + count);		
	}



}
