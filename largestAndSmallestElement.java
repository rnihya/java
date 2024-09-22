package largestAndSmallest_num_in_array;
import java.util.*;

public class largestAndSmallestElement {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		size=sc.nextInt();
		int []numbers=new int[size];
		//input
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		//output
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			else {
				min=numbers[i];
			}
			
			
			
		}
		System.out.println("largest number in array is:"+max);
		System.out.println("smallest number in array is:"+min);
		
	}

}
