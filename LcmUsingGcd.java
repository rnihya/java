package LcmNum;
import java.util.*;

public class LcmUsingGcd {

	public static void main(String[] args) {
		int a,b,gcd,lcm;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number:");
		a=sc.nextInt();
		System.out.println("enter a second number:");
		b=sc.nextInt();
		gcd=findgcd(a,b);
		lcm=(a*b)/gcd;
		System.out.println("lcm of given num "+a+" and "+b+" is:"+lcm);
		
		
	}
	static int findgcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

}
