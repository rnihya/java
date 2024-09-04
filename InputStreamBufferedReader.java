package input;
import java.io.*;


public class InputStreamBufferedReader {

	public static void main(String[] args)throws Exception {
		 
		 
		  
		        
		 		int a,b;
		 		InputStreamReader isr= new InputStreamReader (System.in);
		 		BufferedReader br = new BufferedReader(isr);
		 		System.out.println("Input A and B values");
		 		a=Integer.parseInt(br.readLine());
		 		b=Integer.parseInt(br.readLine());
		 		System.out.println("the value of A is "+a+" and "+b+":");
		 		
		 		
		 		

		 	}

		 }

		
