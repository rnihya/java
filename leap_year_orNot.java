package leap_year;
import java.util.*;

public class leap_year_orNot {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year (yyyy):");
		year=sc.nextInt();
		if(year%4==0) {
			System.out.println("the year '"+year+"'is a leap year.");
		}
		else {
				System.out.println(" the year '"+year+"'is a  not a leap year.");
				
			}
		
	}
}
	