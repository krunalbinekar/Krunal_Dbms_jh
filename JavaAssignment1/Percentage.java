 import java.util.*;
 class Percentage{
	 public static void main(String args[]){
		 Scanner m = new Scanner(System.in);
		 
		 System.out.println("Enter marks of English :  ");
		 int a = m.nextInt();
		 		 System.out.println("Enter marks of Science :  ");

		 int b = m.nextInt();
		 		 System.out.println("Enter marks of Maths :  ");

		 int c = m.nextInt();
		 		 System.out.println("Enter marks of Algebra :  ");

		 int d = m.nextInt();
		 		 System.out.println("Enter marks of Geometry :  ");

		 int e = m.nextInt();
		 
		 System.out.println("Enter Total Marks :");
		 int f = m.nextInt();
		 
double per = ((a + b + c + d + e)*100)/f ;
System.out.println("percentage marks = "+ per + " %");		 


		 
	 }
 }