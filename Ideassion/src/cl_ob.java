//Class and object program....

public class cl_ob {   
		 String name;
		 int rollno,age;		 
void info(){
		  System.out.println("Name: "+name);
		  System.out.println("Roll Number: "+rollno);
		  System.out.println("Age: "+age);
}  
public static void main(String[] args) {
			cl_ob student = new cl_ob();
			student.name = "Ramesh";
			student.rollno = 253;
			student.age = 25;	
			student.info();
			
	}
}  
		

	


