package rectangle_area;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		int length,breadth,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for length:");
		length=sc.nextInt();
		System.out.println("enter the value for breadth:");
		breadth=sc.nextInt();
		area=length*breadth;
		System.out.println("area of rectangle is:"+area);
		

	}

}
