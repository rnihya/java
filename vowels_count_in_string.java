package vowels_count;
import java.util.*;

public class vowels_count_in_string {

	public static void main(String[] args) {
		String str;
		int position,counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name with vowels or without:");
		str=sc.next();
		for(position=0;position<str.length();position++) {
			char letter=str.charAt(position);
			if(letter == 'a' || letter == 'i' || letter == 'o' || letter == 'u') {
			
				counter++;
			}
			
		}
		System.out.println("the string you entered "+str+"  contains "+counter+" vowels.");
	}
}
			