//Interface
//Interface has no constractor
//Interface has no Abstraction
// All the fields in interfaces are public,static and final by default
// All the method are public & abstract by default
// A class that implements an interface must implement all the methods declared in the interface.
// interfaces support the functionality of multiple inheritance. 

import java.util.*;
	//int eyes = 2 ; --->value are public static & final
interface Animal
{
	void walks();
	//Animal();  --> constractor
	//void eat();--> Abstract  

}
// java does not have  multipleInhritance
// but interface have 

interface Herbivore
{
	
}

class Horse implement Animal,Herbivore      // Interface 
                                            // multipleInhritance
{
	public void walk()
	{
		System.out.println("walks on 4 legs ");
	}

}
public class Interface
{
	public static void main(String args[])
		
	{
		Horse horse = new Horse();

	}

}
