 import java.util.*;
 class SimpleInterest{
	 public static void main(String args[]){
		 Scanner I = new Scanner(System.in);
		 
		 System.out.println("Enter Principle Amount : ");
		 int x = I.nextInt();
		 
		  System.out.println("Enter Rate of Interest : ");
		 float y = I.nextFloat();
		 
		  System.out.println("Enter Period Time : ");
		 float z = I.nextFloat();
		 
		 float w = (x * y * z)/100;
		 System.out.println("Simple Interest : " + w);
	 }
 }