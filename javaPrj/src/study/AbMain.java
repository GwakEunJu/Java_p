package study;

//클래스 추상화 정의
abstract class AbPlayer {
	
	//멤버필드 선언
	String pname;
	String now;
	
	//생성자
	public AbPlayer(String pname) {
		this.pname = pname;
	}
	
	//메소드 추상화 
	abstract void play(String title);

	abstract void suspend();

	abstract void stop();

}

//상속
class AbMp3 extends AbPlayer{

	AbMp3() {
		super("MP3");
	}

	@Override
	void play(String title) {
		System.out.println(pname+" : "+title+"\t시작해요");
		now = title;
		
	}

	@Override
	void suspend() {
		System.out.println(pname+" : "+now+"\t일시정지해요");
		
	}

	@Override
	void stop() {
		System.out.println(pname+" : "+now+"\t종료해요");
		
	}

}

class AbGame extends AbPlayer{

	AbGame() {
		super("game");
	}

	@Override
	void play(String title) {
		System.out.println(pname+" : "+title+"\t시작해요");
		now = title;
		
	}

	@Override
	void suspend() {
		System.out.println(pname+" : "+now+"\t일시정지해요");
		
	}

	@Override
	void stop() {
		System.out.println(pname+" : "+now+"\t종료해요");
		
	}

}

class AbTv extends AbPlayer{

	AbTv() {
		super("tv");
	}

	@Override
	void play(String title) {
		System.out.println(pname+" : "+title+"\t시청해요");
		now = title;
		
	}

	@Override
	void suspend() {
		System.out.println(pname+" : "+now+"\t잠시 중단해요");
		
	}

	@Override
	void stop() {
		System.out.println(pname+" : "+now+"\t종료해요");
		
	}

}

public class AbMain {

	public static void main(String[] args) {
		
		//인스턴스 생성
		AbPlayer mp3 = new AbMp3();
		AbPlayer game = new AbGame();
		AbPlayer tv = new AbTv();
		
		mp3.play("보라빛 밤");
		mp3.suspend();
		mp3.stop();
		
		game.play("카트라이더");
		game.suspend();
		game.stop();
		
		tv.play("알쓸신잡");
		tv.suspend();
		tv.stop();
		
		

	}

}
