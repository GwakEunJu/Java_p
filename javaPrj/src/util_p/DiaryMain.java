package util_p;

import java.util.Date;

public class DiaryMain {

	public static void main(String[] args) {
		Date today = new Date();
		/*
		1. 이번달의 마지막 날
		2. 지금이 토요일인가
		3. 1일의 요일번호
		*/
		
		//teacher
		int now = today.getDate();
		//System.out.println(now);
	
		today.setMonth(today.getMonth());
		today.setDate(0);	//lastDay 기준 이전달 마지막 날
		int last = today.getDate();
		System.out.println(today);
		
		today.setDate(1);
		int first = today.getDay(); //첫째날 요일 가져오기
		for (int i = 0; i <first; i++) { //첫쨰날 요일 앞에 빈칸 출력
			System.out.print("\t");
		}
		
		for (int i = 1; i < last; i++) {
			today.setDate(i);
			
			//teacher
			String pre=" ";
			String sur=" ";		
			if(now==i) {
				pre=" [";
				sur="]";	
			}
			System.out.print(pre+i+sur+"\t");
			
			if(today.getDay()==6) {	//토요일이면 줄바꾸기
				System.out.println();
			} 
			
			
			
		}
		
	}

}
