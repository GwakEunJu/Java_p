package extends_p;

//부모 클래스 정의
class ExPar {
	
	//멤버 필드 선언
	String a = "부모a";
	
	//메소드 정의
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
}

class Uncle {
	
}

/*
 클래스 상속 정의 
 class 부모 클래스 {
 ....
 }
 
 class 자식 클래스 extends 부모 클래스 {
 ...
 }
 
 */

//자식 클래스 정의
class ExChild1 extends ExPar { // , Uncle { 다중상속 불가
	
	//멤버 필드 선언 
	String b = "자식1b";
	
	//메소드 정의
	void meth_2() {
		System.out.println("자식1 meth_2() 실행");
	}
}



class ExChild2 extends ExPar { 
	
	//멤버 필드 선언 
	String c = "자식2c";
	
	//메소드 정의
	void meth_3() {
		System.out.println("자식2 meth_3() 실행");
	}
}


public class ExtendsMain {

	public static void main(String[] args) {
		ExPar pp= new ExPar();
		ExChild1 cc1 = new ExChild1();
		ExChild2 cc2 = new ExChild2();
		
			
		System.out.println("pp : "+pp.a);
		//System.out.println("pp : "+pp.b); 부모 인스턴스는 자식멤버 요소 접근불가
		pp.meth_1();
		//pp.meth_2();
		
		//자식인스턴스 부모멤버요소 접근 가능 
		System.out.println("cc1 : "+cc1.a);
		System.out.println("cc1 : "+cc1.b);
		//System.out.println("cc1 : "+cc1.c); 형제멤버 요소 접근불가
		cc1.meth_1();
		cc1.meth_2();
		//cc1.meth_3();
		
		//자식인스턴스 부모멤버요소 접근 가능 
		System.out.println("cc2 : "+cc2.a);
		//System.out.println("cc2 : "+cc2.b);
		System.out.println("cc2 : "+cc2.c);
		cc2.meth_1();
		//cc2.meth_2();
		cc2.meth_3();
		
		
		
		
	}

}
