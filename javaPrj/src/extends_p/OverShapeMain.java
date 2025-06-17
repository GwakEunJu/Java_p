package extends_p;

class Rectangle {
	String type;
	int border, area , h ,w;
	
	Rectangle (int w, int h) {
    type = "직사각형";
    this.w = w;
    this.h = h;
    
    //오버라이드가 되지 않음
//    border = w*h ;
//    area = (w+h)*2;
	}
	
	void calc () {
		border = w*h ;
		area = (w+h)*2;
	}
	
	void ppp() {
		calc ();
		System.out.println(type+" : "+border+","+area);
	}
}

class TriAngle extends Rectangle {
	int a;
	TriAngle(int w, int h, int a) {
		super(w, h);
		type = "직각삼각형";
		this.a=a;
		
		 //오버라이드가 되지 않음
//		border = w * h /2;
//		area = w + h + a;
	}
	
	@Override  // 오버라이드 되었다는 의미
	void calc () {
		border = w*h /2;
		area = w + h + a;
	}
	
}

public class OverShapeMain {

	public static void main(String[] args) {
		Rectangle rr = new Rectangle(5,6);
		TriAngle tt = new TriAngle(5,6,8);
		rr.ppp();
		tt.ppp();
	}

}
