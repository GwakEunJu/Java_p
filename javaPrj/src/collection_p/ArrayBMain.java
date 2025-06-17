package collection_p;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayBMain {

	public static void main(String[] args) {

		int[] arr = { 23, 45, 46, 50, 10, 25, 32, 8, 120, 11, 67, 89, 22, 43, 61, 29 };

		ArrayList res = new ArrayList();
		for (int i = 0; i < 3; i++) {
			res.add(new ArrayList());

		}

		for (int i : arr) { 
			int gg =0;
			
			if (i % 2 == 0) {
				gg =0;
				
			} if (i % 3 == 0) {
				gg =1;
				
			} if (i % 5 == 0) {
				gg = 2;
				
			}
			((ArrayList)res.get(gg)).add(i);
			System.out.println(i+","+gg);
		}	
		
		String [] title = {"2배","3배","5배"};
		
		for (int i = 0; i < title.length; i++) {
			ArrayList me = new ArrayList(i);
			
			System.out.println(title[i]+me.toString());
		}

	}

}
