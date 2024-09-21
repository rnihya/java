package linearsearch;
import java.util.*;

public class linear_searchArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array");
		int size=sc.nextInt();
		int marks []=new int[size];
		//input
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(marks[i]);
		}
			
		
	}

}
