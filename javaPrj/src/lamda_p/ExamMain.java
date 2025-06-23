package lamda_p;

import java.util.ArrayList;

/*
   13,45,67,88,92,14,52,54,93,26,38,11,75
  
   2 ,3의 배수를 삭제해주세요.
   
   솟수를 삭제해 주세요 (Prime Number)
   
*/

public class ExamMain {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i : new int [] {13,45,67,88,92,14,52,54,93,26,38,11,75}) {
			arr.add(i);
		}
		System.out.println(arr);
		

		arr.removeIf(i->i%2==0 || i%3==0);
		System.out.println(arr);
		
		
	}

}
