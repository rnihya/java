package prefectSquare;
import java.util.*;

public class PrefectSquare_Num {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		num=sc.nextInt();
		int sqrt=(int) Math.sqrt(num);
		System.out.println("squareRoot of given "+num+" is:"+sqrt);
		if(sqrt*sqrt==num) {
			System.out.println("the given "+num+" is a Prefect Square.");
		}else {
			System.out.println("the given "+num+" is not a Prefect Square.");
			
		}
	}
}
	
	
	
