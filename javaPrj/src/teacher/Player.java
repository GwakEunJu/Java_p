package teacher;

//추상화 문제
// 부모 - 플레이어를 만드세요
// 플레이어에 반드시 있어야 하는 기능: 재생, 일시정지, 종료

// 자식 - MP3, 게임기, TV
// 부가적 기능은 알아서 넣으세요

abstract class AbPlayer {
	String pname;
	String now;

	AbPlayer(String pname) {

		this.pname = pname;
	}

	abstract void play(String title);

	abstract void suspend();

	abstract void stop();
}

class AbMp3 extends AbPlayer {

	AbMp3() {
		super("MP3");
	}

	@Override
	void play(String title) {
		System.out.println(pname + " " + title + "시작해요");
		now = title;

	}

	@Override
	void suspend() {
		System.out.println(pname + " " + now + "일시정지해요");

	}

	@Override
	void stop() {
		System.out.println(pname + " " + now + "종료해요");
	}
}

class Abgame extends AbPlayer {

	Abgame() {
		super("game");
	}

	@Override
	void play(String title) {
		System.out.println(pname + " " + title + "시작해요");
		now = title;

	}

	@Override
	void suspend() {
		System.out.println(pname + " " + now + "일시정지해요");

	}

	@Override
	void stop() {
		System.out.println(pname + " " + now + "종료해요");
	}
}

class AbTv extends AbPlayer {

	AbTv() {
		super("Tv");
	}

	@Override
	void play(String title) {
		System.out.println(pname + " " + title + "시청해요");
		now = title;

	}

	@Override
	void suspend() {
		System.out.println(pname + " " + now + "시청중단해요");

	}

	@Override
	void stop() {
		System.out.println(pname + " " + now + "끝났어요");
	}
}

public class Player {

	public static void main(String[] args) {
		AbPlayer mp3 = new AbMp3();
		AbPlayer tv = new AbTv();
		AbPlayer gemes = new AbTv();

		mp3.play("노래");
		mp3.suspend();
		mp3.stop();

		gemes.play("보글보글");
		gemes.suspend();
		gemes.stop();

		tv.play("전설의고향");
		tv.suspend();
		tv.stop();

	}

}
