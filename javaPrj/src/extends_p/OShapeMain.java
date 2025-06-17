package extends_p;

//도형 정보 계산 클래스를 완성하세요
//도형 정보 클래스 : 도형 종류, 넓이, 둘레  -- 정보 출력 메소드 void ppp()

//계산하는 calc()  메소드를 오버라이딩 하세요
//도형의 종류 : 사각형, 원, 직각삼각형

abstract class Shape {
	
	//멤버변수 선언
	String pname;
	int border, area;

	//생성자
	Shape(String pname) {
		super();
		this.pname = pname;
//		calc ();
	}
	
//	void calc () {}
	
	abstract void calc();
	
	void ppp() {
		String ttt = pname+"\t"+border+"\t"+area;
		System.out.println(ttt);
	}	
}

//상속
class Rec extends Shape {
	int w, h;
	//생성자
	Rec(int w, int h) {
		super("사각형");
		this.w = w;
		this.h = h;
		calc();
	}
	
	@Override
	void calc() {
		border = (w + h)*2;
		area = w * h;
	}
}

//상속
class Tri extends Shape {
	int w, h ,a;
	//생성자
	Tri (int w, int h,int a) {
		super("직각삼각형");
		this.w = w;
		this.h = h;
		this.a = a;
		calc();
	}
	
	@Override
	void calc() {
		border = w + h + a;
		area = w * h / 2;
	}
}

//상속
class Circle extends Shape {
	final double PI=3.14;   // 변하지 않는 값 상수이기 때문에 final
	int w;
	//생성자
	Circle(int w) {
		super("원");	 
		this.w = w;
		calc();
	}
	
	@Override
	void calc() {
		border =(int)(w * 2 * PI);  //형변환 필요 int - double
		area =(int)(w * w * PI);
	}
}

public class OShapeMain {

	//다형성
	public static void main(String[] args) {
		Shape [] sh = {
			new Rec(5, 6),
			new Tri(5, 6, 7),
			new Circle(5),
			new Rec(8, 8),
			new Tri(7, 7, 7),
			new Circle(10)
		};
		
		for (Shape ss : sh) {
			ss.ppp();
		}
	}

}

