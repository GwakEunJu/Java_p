package array_P;

public class SuMain {

	public static void main(String[] args) {
//		int[] a = new int[] {87,65,82,46,98,65,72,34,91,79,45,67};
//		String[] t = new String[] {"수,우,미,양,가"}; 
//		
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]>=90) {
//				System.out.println(t);
//			}		
//		
//		}
		int [] jum = {87,65,82,46,98,65,72,34,91,79,45,67};
		String [] grade = new String[jum.length];
 		
		System.out.println(jum.length);
		System.out.println(grade.length);
		
		String [] grArr = {"가","가","가","가","가","가","양","미","우","수","수",};
		
		for (int i = 0; i < jum.length; i++) {
//			grade[i] = grArr[jum[i]/10];
			int ten = jum[i]/10;  // 7 <- 78
			grade[i] = grArr[ten]; //"미"  <-arArr[7]
//			if(jum[i]>=90) {
//				grade[i] = "수";
//			}else if(jum[i]>=80) {
//				grade[i] = "우";
//			}else if(jum[i]>=70) {
//				grade[i] = "미";
//			}else if(jum[i]>=60) {
//				grade[i] = "양";
//			}else {
//				grade[i] = "가";
//			}
//			 
		}
		for (int i =0; i<grade.length; i++) {
			System.out.println(grade[i]);	
		}
		

	}

}
