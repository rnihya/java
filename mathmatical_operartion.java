package Mat_operation_UsingSwitch;
import java.util.*;
public class mathmatical_operartion {

	public static void main(String[] args) {
		int a,b,value=0;
		String operation;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		System.out.println("operation to be performed:");
		operation=sc.next();
		System.out.println("Expression based on input "+a+" "+operation+" +b");
		
		switch(operation) {
		case "+":value=a+b;
		         break;
		case "-":value=a+b;
                  break;
		case "*":value=a+b;
                  break;
        
		case "/":value=a+b;
                  break;
        default:System.out.println("wrong opewration passed allowed operation '+','-','*','/'");
		}
		System.out.println("result="+value);
	}
}


		
		 
		
		
		
		
		
		
	