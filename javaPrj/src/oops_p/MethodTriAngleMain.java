package oops_p;

class MethodTriAngle {
	String pname;
	int area,border, width, height, line;
	
	void input(int width, int height,int line) {
		this.width=width;
		this.height=height;
		this.line=line;
		
		pname = "작각 삼각형";
		
		calc(); //메소드 호출
		ppp();
	}
	
	void calc() {
		area = width * height / 2;
		border = width + height + line;
	}
	
	void ppp() {
		System.out.println(pname +":"+area+","+border);
	}
}

public class MethodTriAngleMain {

	public static void main(String[] args) {
		
		MethodTriAngle tal = new MethodTriAngle();
		
		tal.input(5, 6, 8);
		
//		tal.calc();
//		tal.ppp();
		

	}

}
