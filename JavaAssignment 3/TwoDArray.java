import java.util.*;
class TwoDArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			int count = 0;
			int z= 0;


		int a[] = {1,2,3,4};
		int b[] = {4,5,6};
		int c[] = {7,8,9};
		int d[] = {11,12,13};
		
		int arr[][] = new int[4][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		
		for(int ar[] : arr){
							count++;

			for(int e : ar){
				System.out.print(" "+e);
				            z++;


			}

							System.out.println(" ");
								System.out.println("no of elements in 1d array "+z);
										z = 0;


		}
							System.out.println("no of elements in 2d array "+count);
							


	}
}