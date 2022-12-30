import java.util.*;

abstract class  Animal  //hid
{
        abstract  void walk();  // using Abstract
	Animal() // constractor 
	{
		System.out.println("You are createing new animal");
	}
        public void eat()       //using Non-Abstract
        {
                System.out.println("Animal eats");
        }
}
class Horse extends Animal
{ 
	Horse()        // constructor
	{
		System.out.println("Created a Horse");
	}
        public void walk()
        {
                System.out.println("Walks on 4 legs ");
        }
}
class Chicken extends Animal
{
        public void walk()
        {
                System.out.println("Walks on 2 legs ");
        }
}
public class Constructor
{
        public static void main(String args[])
        {
                Horse horse = new Horse();

             //   horse.walk();
             //   horse.eat();  
        }
}

