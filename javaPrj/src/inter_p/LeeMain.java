package inter_p;

/*
 이미르를 구현하세요
 엄마를 만날때 - 밥 줘요, 잔소리좀
 선생님을 만날때 - 가르쳐주세요. 잔소리좀
 남친을 만날때 - 놀러가자, 게임하자 
 * */

interface Mom {
	void bob();
	void jan();
}

interface Teac {
	void stud(String j);
	void jan();
}

interface Boy {
	void play(String a);
	void game();
}

class Mir implements Mom, Teac, Boy {
	
	final private String pname;
	
	int bobCnt=0, janCnt=0, studCnt=0, playCnt=0, gameCnt=0;
	
	Mir(String pname) {
		this.pname = pname;
	}

	@Override
	public void bob() {
		System.out.println(pname+"밥주세요");
		bobCnt++;
		
	}

	@Override
	public void jan() {
		System.out.println(pname+" 잔소리좀");
		janCnt++;
	}
	
	@Override
	public void stud(String j) {
		System.out.println(pname+j+" 가르쳐주세요");
		studCnt++;
	}


	@Override
	public void play(String a) {
		System.out.println(pname+a+" 놀러가자");
		playCnt++;
	}

	@Override
	public void game() {
		System.out.println(pname+" 게임하자");
		gameCnt++;
	}	
	
	void ppp() {
		String aa = pname +": "+bobCnt + " ," + janCnt + ", "+ studCnt + ", "+ playCnt + ", "+ gameCnt;
		System.out.println(aa);
	}
	
}

public class LeeMain {

	public static void main(String[] args) {
		
		Mom m;
		Teac t;
		Boy bo;
		
//		Mir mm1 = new Mir("엄마 ");
//		Mir mm2 = new Mir("선생님 ");
//		Mir mm3 = new Mir("남친 ");
		
		Mir [] mm = {
			new Mir("엄마 "),
			new Mir("선생님 "),	
			new Mir("남친 ")
		};
		
		m=mm[0];
		t=mm[1];
		bo=mm[2];
		
		m.bob();
		t.stud("Java");
		bo.play("공원");
		bo.game();
		bo.play("멀리");
		t.stud("React");
		
		for (Mir tot : mm) {
			tot.ppp();
		}
		
		
	}

}
