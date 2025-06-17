package collection_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//강사님 풀이

public class ArrayNumMain {

	public static void main(String[] args) {
		//56,78,92,45,78,25,77,94,77,56,83,85,56,45,72 --> 수우미양가 구간으로 나누어서 점수를 정렬
		//각 구간은 내림차순(높은 점수가 앞에 위치)하세요
		
		int [] arr = {56,78,92,45,78,25,100,77,94,77,56,83,85,56,45,72};
		
		ArrayList res = new ArrayList();
		for (int i = 0; i < 5; i++) {
			res.add(new ArrayList());	// 가양미우수 각각의 ArrayList 구간 생성하여 추가 | ArrayList안에 5개의 ArrayList 생성
										//  01234
		}
		
		for (int i : arr) {
			int ten = i/ 10;
			
			int gg = ten -5;
			
			if (gg<0) {
				gg=0;
			}if (gg==5) {
				gg=4;
			}
			((ArrayList)res.get(gg)).add(i);
			System.out.println(i+","+ten+","+gg);
		}
		
		char [] title = "가양미우수".toCharArray();
//		System.out.println(title);
		
//		((ArrayList)res.get(0)).add(27);	//Object로 들어오기 때문에 ArrayList로 형 변환을하고 그 위치를 ()로 표시해줘야한다.
		
		for (int i = 0; i < title.length; i++) {
			ArrayList me = (ArrayList)res.get(i);
			Collections.sort(me);
			Collections.reverse(me);
			
			System.out.println(title[i]+me.toString()); 
			
		}
		
//		for (Object obj : res) { //obj : ArrayList안에 5개의 ArrayList
//			System.out.println(obj);
//		}
 
	}

}
