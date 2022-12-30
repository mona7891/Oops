//Abstraction
//Data hiding is the process of protecting members of class from unintended change whereas,abstraction is hiding the implementation details and showing only importatnt / useful parts to the user.
//An abstract class must be declared with an abstract keyword
//It can have abstract and non-abstract method 
//It cannot be instantited.
//It can have constructors and static method also 
//It can have final method which will force the subclass not to change the body of the method.

import java.util.*;

abstract class  Animal  //hid
{
	abstract  void walk();  // using Abstract
	public void eat()       //using Non-Abstract
	{
		System.out.println("Animal eats");
	}
}
class Horse extends Animal
{
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
public class Abstraction
{
	public static void main(String args[])
	{
		Horse horse = new Horse();

		horse.walk();
		horse.eat(); // non Abstract 
		//Animal animal = new Animal(); 
		// Animal is abstract; cannot be instantiated
		//animal.walk();
	}
}
