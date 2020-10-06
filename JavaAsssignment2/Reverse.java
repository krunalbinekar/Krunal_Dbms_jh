 import java.util.*;
 class Reverse{
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 
		 int rev = 0;
		 int x = sc.nextInt();
		  while(x!=0){
			  int a = x % 10;
			  rev = rev * 10 + a;
			  x /= 10;
		  }
		  System.out.println(rev);
	 }
 }