package collection_p;

//Iterator 강의 25.06.13

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();

		for (int i : new int[] { 11, 22, 33, 44, 55, 66, 77 }) {
			arr1.add(i);
			arr2.add(i);
		}

		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);

		System.out.println("----------for--------------");
		for (Object oo : arr1) {
			System.out.println(oo);

		}

		System.out.println("----------Iterator--------------");
		Iterator it = arr2.iterator();
//		System.out.println(it.hasNext());
//		Object o2 = it.next();
//		System.out.println();
		while (it.hasNext()) { // 가져올 객체가 있으면 true. 없으면 false
			System.out.println(it.next()); // 컬렉션에서 하나의 객체를 가져온다
		}

		System.out.println("----------Iterator--------------");
		ListIterator lit = arr2.listIterator();
		while (lit.hasNext()) { // 가져올 객체가 있으면 true. 없으면 false
			System.out.println(lit.next()); // 컬렉션에서 하나의 객체를 가져온다
		}

		// 전진을 먼저 해야 후진을 한다. ListIterator에만 있는 기능이다.
		System.out.println("----------후진--------------");
		while (lit.hasPrevious()) { //
			System.out.println(lit.previous()); // 순서를 반대로 출력한다.
		}

		System.out.println("----------for 삭제--------------");
		for (Object oo : arr1) {
			int i = (int) oo;
			if (i == 33) {
				// arr1.remove(oo); for문은 돌고있는 중에 삭제를 하면 에러 발생
			}
			
			System.out.println(i);

		}

		System.out.println("----------Iterator 삭제--------------");
		Iterator it2 = arr2.iterator();

		while (it2.hasNext()) {
			int i = (int) it2.next();

			if (i == 33) {
				// arr2.remove((Object)i); 에러발생
				it2.remove(); // 반복문에서 삭제
			}
			System.out.println(i);
		}

		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);

	}

}
