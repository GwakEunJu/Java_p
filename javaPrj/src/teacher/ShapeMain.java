package teacher;

/*
도형클래스를 제작하고 input() 의 매개변수에 따라 
원, 사각형을 구분하여 
도형종류, 넓이, 둘레길이를  출력하세요

*/

class OverShape{
	String pname;
	int area, border;
	
	void input(int w, int h) {
		pname = "직사각형";
		area = w * h;
		border = (w + h) * 2;
	}
	
	void input(int r) {
		double PI = 3.141592;
		pname = "원";
		area = (int)(r * r * PI);
		border = (int)(r * 2 * PI);
	}
	
	void ppp() {
		System.out.println(pname+"\t"+area+"\t"+border);
	}
}

public class ShapeMain {

	public static void main(String[] args) {
		OverShape os = new OverShape();
		os.input(5, 6);
		os.ppp();
		os.input(5);
		os.ppp();
		

	}

}
