package oopsConcept;
import java.util.Scanner;
class rectangle{
	private int length,breadth;
	public void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		length=sc.nextInt();
		System.out.println("enter the breadth:");
		breadth=sc.nextInt();
	}
	public void setData(int a,int b){
		length=a;
		breadth=b;
	}
	public void displayData(){
		System.out.println("length="+length);
		System.out.println("breadth="+breadth);
	}
	public void calcAreaPrint() {
		int area;
		area=length*breadth;
		System.out.println("area is:"+area);
	}
}
	
public class memberFunctionUsage {

	public static void main(String[] args) {
		rectangle rec=new rectangle();
		rec.getData();
		rec.displayData();
		rec.calcAreaPrint();
		

	}

}
