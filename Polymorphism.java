//function overloading same function name created  //(complile time)
//different function but name same call as Polymorphism  //
//return type diff if not then parameter are not same ,if same then data type are not same 
//complile time 
import java.io.*;

class Student
{
	String name;
	int age;

	public void PrintInfo(String name )
	{
		System.out.println(name);
	}

	public void printInfo(int age )
	{
		System.out.println(age);
	}
	public void printInfo(String name , int age)
	{
		System.out.println(name + " " + age);
	}
}
	public class Polymorphism
	{
		public static void main(String args[])
		{
			Student  s1 = new Student();

			s1.name = "mona";
			s1.age = 23;

			s1.printInfo(s1.name,s1.age);

		}
	}
	




