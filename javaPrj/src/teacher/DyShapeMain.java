package teacher;

abstract class DyShape {
	String pname;
	int area, border;

	DyShape(String pname) {

		this.pname = pname;
	}

	//void calc() {}
	
	abstract void calc();

	void ppp() {
		System.out.println(pname + "\t" + area + "\t" + border);
	}
}

class DyRec extends DyShape {

	int w, h;

	DyRec(int w, int h) {
		super("직사각형");
		this.w = w;
		this.h = h;
		calc();
	}
	@Override
	void calc() {
		area = w * h;
		border = (w + h) * 2;
	}
}

class DyTri extends DyShape {

	int w, h, a;

	DyTri(int w, int h, int a) {
		super("직사각형");
		this.w = w;
		this.h = h;
		this.a = a;
		calc();
	}
	@Override
	void calc() {
		area = w * h / 2;
		border = w + h + a;
	}
}

class DyCircle extends DyShape {

	int r;

	DyCircle(int r) {
		super("원");
		this.r = r;
		calc();
	}
	@Override
	void calc() {
		double PI = 3.141592;
		area = (int) (r * r * PI);
		border = (int) (r * 2 * PI);
	}
}

public class DyShapeMain {

	public static void main(String[] args) {
		DyShape[] arr = { new DyRec(5, 6), new DyTri(5, 6, 8), new DyCircle(5) };

		for (DyShape ds : arr) {
			ds.ppp();
		}
	}
}
