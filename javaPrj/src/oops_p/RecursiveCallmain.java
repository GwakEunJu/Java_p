package oops_p;

//클래스 정의
class RecurCall {
	
	//필드선언
	String pre="";
	
	
	//재귀 함수
	
	//리턴타입 메서드 이름 (매개변수)
	int meth (int a) {   //  int a는 정수를 받겟다는 빈 상자 (매개변수)
		int res = a;
		String myPre=pre;
		pre+="\t";
		System.out.println(myPre+"시작 : "+a+", "+res);
				
		if(a>0) {//조건
	
		  //짝수 누적 더하기!	
		
			      // 증감 : a-1
			res += meth(a-1); //재귀 호출
	
		}

		
		System.out.println(myPre+"끝 : "+a+", "+res);
		
		return res;  // 홀수 시 리턴값 0
	}
}

public class RecursiveCallmain {

	public static void main(String[] args) {
		RecurCall rc = new RecurCall(); //인스턴스 생성
		
		System.out.println("확인 :"+rc);
		int ret = rc.meth(10); //초기값  2는 메서드에 넘겨주는 인자(인수)
		System.out.println("ret :"+ret);

	}

}
