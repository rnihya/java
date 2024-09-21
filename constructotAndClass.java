package constructorConcept_;
import java.util.*;
class number{
	private int x;
	public void setData(int a) {
		x=a;
		
	}
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		x=sc.nextInt();
	}
	//zero argument constructor
	public number(){
		
	}
	
	
	
	//one argument constructor
	public number(int a) {
		x=a;
	}
	public void printData() {
		System.out.println("value given is ="+x);
	}
}
	
	
	
	



public class constructotAndClass {

	public static void main(String[] args) {
		number num=new number();
	
		num.getData();
		num.printData();
		
	}

}
