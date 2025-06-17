package study;

public class FriDay3 {

	public static void main(String[] args) {
		int [] arr = {67, 98, 34, 72, 86, 23, 84};
		
		int tot = 0;
		
		
//		if(arr[0]>=70) {
//			System.out.println(0);
//			tot += arr[0];
//		} if(arr[1]>=70) {
//			System.out.println(0);
//			tot += arr[1];
//		} if(arr[2]>=70) {
//			System.out.println(0);
//			tot += arr[2];
//		} if(arr[3]>=70) {
//			System.out.println(0);
//			tot += arr[3];
//		} if(arr[4]>=70) {
//			System.out.println(0);
//			tot += arr[4];
//		} if(arr[5]>=70) {
//			System.out.println(0);
//			tot += arr[5];
//		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 70) {
				
			 System.out.println(i);
				
			}
		}
		System.out.println(tot);
		
		
		
		int [] jum = {87,65,82,46,98,65,72,34,91,79,45,67};
		String [] grade = new String [jum.length];
		
		String []  arArr = {"가","가","가","가","가","가","양","미","우","수","수"};
		
		for (int i = 0; i < jum.length; i++) {
			int ten = jum[i]/10;
			grade[i] = arArr[ten];
			
			System.out.println(jum[i]+","+grade[i]+" "+jum[i]/10);
		}
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}
	}

}
