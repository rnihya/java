package PrimeNum;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check for prime:");
		num=sc.nextInt();
		i=2;
		while(i<=num-1) {
			if(num%i==0) {
				System.out.println("not a prime number");
				break;
			}
			i++;
		}
		if(i==num) {
			System.out.println("the given number "+num+" is a prime number");
		}
	}
}


				
	