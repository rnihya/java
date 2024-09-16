package find_largest;
import java.util.*;

public class logical_operater {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for first number:");
		a=sc.nextInt();
		System.out.println("enter the value for second number:");
		b=sc.nextInt();
		System.out.println("enter the value for third number:");
		c=sc.nextInt();
		if(a>=b && a>=c) {
			System.out.println("a is greater.");
		}
		else if(b>=a && b>=c) {
			System.out.println("b is greater.");
		}
		else {
			System.out.println("c is greater.");
		}
	}
}
		
		
		
		
	