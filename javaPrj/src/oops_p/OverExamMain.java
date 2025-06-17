package oops_p;

//클래스 정의
class OverStud {
	
	//필드선언
	String pname, kind;
	int [] jum;
	int tot, avg;
	
	
	//Overloading 1 (메소드 정의)
	void input(String pname, int kor, int eng, int mat) {
		kind = "인문계";
		this.pname = pname;
		jum = new int[] {kor,eng,mat};
	}
	
	//Overloading 2
	void input(String pname, int kor, int eng, int mat, int art) {
		kind = "예체능";
		this.pname = pname;
		jum = new int[] {kor,eng,mat,art};
		
	}
	
	//계산 메소드
	void calc() {
		tot =0;
		avg=0;
		
		double [] rate = {0.1, 0.15,0.2,0.55};
		for (int i=0; i<jum.length; i++) {
			tot += jum[i];
			avg += jum[i]*rate[i];
		}	
		
		if(kind == "인문계") {
			avg = tot /jum.length;
		}
	}
	
	//출력 메소드
	void ppp() {
		calc();
		String ttt = kind+"\t"+pname+"\t";
		
		for (int i : jum) {
			ttt += i+"\t";
		}
		
		if(kind == "인문계") {
			ttt+="\t";
		}
		
		ttt += tot+ "\t"+avg;
		System.out.println(ttt);
	}
}

public class OverExamMain {

	public static void main(String[] args) {
		
		//클래스 기반으로 인스턴스 생성
		OverStud st1 = new OverStud();
		OverStud st2 = new OverStud();
		OverStud st3 = new OverStud();
		OverStud st4 = new OverStud();
		OverStud st5 = new OverStud();
		
		//메소드 호출에서 인스턴스 값 설정
		st1.input("조인성", 36, 68, 91);
		st2.input("감우성", 96, 68, 31);
		st3.input("감수성", 66, 68, 61, 64);
		st4.input("수용성", 36, 58, 71, 94);
		st5.input("남한산성", 96, 78, 51, 34);
		
		//메소드 호출에서 호출 
		st1.ppp();
		st2.ppp();
		st3.ppp();
		st4.ppp();
		st5.ppp();
		

	}

}
