 import java.util.*;
 class Tempreature{
	 public static void main(String args[]){
		 Scanner A = new Scanner(System.in);
		 
		 System.out.println("Enter the tempreature in Fahrenheit : ");
		 
		 float a = A.nextFloat();
		 
		 float b = 5*(a-32)/9;
		 System.out.println("Tempreature in Degree Celcius : " + b);
	 }
 }