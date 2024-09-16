package fabonacci_series;
import java.util.*;

public class fabonacci_series_limit {

	public static void main(String[] args) {
		int limit,a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit to find fabonacci series:");
		limit=sc.nextInt();
		
		while(a<=limit) {
			System.out.print(" "+a);
			b=a+b;
			a=b-a;
		}
		
		

	}

}
