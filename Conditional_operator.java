package ondional_oper;
import java.util.Scanner;
public class Conditional_operator {

	public static void main(String[] args) {
		int a,b,diff;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two values to find the difference");
		a=sc.nextInt();
		b=sc.nextInt();
		diff= a>b?a-b:b-a;
		System.out.println("the difference between "+a+"and"+b+" is:"+diff);
	}

}
