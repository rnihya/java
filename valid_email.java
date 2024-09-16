package check_whether_email_is_valid;
import java.util.Scanner;

public class valid_email {

	public static void main(String[] args) {
		String email;
		int check1=0,check2=0,position;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a EmailId:");
		email=sc.next();
		for(position=0;position<email.length();position++) {
			char letter=email.charAt(position);
			if(letter=='@') {
				check1++;
				
			}
			if(letter=='.'){
				check2++;
			}
		}
		if(check1==1 && check2>0) {
			System.out.println("the entered email:'"+email+"' is a valid email.");
		}
		else {
			System.out.println("the entered email:'"+email+"' is a not a valid email.");
		}
		
		
		

	}

}
