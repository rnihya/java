package Generter_matrix;
import java.util.*;

public class Generter_matrix {

	public static void main(String[] args) {
		int row,col,num=12345;
		for(row=1;row<=5;row++) {
			System.out.format("%1d",num);
			System.out.print("\t");
			num=(num%10)*10000+(num/10);
			System.out.println();
		}
			
		
		
			
				
			
			
			
		
		
		
		

	}

}
