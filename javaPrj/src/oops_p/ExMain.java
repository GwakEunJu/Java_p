package oops_p;

//클래스 정의
class Ex {
	//필드정의
	int height, width, hypote,extent,circum ;
	String pname;
	
	void input (int height, int width, int hypote) {
		this.height = height;
		this.width = width;
		this.hypote = hypote;
		pname = "직각 삼각형";
	}
	//계산 메소드
	void calc () {
		extent = 0;
		circum = 0;
		
		extent = height * width / 2;
		circum = height + width + hypote;
		System.out.println(extent);
		System.out.println(circum);
		
	}


//출력 메소드
void ppp() {
	String nn = pname +"\t"+extent+"\t"+circum;
	System.out.println(nn);
}

}
public class ExMain {

	public static void main(String[] args) {
		
		Ex ttt = new Ex();
		
		ttt.input(10, 5, 6);
		
		ttt.calc();
		ttt.ppp();
	
		

	}

}
