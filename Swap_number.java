
package SwapNumber;
import java.util.Scanner;
public class Swap_number {

	public static void main(String[] args) {
		int a,b,swapped;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number to swap:");
		a=sc.nextInt();
		System.out.println("enter second number to swap:");
		b=sc.nextInt();
		swapped= Without_thirdVariable(a,b);
		 
		
		
	}
	public static  int Without_thirdVariable(int a,int b){
		a=a+b;
		b=a-b;
	    a=a-b;
	    System.out.println(" first number after swapping:"+a);
		System.out.println(" second number after swapping:"+b);
	  
		return b;
	   
		
		
	}
		
	}
		
		
		
		
