package collection_p;

//컬렉션 list-> ArrayList 25.06.12

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List arr1 = new ArrayList();
		System.out.println("arr1 : "+arr1);
		
		System.out.println("[CRUD]>>>>>> ");
		//CRUD
		//C=create, R=read, U=update, D=delete
		//	add		  get	  set	    remove
		arr1.add(10);
		arr1.add(5);
		arr1.add(30);
		arr1.add(10);
		arr1.add(20);
		
		
		System.out.println("add : "+arr1);
		arr1.add("그는 훌륭한 키보드였습니다");
		arr1.add(123.456);
		arr1.add(true);
		arr1.add(new int[] {11,22,33});
		arr1.add(new Date());
		arr1.add(new ArrayList());
		System.out.println("add : "+arr1);
		arr1.add(2,"아기상어");
		System.out.println("중간삽입 : "+arr1);
		Object oo = arr1.get(0);	//요소(원소) 호출
		System.out.println("get : "+oo);
		arr1.set(4, "efg");			//요소(원소) 대입 - 바꿔치기
		System.out.println("set : "+arr1);
		
		//remove(int) : 원소번호
		//remove(Object) : 원소값
		arr1.remove(5);	//원소값 5가 아니고 5번째 원소 삭제
		//[5, 10, 아기상어, 30, efg, 20, 50, 그는 훌륭한 키보드였습니다...]
		//[5, 10, 아기상어, 30, efg, 50, 그는 훌륭한 키보드였습니다...] 배열의 5번째 삭제 (20)
		System.out.println("remove(5) : "+arr1);
		arr1.remove("아기상어");
		System.out.println("remove(\"아기상어\") : "+arr1);
		//int를 원소값으로 삭제하고 싶을때 Object로 형변환 
		arr1.remove((Object)5);
		System.out.println("remove(5) : "+arr1);
		
		arr1.add(2,"장수");
		arr1.add(5,"장수");
		arr1.add(7,"장수");
		
		System.out.println("장수 추가 : "+arr1);
		boolean bb = arr1.remove("장수");	// 중복된 경우 앞에서 부터 순서대로 삭제
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);
		bb = arr1.remove("장수");
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);
		bb = arr1.remove("장수");
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);
		bb = arr1.remove("장수");
		System.out.println("remove(\"장수\") : "+arr1);
		System.out.println("bb : "+bb);	// false 인 경우 삭제 내용이 없다는 의미
		
		oo = arr1.remove(4);	// index(int)로 삭제시 리던은 Object
		System.out.println("remove(4) : "+arr1);
		System.out.println("oo : "+oo);
//		oo = arr1.remove(100);	존재하지않는 index를 삭제하면 에러발생
//		System.out.println("remove(100) : "+arr1);
//		System.out.println("oo : "+oo);
		arr1.removeFirst();	//첫번째 제거
		System.out.println("removeFirst() : "+arr1);
		System.out.println("oo : "+oo);
		arr1.removeLast();	//첫번째 제거
		System.out.println("removeLast() : "+arr1);	//마지막 제거
		System.out.println("oo : "+oo);
		
		//검색
		System.out.println("[검색]>>>>>> ");
		arr1.add("efg");
		arr1.add("ttt");
		arr1.add("yuio");
		System.out.println(arr1);
		System.out.println("contains(\"efg\") : "+arr1.contains("efg"));
		System.out.println("contains(\"asdf\") : "+arr1.contains("asdf"));
		System.out.println("indexOf(\"asdf\") : "+arr1.indexOf("efg"));
		System.out.println("indexOf(\"asdf\") : "+arr1.indexOf("asdf")); //없으면 -1
		//System.out.println("indexOf(\"asdf\",1) : "+arr1.indexOf("efg",1)); 에러
		System.out.println("lastIndexOf(\"efg\") : "+arr1.lastIndexOf("efg"));
		System.out.println("getFirst : " +arr1.getFirst());	//첫번째 값
		System.out.println("getLast : " +arr1.getLast()); //마지막 값
		System.out.println("size : " +arr1.size());	//
		
		
		//추출
		System.out.println("[추출]>>>>>> ");
		System.out.println(arr1);
		Object [] ooArr = arr1.toArray();
		System.out.println("toArray : "+ooArr+Arrays.toString(ooArr));	//배열
		System.out.println(ooArr[0]);
		System.out.println(arr1.get(0));
		List arr2 = arr1.subList(2, 6);	//shallow copy
		List arr3 = new ArrayList(arr2); //새로 생성	
		System.out.println("subList(2, 6) : "+arr2);  // 2~5번째 까지 추출
		System.out.println("arr3 : "+arr3);  
		
		System.out.println(">>>>>>>>>>>>>크게 중요하지않음 >>>>>>>>>>>>>>>>>>> ");
		arr2.add(1357); //부분집합에서 추가
		arr1.set(5, "쭈꾸미가먹고싶어요");		// 원본에서 변경 
		System.out.println("arr1 : "+arr1); //원본도 추가, 변경
		System.out.println("arr2 : "+arr2); //자신 추가, 변경
		System.out.println("arr3 : "+arr3); //새로 생성된 list는 영향 없음
		
		System.out.println("원본 추가 후 ");
		//arr1.add(2,"프테라노돈"); //원본에서 추가시 subList 커넥션이 끊어짐
		arr1.add("브라키오사우르스"); //원본에서 추가 위치가 subList와 달라도 subList 커넥션이 끊어짐
		System.out.println("arr1 : "+arr1); //원본 추가
		//System.out.println("arr2 : "+arr2); //에러 발생
		System.out.println("arr3 : "+arr3); //새로 생성된 list는 영향 없음
		
		
		System.out.println("[All]>>>>>> ");
		List arr4 = new ArrayList();
		arr4.add(100);
		arr4.add(200);
		arr4.add(300);
		arr4.add(400);
		arr4.add(500);
		
		List arr5 = new ArrayList();
		arr5.add(400);
		arr5.add(500);
		arr5.add(600);
		System.out.println("arr4 :"+arr4);
		System.out.println("arr5 :"+arr5);
		System.out.println("containsAll(arr5) : "+arr4.containsAll(arr5));	//arr4값에서 arr5의 값이 있는지 확인
		arr4.add(600);
		System.out.println("containsAll(arr5) : "+arr4.containsAll(arr5));
		arr4.removeAll(arr5);	// arr4에서 arr5에 있는 값을 지운다
		System.out.println("removeAll(arr5) : "+arr4);
		List arr6 = new ArrayList();
		arr6.add(100);
		arr6.add(300);
		arr6.add(500);
		System.out.println("arr4 : "+arr4);
		System.out.println("arr6 : "+arr6);
		arr4.retainAll(arr6);	//arr6에 있는 값만 남기고 삭제
		System.out.println("retainAll(arr6) : "+arr4);
		System.out.println("arr6 : "+arr6);
		System.out.println("isEmpty() : "+arr6.isEmpty());	// 비어있는지 확인
		arr6.clear();
		System.out.println("clear() : "+arr6);
		System.out.println("isEmpty() : "+arr6.isEmpty());
		
		System.out.println("[Collections]>>>>>> ");
		arr4.add(100);
		arr4.add(400);
		arr4.add(700);
		arr4.add(100);
		arr4.add(900);
		arr4.add(100);
		System.out.println("arr4 : "+arr4);
		
		Collections.replaceAll(arr4, 100, "백");	 // 1: 바꾸려고 하는 배열, 2:바꾸려는 값, 3:바꾸고싶은 값
		System.out.println("replaceAll(arr4, 100, \"백\") : "+arr4);
		Collections.reverse(arr4);	 
		System.out.println("reverse(arr4) : "+arr4);	//앞 뒤 순서 바꿔서 출력
		Collections.swap(arr4,1,4);	 
		System.out.println("swap(arr4,1,4) : "+arr4);	//바꾸고싶은 값의 위치를 서로 바꿔줌 1->4  4->1
		Collections.shuffle(arr4);	 
		System.out.println("shuffle(arr4) : "+arr4);	//순서가 뒤바뀐다
		//Collections.sort(arr4); 비교가능한 원소만 있어야한다.	
		
		ArrayList  arr7 = new ArrayList();
		arr7.add(100);
		arr7.add(12);
		arr7.add(34);
		arr7.add(9);
		arr7.add(12);
		arr7.add(34);
		arr7.add(56);
		arr7.add(88);
		System.out.println("arr7 : "+arr7);	// 정렬 되지않은 상태
		Collections.sort(arr7);	 
		System.out.println("sort(arr7) : "+arr7);	//오름차순 정렬
		
		System.out.println("[copy]>>>>>> ");
		
		//hashCode()로 확인 불가
		ArrayList arr8 = arr7;						//shallow copy
		ArrayList arr9 = new ArrayList(arr7);		//deep copy
		ArrayList arr10 = (ArrayList)arr7.clone();	//deep copy	 --- clone은 List엔 없어서 ArrayList로 해야한다.
		System.out.println("arr7 : "+arr7.hashCode()+arr7);	
		System.out.println("arr8 : "+arr8.hashCode()+arr8);	
		System.out.println("arr9 : "+arr9.hashCode()+arr9);
		System.out.println("arr10 : "+arr10.hashCode()+arr10);
		System.out.println("arr7==arr8 : "+(arr7==arr8));
		System.out.println("arr7==arr9 : "+(arr7==arr9));
		System.out.println("arr7==arr10 : "+(arr7==arr10));
		arr7.set(1,1234);
		System.out.println("arr7 : "+arr7.hashCode()+arr7);	
		System.out.println("arr8 : "+arr8.hashCode()+arr8);	
		System.out.println("arr9 : "+arr9.hashCode()+arr9);
		System.out.println("arr10 : "+arr10.hashCode()+arr10);
	}
}
