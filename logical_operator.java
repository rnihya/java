package usage_of__logical_operator;
import java.util.Scanner;

public class logical_operator {
	public static void main(String[] args) {
		 char ms, gen;
	        int age;
	         Scanner sc =new Scanner(System.in);
	        System.out.println("enter the ms,sex and age for insurance verification");
	        ms=sc.next().charAt(0);
	        gen=sc.next().charAt(0);
	        age=sc.nextInt();
	        if((ms=='m'&& age>45)||(ms=='u' && gen=='m' && age>30)){
	             System.out.println("IS INSURED");
	            
	        }else{
	             System.out.println("IS  NOT INSURED");
	        }
	    }
	}
	

	
