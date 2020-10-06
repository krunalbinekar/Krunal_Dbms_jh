    import java.util.*;
	public class BigSmall {
     
            public static void main(String[] args) {
                     Scanner sc = new Scanner(System.in);
					 int n = sc.nextInt();
		 int numbers[] = new int[n];
		 for(int i=0;i<n;i++){  //for setting values
			 numbers[i]=sc.nextInt();
	 }
                    int smallest = numbers[0];
                    int biggest = numbers[0];
                   
                    for(int i=1; i< numbers.length; i++)
                    {
                            if(numbers[i] > biggest)
                                    biggest = numbers[i];
                            else if (numbers[i] < smallest)
                                    smallest = numbers[i];
                           
                    }
                   
                    System.out.println("Largest Number is : " + biggest);
                    System.out.println("Smallest Number is : " + smallest);
            }
    }