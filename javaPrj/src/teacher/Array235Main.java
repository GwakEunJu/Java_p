package teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class Array235Main {

	public Array235Main() {
		// 2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요
		int[] arr = { 23, 45, 46, 50, 10, 25, 32, 8, 120, 11, 67, 89, 22, 43, 61, 29 };
		ArrayList res2 = new ArrayList();
		ArrayList res3 = new ArrayList();
		ArrayList res5 = new ArrayList();

		for (int i : arr) {

			if (i % 2 == 0) {
				res2.add(i);
			}
			if (i % 3 == 0) {
				res3.add(i);
			}
			if (i % 5 == 0) {
				res5.add(i);
			}
		}

		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res5);
	}

	public static void main(String[] args) {
		new Array235Main();
	}

}
