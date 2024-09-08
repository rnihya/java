package loops;
import java.util.Scanner;

public class loop_whi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,sum=0,i=0;
		System.out.println("enter a positive number:");
		a =sc.nextInt();
		while(i<a) {
			sum=sum+i;
			i++;
		}
		System.out.println("the cummulative sum of all digits from 0 to"+a+" is:"+sum);
		
		
		
		
		
				
		

	}

}
