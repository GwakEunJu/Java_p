package collection_p;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayModifyMain {

	public static void main(String[] args) {
		int [] arr = {10,20,30};
		
		//끝에 추가 : 40
		
		int [] buf = new int [arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			buf[i] = arr[i];
		}
		
		buf[arr.length] = 40;
		arr = buf;
		System.out.println("추가 후 : "+Arrays.toString(arr));

		//중간삽입 : 2번째 25
		int no = 2;
		buf = new int [arr.length+1];
		for (int i = 0; i < 2; i++) {
			buf[i] = arr[i];
		}
		
		buf[no] = 25;
		for (int i = no; i < arr.length; i++) {
			//System.out.println(i);
			buf[i+1] = arr[i];
		}
		arr = buf;
		System.out.println("중간삽입 후 : "+Arrays.toString(arr));
		
		
		// 3번째 제거 [10, 20, 25, 40]
		// 마지막 제거 [10, 20, 25]
	}

}
