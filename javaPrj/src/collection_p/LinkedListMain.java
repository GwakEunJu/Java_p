package collection_p;

// LinkedList 순차 추가 시간 확인 강의 25.06.12

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	void add1(String name, List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(4567);
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("순차 추가" + name + " : " + time);
	}

	void add2(String name, List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			list.add(100, 4567);
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("비 순차 추가" + name + " : " + time);
	}
	
	void remove2(String name, List list) {
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.remove(100);
		}
		long time = System.currentTimeMillis() - start;
		
		System.out.println("비 순차 삭제" + name + " : " + time);
	}

	void remove1(String name, List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.removeLast();
		}
		long time = System.currentTimeMillis() - start;
		
		System.out.println("순차 삭제" + name + " : " + time);
	}

	LinkedListMain() {
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		add1("arr", arr);
		add1("link", link);
		add2("arr", arr);
		add2("link", link);

		System.out.println("--------------------------------");
	
		remove2("arr1", arr);
		remove2("link1", link);
		remove1("arr1", arr);
		remove1("link1", link);

	}

	public static void main(String[] args) {
		new LinkedListMain();

	}

}
