package text_p;

import java.text.DecimalFormat;

////점수가 70점 이상이면 ▲, 미만이면 ▼ 로 표시해 주세요

///{67,78,89,98,76,54,78,77,90,56};

///if, switch, 3항연산자등 조건문 사용하지 말것

public class JumMain {

	public static void main(String[] args) {
		DecimalFormat aa = new DecimalFormat();
		
//		int [] ddArr = {
//				67,78,89,98,76,54,78,77,90,56
//		};
//		
//		String [] ppArr = {
//				"▲0;▼"
//		};
//		
//		for (String tt : ppArr) {
//			System.out.println(tt+" >>>");
//			aa = new DecimalFormat(tt);
//		}
//		
//		for (int a : ddArr) {
//			System.out.println("   "+a+" : "+aa.format(a));
//		}
//		
		
		
		//Teacher
		
		int [] arr = {
				67,78,89,98,76,54,78,77,90,56
		};
		
		aa = new DecimalFormat("▲0;▼");
		
		for (int i : arr) {
			System.out.println(i+" : "+aa.format(i-70).charAt(i));
		}
	}

}
