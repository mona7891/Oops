//static 
//common
//static la ekdach memory dili jate 


import java.util.*;

class Student
{
        String name;
        static String school ;
        // object sathi coomon
	// All Student are school in RLMSS

	public static void changeSchool()
	{
		school = "newschool";
		//change 
	}

}
public class Static
{
        public static void main(String args[])
        {
                Student.school = "RLMSS";
                Student student1 = new Student();
                student1.name = "Mona";
                System.out.println(student1.school);
        }
}
