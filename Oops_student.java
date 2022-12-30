import java.util.*;
class Student 
{
	String name;
	int age;

	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	 /*non parameterized
        Student()
        {
                System.out.println("Constructor called ");
        }

	 // Parameterized 
	Student(String name , int age)
	{
		this.name = name;
		this.age = age;
	}

	*/  
	Student(Student s2)
	{
		this.name = s2.name;
		this.age = s2.age;
	}

	Student()
	{

	}

}
public class Oops_student
{
	public static void main(String args[])
	{
		Student s1 = new Student();    

		s1.name = "sakshi";
		s1.age = 23;
		
		Student s2 = new Student(s1);    

		s2.printInfo();

	
	}
}
