package extends_p;


class Exshape {
	String type;
	int border, area;	
	
	void ppp() {
		String ttt = type+"\t"+border+"\t"+area;
		System.out.println(ttt);
	}
}

class Exsqu extends Exshape {
	Exsqu (int w, int h) {
		this.type = "직사각형";
		border = w * h;
		area = (w+h)*2;
	}	
}
	
class Extri extends Exshape {
	Extri(int w, int h , int b) {
		this.type = "직각삼각형";
		border = w * h /2;
		area = w+ h+ b;
	}
}

public class ExtendsShape {

	public static void main(String[] args) {
		Exsqu [] qq = {
			new Exsqu(5,6),
			new Exsqu(7,9),
			new Exsqu(10,10),
		};
		
		Extri tt =  new Extri(10,10,6);
		
		for (Exsqu ss : qq) {
			ss.ppp(); 
		}
		
		tt.ppp();

	}
}
