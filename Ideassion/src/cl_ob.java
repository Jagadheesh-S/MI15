//Class and object program....
class Student
{
	String name;
	 int rollno,age;		 
void info()
{
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
}
}
public class cl_ob {   
public static void main(String[] args) {
			Student student = new Student();
			student.name = "Ramesh";
			student.rollno = 253;
			student.age = 25;	
			student.info();
}
			
}

 
		

	


