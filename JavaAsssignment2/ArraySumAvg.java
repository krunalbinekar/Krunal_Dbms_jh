import java.util.Scanner;
class ArraySumAvg{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[10];
      int sum = 0;
	  double avg = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<10; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
	  for(int i=0; i<array.length; i++){
        	avg = avg + array[i];
			
        }


       double average = avg / array.length;
	     System.out.println("Average of array elements is:"+average);
      System.out.println("Sum of array elements is:"+sum);
    
   }
}