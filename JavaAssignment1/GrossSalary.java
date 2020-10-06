 import java.util.*;
 class GrossSalary{
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter basic Salery : ");
		 double x = sc.nextFloat();
		 double HRA;
		 double DA;
		 double GS;
		 
		 if(x < 10000)
		 {
			HRA = x*0.10;
			System.out.println(HRA);
			DA = x*0.90;
			System.out.println(DA);
			GS = x + HRA + DA;
						System.out.println(GS);
		 }
		 else if ( x == 1000 || x > 10000)
		 {
			 HRA=2000;
			 DA=x* 98 /100;
			 GS = x + HRA + DA;
						System.out.println(GS);
			 
		 }
	 }
 }