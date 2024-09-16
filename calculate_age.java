package displayDetails_age;
import java.util.*;
import java.time.*;

public class calculate_age {

	public static void main(String[] args) {
		String first_name,last_name,dob;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first name:");
		first_name=sc.next();
		System.out.println("please enter the last name:");
		last_name=sc.next();
		System.out.println("please enter the date of birth in the (yyyy-mm-dd)format:");
		dob=sc.next();
		LocalDate date_of_birth=LocalDate.parse(dob);
		LocalDate current_date=LocalDate.now();
		age=Period.between(date_of_birth,current_date).getYears();
		System.out.println("Dear "+first_name+" "+last_name+",according your dob provided i.e,"+dob+" your age as of today is:"+age);

		
		
		
		

	}

}
