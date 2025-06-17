package study;

import java.util.Arrays;

public class FriDay2 {

	public static void main(String[] args) {
		int [] arr = {11,22,33};
		
		int [] buf = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {  // arr 배열을 요소를 하나씩 배열에 복사
			buf[i] = arr[i];
		}
		
		buf[arr.length] = 44;  // 배열 마지막칸에 ㄴ44
		
		arr = buf;
		System.out.println(" "+arr+Arrays.toString(arr));
		
		
		System.out.println("--------------------------------");
		
		buf = new int [arr.length-1];
		
		for (int i = 0; i < buf.length; i++) {
			buf[i] = arr[i];
		}
		arr = buf;
		System.out.println(arr+Arrays.toString(arr));
		}

	}


