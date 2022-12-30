 class Shape  //base cls
{
	public void area(); // function
	{
		System.out.println("display area");
	}

}
//1.Single level Inheritance 
//(Base Class)
//     |
//(Derived class) 
class Triangle extends Shape  // sub cls
{
	public  void area(int l,int h) // function 
	{
		System.out.println(1/2*l*h);

	}
}

//2.Multi Level Inheritance 
//(Base class)  --->        (Shape)
//    |
//(Derived class) --->      (Triangle)
//    |
//(Derived class) --->      (EquilateralTriangle)
// extends Shape , area 
class EquilateralTringle extends Triangle      // multilevel
{
	public void area(int l,int h)
	{
		System.out.println(1/2*l*h);
	}

}
//3.Hierarchial Inheritance
//(Base class) --->     (Shape)
//   |     |
//(Derived class) (Derived class)
//multi sub class , multi derive clss...base cls inheritance
// extends shape ,area,Triangle  
class Circle extends Shape 
{
	public void area(int r)
	{
		System.out.println((3.14)*r*r);
	}
}
//4.Hybrid Inheritance
//sigle class multi class and hierarchiels inheritance are use in Hybrid Inheritance 

//5.multipile Inheritance
//java does not use 


// main class
public class Inheritance
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();


	}
}



