package linear_search;
import java.util.*;
public class linear_search_array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int number[]=new int[size];
	//input
	for(int i=0;i<size;i++) {
		number[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	//output
		for(int i=0;i<size;i++) {
			if(number[i]==x) {
				System.out.println(""+x+" is found at index:"+i);
			}
			
		}
	
	
	
	

	}

}
