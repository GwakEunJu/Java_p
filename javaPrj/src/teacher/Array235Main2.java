package teacher;

import java.util.ArrayList;

enum Array235 {
	res2, res3, res5;

	ArrayList data = new ArrayList();

}

public class Array235Main2 {

	public Array235Main2() {
		// 2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요
		int[] arr = { 23, 45, 46, 50, 10, 25, 32, 8, 120, 11, 67, 89, 22, 43, 61, 29 };

		int[] divs = { 2, 3, 5 };

		for (int i : arr) {
			System.out.println(i);

			for (int d : divs) {
				if (i % d == 0) {
					Array235.valueOf("res" + d).data.add(i);
				}
			}

		}

		for (Array235 rr : Array235.values()) {
			System.out.println("배수" + rr.data);
		}

	}

	public static void main(String[] args) {
		new Array235Main();

	}

}
