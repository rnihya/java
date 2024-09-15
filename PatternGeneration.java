package PatternGeneration;

public class PatternGeneration {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=2;i++) {
			for(j=1;j<=2;j++) {
				
				if(i==j) {
					continue;
				
				}
				System.out.println(i+" "+j);
			}
			
		}
	
	}
}
				
		