package teacher;

/*
도형 클래스를 구현하세요

생성자 매개변수 갯수로 도형을 구분할 것

도형 : 사각형, 직각삼각형

출력 : 도형(사각형, 직각삼격형)의 넓이, 둘레

-----------------------------------------

사각형의 넓이 : 30, 둘레 : 22

직각삼각형의 넓이 : ?, 둘레: ?

*/

class ConstShape {
	String pname;
	int area, border;
	
	
	ConstShape(int w, int h) {
		pname = "사각형";
		area = w*h;
		border  = (w + h)*2;
	}
	
	ConstShape(int w, int h, int a) {
		pname = "직각삼각형";
		area = w*h /2;
		border  = w + h + a;
	}
	
	
	void ppp() {
		System.out.println(pname + "\t"+area+"\t"+border);
	}
}

public class ConstShapeMain {

	public static void main(String[] args) {
		ConstShape [] shape = {
			new ConstShape(5,6),
			new ConstShape(5,6,8),
			new ConstShape(10,10),
			new ConstShape(15,8,20),
			new ConstShape(10,7,15)
		};
		
		for (ConstShape sh : shape) {
			sh.ppp();
		}

	}

}
