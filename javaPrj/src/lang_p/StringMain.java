package lang_p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;



public class StringMain {

	public static void main(String[] args) {
		String aa = "아기qw12#$";
		String bb = "아기qw12#$";
		String cc = new String("아기qw12#$");
		
		System.out.println("-----aa-----");
		System.out.println(aa);
		System.out.println(aa.toString());
		System.out.println(aa.hashCode());
		
		System.out.println("-----bb-----");
		System.out.println(bb);
		System.out.println(bb.toString());
		System.out.println(bb.hashCode());
		
		System.out.println("-----아기qw12#$-----");
		System.out.println("아기qw12#$");
		System.out.println("아기qw12#$".toString());
		System.out.println("아기qw12#$".hashCode());
		
		System.out.println("-----cc-----");
		System.out.println(cc);
		System.out.println(cc.toString());
		System.out.println(cc.hashCode());
		
		System.out.println("------------");
		System.out.println(aa==bb);
		System.out.println(aa=="아기qw12#$");
		System.out.println(aa==cc);
		System.out.println(aa.equals(bb));
		System.out.println(aa.equals("아기qw12#$"));
		System.out.println(aa.equals(cc));
		
		//문자배열을 직접 String 으로 대입 불가
		//String dd = {'a','b','c','d'};
		System.out.println("------------");
		char [] chArr =  {'아','기','q','w','1','2','#','$'};	//문자 배열
		String ee = new String(chArr);		// 인스턴스 생성
		System.out.println(ee);
		System.out.println(ee.hashCode());
		
		System.out.println("------------");
		String f = "선생님은 귀여워요 aBcD eF JavA 만세 12a3a4";
		//			0 123 45 67 8901234567890123 45678901	
		
		//subString : 문자열 추출
		System.out.println("length() : "+f.length());
		System.out.println("substring(24) : "+f.substring(24));	//24-->끝까지 출력
		System.out.println("substring(24,30) : "+f.substring(24,30));	//24-->29까지 출력
		char ch = f.charAt(7);	//arr[7]
		System.out.println("charAt(7) : "+ch);
		//현재 문자열 원소를 변경하는 것운 불가
	    //f.charAt(7) = 'd';
		System.out.println("indexOf(\"Bc\") : "+f.indexOf("Bc"));
		System.out.println("indexOf(\"zxcv\") : "+f.indexOf("zxcv"));	// 없으면 -1
		System.out.println("indexOf(\"a\") : "+f.indexOf("a"));
		System.out.println("indexOf(\"a\",12) : "+f.indexOf("a",12));   // "a": 찾는값 ,12: 시작위치
		System.out.println("indexOf(\"a\",12,17) : "+f.indexOf("a",12,17)); // 찾는값 , 시작위치, 끝위치+1  = a를 12 ->16까지 찾는다.
		System.out.println("lastIndexOf(\"a\") : "+f.lastIndexOf("a"));		// 마지막 위치를 찾음	
		System.out.println("lastIndexOf(\"a\",26) : "+f.lastIndexOf("a",26));
		System.out.println("contains(\"aBc\") : "+f.contains("aBc"));	//존재 유무 확인 true, false
		System.out.println("contains(\"qwe\") : "+f.contains("qwe"));
		System.out.println("startsWith(\"선생\") : "+f.startsWith("선생"));	//시작하는지에 대한 확인 true, false | contains보다 깐깐
		System.out.println("startsWith(\"님은\") : "+f.startsWith("님은"));
		System.out.println("endsWith(\"3a4\") : "+f.endsWith("3a4"));
		System.out.println("endsWith(\"12a\") : "+f.endsWith("12a"));  //끝나는지에 대한 확인 true, false | contains보다 깐깐
		
		System.out.println("------------");
		String ttt = "정우성,감우성,행주산성_진주성,안시성.꼭시성";
		String [] arr = ttt.split(",");
		String [] arr1 = ttt.split(",",2);
		
		System.out.println(Arrays.toString(arr)+":"+arr.length);
		System.out.println(Arrays.toString(arr1)+":"+arr1.length);
		//문자열->문자배열
		String [] arr2 = ttt.split("[.]");	// .은 대괄호가 필요하다
		System.out.println(Arrays.toString(arr2)+":"+arr2.length);
		
		System.out.println("------------");
		StringTokenizer stk = new StringTokenizer(ttt,",.");
		System.out.println(stk.hasMoreElements());	//다음 항목이 있는가
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());	//항목 꺼내기
		}
 		
		System.out.println("------------");
		String [] arr3 = {"차은우","자전거은우","비행기은우","바이크은우","킥보드은우"};
		//문자배열 -> 문자열  (문자열 배열만 가능)
		String qqq = String.join("@", arr3);
		System.out.println(qqq);
		
		//int [] arr4 = {111,22,333,444};
		//String rrr = String.join("@", arr4);
		
		
		/*
		 내사진.jpg
		 숙제.java
		 aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt 
		 */
		
//		String pic = "내사진.jpg";
//		String [] suc = {"숙제.java"};
//		String [] ase = {"aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt "};
//		
//		StringTokenizer a1 = new StringTokenizer(pic,".");
//		System.out.println(a1.nextElement());
		System.out.println("------------");
		String [] ffs = "내사진.jpg,숙제.java,aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt".split(",");
		for (String ff : ffs) {
			String [] bbs = ff.split("[.]");
			System.out.println(Arrays.toString(bbs)+bbs.length);
			System.out.println(bbs[bbs.length-1]);
		}
		
		System.out.println("------------");
		System.out.println(f.toUpperCase());
		
		System.out.println("------------");
		System.out.println(f.toLowerCase());
		
		System.out.println("------------");
		
		
//		String [] a2 = {"aBcd Efg HIJk lMn opQR"};
//		String a3 = String.join(" ", a2);
//		System.out.println(a3);
//		System.out.println(a3.toLowerCase());
//		char a4 = a3.charAt(0);	//arr[7]
//		System.out.println(a4.);
		String ori = "aBcd Efg HIJk lMn opQR";
		System.out.println(ori);
		String ret = "";
		for (String xx : ori.toLowerCase().split(" ")) {
//			System.out.println(xx.substring(0,1).toUpperCase()+xx.substring(1));
			ret += xx.substring(0,1).toUpperCase()+xx.substring(1)+ " ";
		}
		
		System.out.println(ret.substring(0,ret.length()-1));

		
		System.out.println("------------");
		ret = f.replace("a", "에이");
		System.out.println(ret);
		
		System.out.println("------------");
		ori = "      부트캠프     ";
		System.out.println(ori+":"+ori.length());
		ret = ori.trim();
		System.out.println(ret+":"+ret.length());
		
		System.out.println("------------");
		aa = "장수풍뎅이";
		bb = "사슴벌레";
		cc = aa+bb;
		System.out.println(cc);
		ee = aa.concat(bb);
		System.out.println(ee);
		
		
		
	}

}
