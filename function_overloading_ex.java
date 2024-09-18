package function_overloading;
import java.util.*;

public class function_overloading_ex {

	public static void main(String[] args) {
		int a=6,b;
		long x=(-200000),y;
		double i=(-12.41),j;
		b=compare(a);
		y=compare(x);
		j=compare(i);
		System.out.println("B:"+b);
		System.out.println("Y:"+y);
		System.out.println("J:"+j);
	
		
		
	}
	static int compare(int c) {
		return(c>0 ? c :0); 
	}
	static long compare(long z) {
		return(z>0 ? z :0); 
	}
	static double compare(double k) {
		return(k>0 ? k:0); 
	}



}
