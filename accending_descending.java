package ascendingDesending_array;
import java.util.*;
public class accending_descending {

	public static void main(String[] args) {
		int size;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array:");
		size=sc.nextInt();
		int[] numbers=new int[size];
		//input
		for( i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		
		 Arrays.sort(numbers);

        
        // Displaying the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
        boolean isAscending=true;
    
		
		
      
		for( i=0;i<numbers.length-1;i++) {
			//condition for descending
		
			if(numbers[i]>numbers[i+1]) {
				isAscending=false;
			
			}
		}
	
	
			if(isAscending) {
				System.out.println("the given array is  sorted in ascending order");
			}else{
				System.out.println("the given array is not sorted in ascending order");
			}
			
			
				
		
		

	}

}
