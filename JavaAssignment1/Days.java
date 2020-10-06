 import java.util.*;
 class Days{
	 public static void main(String args[]){
		 Scanner A = new Scanner(System.in);
		 
		 System.out.println("Enter the number of days : ");
		 int a = A.nextInt();
		 
		 int x = a/365;
		 
		 a = a - (365*x);
		 
		 int y = a/30;
		 
		 int z = a-(y*30); 
		 
		 System.out.println(x + "Year");
		 		 System.out.println(y + "Month");

		 System.out.println(z + "Days");

	 }
 }