package lang_p;

/*
 배열로 묶은 다음 모든 도형들의 넓이 합계를 출력하세요
 원 - 넓이
 직사각형 - 넓이, 둘레
 
 */

class Circle {
	String name;
	int area;


	public Circle(String name, int area) {
		this.name = name;
		this.area = area;
	}

	@Override
	public String toString() {
		
		return name + "\t" + "\t" + area;
	
  }
	
	

}
class Rec {
	String name;
	int border, area;
	
	public Rec(String name, int border, int area) {
		this.name = name;
		this.border = border;
		this.area = area;
	}

	@Override
	public String toString() {
		return name + "\t" + border + "\t" + area;
	}
	

}

public class ObjShapeMain {

	public static void main(String[] args) {
		Object [] shape = {
			new Circle("원", 73),
			new Rec("직사각형", 73, 54),
			new Circle("원", 53),
			new Rec("직사각형", 63, 84),
			new Rec("직사각형", 53, 14),
			new Circle("원", 93),
			new Circle("원", 63)
			
		};
		
		for (Object oo : shape) {
			System.out.println(oo);
		}
		
	}

}


