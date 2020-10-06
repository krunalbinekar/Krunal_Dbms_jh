 import java.util.*;
 class Circle{
	 public static void main(String args[]){
		 
		 Scanner x = new Scanner(System.in);
		 System.out.println("Enter the radius of circle : ");
		 double a = x.nextDouble();
		 
		 double b = 3.14 * a * a;
		 System.out.println("The Area of circle is : " +b);
		 
		 double c = 2 * 3.14 * a;
		 System.out.println("The Circumference of circle is : " +c);


		 
	 }
 }