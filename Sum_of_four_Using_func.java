package sum;
import java.util.Scanner;

public class Sum_of_four_Using_func {

	public static void main(String[] args) {
		int  a,b,c,d,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second  number:");
		b=sc.nextInt();
		System.out.println("Enter the third number:");
		c=sc.nextInt();
		System.out.println("Enter the fourth number:");
		d=sc.nextInt();
		sum=sum_of_four(a,b,c,d);
		System.out.println("sum of "+a+","+b+","+c+","+d+" is:"+sum);
	}
	
		
		static int sum_of_four(int i,int j,int k,int l) {
			int s;
			s=i+j+k+l;
			return(s);
		}
}
			
		
		
		
		

