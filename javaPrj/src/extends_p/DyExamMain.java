package extends_p;

/*
 추상화 + 오버라이딩 +상속
 * */


//클래스 정의
abstract class DyStud {
	
	//멤버필드 선언
	String pname, kind;
	int [] jum;
	int tot, avg;
	
	//생성자
	DyStud(String kind, String pname, int[] jum) {
	
		this.kind = kind;
		this.pname = pname;
		this.jum = jum;
		 totcalc();
	}
	
	void totcalc() {
		tot=0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	//void calc() {}
	abstract void calc();
	
	
	void ppp() {
		calc();
		String ttt = kind+"\t"+pname+"\t"+tot+"\t"+avg;
		System.out.println(ttt);
	}
	
}

//상속
class DyGen extends DyStud {

	DyGen(String pname, int kor, int eng, int mat) {
		super("인문계", pname, new int [] {kor, eng, mat});
	}
	
	@Override
	void calc() {
		avg =tot/jum.length;
	}
	
}

//상속
class DyArt extends DyStud {

	DyArt(String pname, int kor, int eng, int mat) {
		super("예체능", pname, new int [] {kor, eng, mat});
	}
	
	@Override
	void calc() {
		double [] rate = {0.1,0.2,0.7};
		for (int i = 0; i < rate.length; i++) {
			avg += jum[i] *rate[i];
		}
	}
	
}


/*
 * 
 * 추상메소드 calc()를 재정의 하지 않아 에러발생
class DyEmployee extends DyStud {

	DyEmployee(String pname, int kor, int eng) {
		super("회사원", pname, new int [] {kor, eng});
	}
	
	
}*/

public class DyExamMain {

	
	//선언은 부모, 생성은 자식 (다형성)
	public static void main(String[] args) {
		DyStud [] studs = {
				new DyGen("원빈", 37, 68, 91),
				new DyGen("현빈", 97, 68, 31),
				new DyArt("김우빈", 37, 68, 91),
				new DyArt("장희빈", 97, 68, 31),
				new DyGen("커피빈", 67, 68, 61),
				new DyArt("미스터빈", 67, 68, 61),
		};
		
	 for (DyStud st : studs) {
		st.ppp();
	}
	}

}
