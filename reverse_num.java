//reverse a number using while loop
package reverse;
import java.util.*;

public class reverse_num {

	public static void main(String[] args) {
		int ini,num,digit,rever_num = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a num to reverse");
		num=sc.nextInt();
		ini=num;
		while(num!=0) {
			digit=num%10;
			num=num/10;
			rever_num = rever_num *10 +digit;
			System.out.println("digit="+digit+";number="+num+";reverse="+rever_num);
			
		}
		System.out.println("the given num is"+ini);
		System.out.println("the reversed num is"+rever_num);
		
	

	}

}
