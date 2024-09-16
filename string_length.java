package String_lenth_name;
import java.util.*;

public class string_length {

	public static void main(String[] args) {
		String name;
		int length_name;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of a person:");
		name=sc.next();
		length_name=name.length();
		System.out.println("length of the name "+name+" is:"+length_name);
		
	}

}
