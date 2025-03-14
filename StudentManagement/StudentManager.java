public class StudentManager {
	

	public static void modifyRef(Student s){
		s.setGrade(50.0);
		 System.out.println("Student: "+s.getName() + ",Age: "+s.getAge()+
                ",Grade: " + s.getGrade());

	}

	public static void main(String[] args){
		Student std = new Student("Alice", 20, 75.5);	
		System.out.println(std.totalStudents);
		System.out.println("Student: "+std.getName() + ",Age: "+std.getAge()+
		",Grade: " + std.getGrade());
		System.out.println(std.getName()+ "has" + std.hasPassed(std.getGrade()));

		Student bob = new Student("Bob", 20, 45.5);
		modifyRef(bob);
		System.out.println(std.totalStudents);		
	}



}
