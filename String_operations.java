package StringOpertations;
import java.util.*;

public class String_operations {

	public static void main(String[] args) {
		String first_name="Nithya";
		String last_name="vathi";
		//Character at a given position
		System.out.println("Character at fourth position is:"+first_name.charAt(4));
		//concatenate first name and last name
		System.out.println("concatenated string is:"+first_name.concat(last_name));
		//length of String
		System.out.println("leng th of First_name string is:"+first_name.length());
		//convert to upper and lower case
		System.out.println("first name converted to upper case :"+first_name.toUpperCase());
		System.out.println("first name converted to lower case :"+first_name.toLowerCase());
		//compare 2 strings
		System.out.println("compare  2 strings :"+last_name.compareTo(first_name));
		//to character array
		System.out.println(String.copyValueOf(first_name.toCharArray()));
		
		}


}
