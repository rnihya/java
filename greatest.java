package find_greatest;
import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		a=sc.nextInt();
		System.out.println("enter the second number:");
		b=sc.nextInt();
		System.out.println(+a>b?"A is greater than B": "B is greater than A");
		

	}

}
