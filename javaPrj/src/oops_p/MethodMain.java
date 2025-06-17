package oops_p;

class ClaMethod {
	/*
	클래스 정의부에 직접 실행코드 불가
	for(int i=0; i <100; i++) {
		
	}
	
	if(true) {
	
	}
	
	System.out.println();
	}*/
	
	//메소드 정의
	//리턴형 : int 
	//메소드 명: meth_1
	//매개변수 : String a, int b
	//리턴값 : 1234
	int meth_1(String a, int b) {
//		System.out.println("meth_1 실행 : " +a+", "+b+","+d);
		System.out.println("meth_1 실행 : " +a+", "+b);
		return 1234;
	}

	//매개변수 O, 리턴 X
	//param     ret
	//void - 리턴 없음
	void meth_2(String a, int b) {
//		System.out.println("meth_1 실행 : " +a+", "+b+","+d);
		System.out.println("meth_2 실행 return:x , " +a+", "+b);
//		return 1234;
		return;				
	}
	
	int meth_3() {
		System.out.println("meth_3 실행  ret:0, param: : X");
		return 5678;		
	}
	
	void meth_4() {
		System.out.println("meth_4 실행 ret:X, param: : X");
		return;
	}
	
	/* 
	  	리턴은 void or 1개만 가능
	 	int int meth_5() {
	 	
		System.out.println("meth_5 실행  ret:0, param: : X");
		return 100,200;		
	}*/
	
}


public class MethodMain {

	public static void main(String[] args) {
		//선언 , 생성
		ClaMethod cm = new ClaMethod();
		double d = 123.456;
		
		//메소드 호출
		//매개변수에 대입
		//String a = "아기상어" , int b = 10
		//리턴값을 메소드 리턴후 변수에 대입
		//rr =1234
		int rr = cm.meth_1("아기상어", 10);
		System.out.println("rr :"+rr);
		
		rr = cm.meth_1("엄마상어", 20);
		
		cm.meth_2("아빠상어", 30);
//		rr = cm.meth_2("아빠상어", 30);  리턴이 없으므로 불가
//		rr = cm.meth_3("엄마상어", 20);
		rr = cm.meth_3();
		System.out.println("rr :"+rr);
		
		cm.meth_4();
		System.out.println("rr :"+rr);
	}


}