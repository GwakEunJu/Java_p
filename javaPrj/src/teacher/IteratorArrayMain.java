package teacher;

import java.util.ArrayList;
import java.util.Iterator;

//{34,56,12,43,90,89,654,43,21234,675,45};

//1. 모든 원소를 arrayList에 넣어 출력하세요
//2, 3의 배수를 제외한 arrayList로 변환하세요

public class IteratorArrayMain {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();

		for (int i : new int[] { 34, 56, 12, 43, 90, 89, 654, 43, 21234, 675, 45 }) {
			arr.add(i);
		}

		System.out.println("arr : " + arr);

		Iterator it = arr.iterator();
		while (it.hasNext()) {
			int i = (int) it.next();

			if (i % 2 == 0) {
				it.remove();
			} else if (i % 3 == 0) {
				it.remove();
			}

		}

		System.out.println("3의 배수 제외 한 나머지 값: " + arr);

	}

}
