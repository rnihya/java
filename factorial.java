package Factorial_number;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		int num,fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		System.out.println("factorial of "+num+" is:"+factorial(num));
	}
	static int factorial(int num) {
		int factor;
		if(num==1) {
			return 1;
		}else {
		factor=num*factorial(num-1);
		}
		return(factor);
	}
}
		
		