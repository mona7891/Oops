
import java.util.*;
import bank;

class Shape  //base cls
{
        public void area(); // function
        {
                System.out.println("display area");
        }

}
class Triangle extends Shape  // sub cls
{
        public  void area(int l,int h) // function 
        {
                System.out.println(1/2*l*h);

        }
}
class EquilateralTringle extends Triangle      // multilevel
{
        public void area(int l,int h)
        {
                System.out.println(1/2*l*h);
        }

}
class Circle extends Shape
{
        public void area(int r)
        {
                System.out.println((3.14)*r*r);
        }
}
public class Package
{
        public static void main(String args[])
        {
               bank.Account acc1 = new bank.Account();  //package 

	       acc1.name = "Customer1";              

        }
}















