package oops_p;

class MethodStud {
	
	//필드선언 
	int ban, tot , avg;
	String pname;	 //전화번호는 0부터 시작하는 경우가 많기때문에 문자열로 한다.
	int [] jum;  // null이면 for문을 돌릴수없다 주소가 없기 때문
	
	
	//매개변수, 지역변수는 멤버필드와 중첩가능
	void input(int ban, String nn, int kor, int eng, int mat) {
		int a = 10; //지역변수
		//String nn = "장수풍뎅이"; 매개변수와 지역변수는 중첩불가
		//ban : 지역, 매개변수
		//this.ban : 멤버필드
		System.out.println("입력이지롱: "+ban+","+this.ban+","+a);
		this.ban = ban;
		pname = nn;
		jum = new int[] {kor,eng, mat};
	}
	
	
	//계산 메소드
	void calc() {
		System.out.println("계산이지롱");
		
		// 메소드의 중복호출 시 누적처리 되지 않기 위해 필드 초기화 
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		
		avg = tot / jum.length;
	}
	
	//출력 메소드
	void  ppp() {
		String ttt =ban+ "\t"+pname ;
		
		for (int i : jum) {
		ttt += "\t"+i;	
		}
		ttt += "\t" + tot+ "\t"+avg;
		System.out.println(ttt);
	}
}

public class MethodExamMain {

	public static void main(String[] args) {
//		MethodStud st1 = new MethodStud();
//		MethodStud st2 = new MethodStud();
		
//		MethodStud[] studs = {st1, st2, new MethodStud()};
		
//		st1.input(2, "한가인", 89, 76, 81);
//		st2.input(3, "두가인", 59, 56, 51);
		
//		MethodStud[] studs = {new MethodStud(), new MethodStud(), new MethodStud()};
//		MethodStud[] studs = new  MethodStud[]{
//				new MethodStud(),
//				new MethodStud(), 
//				new MethodStud()
//				};
		MethodStud[] studs = new MethodStud[3];  //null로 빈칸만 만들어준 것
		
//		studs[0] = new MethodStud();
//		studs[1] = new MethodStud();
//		studs[2] = new MethodStud();
		
		for (int i = 0; i < studs.length; i++) {
			studs[i] = new MethodStud();
		}
		
		studs[0].input(2, "한가인", 89, 76, 81);
		studs[1].input(3, "두가인", 59, 56, 51);
		studs[2].input(2, "세가인", 99, 96, 91);
//		
//		st1.calc();
//		st2.calc();
//		
//		st1.ppp();
//		st2.ppp();
		
		for (int i = 0; i < studs.length; i++) {
			studs[i].calc();
			studs[i].ppp();
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
