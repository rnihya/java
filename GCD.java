package gcdOfNum;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		int a,b,gcd;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number:");
		a=sc.nextInt();
		System.out.println("enter a second number:");
		b=sc.nextInt();
		gcd=findgcd(a,b);
		System.out.println("gcd of "+a+" and "+b+" is:"+gcd);
		
		
	}
	static int findgcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
			
		}
		return(a);
	}
}
		
