public class Student {
	private String name;
	private int age;
	private double grade;
	static int totalStudents;
	
	static {
	  totalStudents = 2;
	}

	public Student(){
	System.out.println("no-arguement constructer");

	}

	public Student(String name ,int age , double grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public double getGrade(){
		return grade;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setGrade(double grade){
		this.grade = grade;
	}

	
	public static void  allStudents(){
		System.out.println( totalStudents);
	}

	public boolean hasPassed(double grade){
	if(this.grade >=50){
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
		}
		
	return true;
	}

	public void  allStudents(int tatalStudents){
		 System.out.println( "Students number in this class are : "+ totalStudents);


	}
}
