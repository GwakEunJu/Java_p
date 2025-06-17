package study;

//인터페이스 기본 정리

//인터페이스 선언!
interface In_1 {
	
	// public static String a = "In_1_a";와 같음
	// interface 는 public만 가능, 중첩 시 private, protected, default 가능 
	String a = "In_1_a";
	public static String b = "In_1_b";
	
	
	// public abstract void meth_1();과 같음
	void meth_1();
	void meth_2();
	
	abstract void meth_3();
	
	//메소드 정의부 명시 불가
	//void meth_2() {}
}

//인터패이스 구현 - 메소드 재정의 필수!
class Cla_1 implements In_1 {

	@Override
	public void meth_1() {
		System.out.println("Cla_1 meth_1()");
		
	}

	@Override
	public void meth_2() {
		System.out.println("Cla_1 meth_2()");
		
	}

	@Override
	public void meth_3() {
		System.out.println("Cla_1 meth_3()");
		
	}	
}


public class InterMain {

	public static void main(String[] args) {
		
		//인터페이스는 직접 인스턴스를 생성할 수 없다.
		//익명 구현클래스를 생성하여 사용.
		In_1 i1 = new In_1() {

			@Override
			public void meth_1() {
				System.out.println("생성시 재정의 meth_1()");
				
			}

			@Override
			public void meth_2() {
				System.out.println("생성시 재정의 meth_2()");
				
			}

			@Override
			public void meth_3() {
				System.out.println("생성시 재정의 meth_3()");
				
			}
		};
		
		System.out.println("i1 : "+i1.a+", "+i1.b);
		i1.meth_1();
		i1.meth_2();
		i1.meth_3();
		
			
		Cla_1 cc = new Cla_1();
		System.out.println("cc : "+ cc.a+", "+cc.b);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		
		
		

	}

}
