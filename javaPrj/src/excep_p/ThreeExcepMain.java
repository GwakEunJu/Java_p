package excep_p;

public class ThreeExcepMain {

	public static void main(String[] args) {
		
	for (int i = 1; i <=9; i++) {
	
		try {
			
		  int b = i+1/2;	
		  System.out.println(b);
		 
		  
			
		} catch (Exception e) {
			String a = "짝";
			
			System.out.println(a);
		}
		
		System.out.println();
	}
  }	
}