package extends_p;

//부모 - 플레이어를 만드세요
//플레이어에 반드시 있어야 하는 기능: 재생, 일시정지, 종료

//자식 - MP3, 게임기, TV
//부가적 기능은 알아서 넣으세요

abstract class Pla {

	// 공통데이터 멤버필드 선언 안됨

	// 생성자 없음

	// 추상화는 3가지 다 해줘야함
	abstract void play();
}

class Mp3 extends Pla {

	// 중복코드가 많아서 재사용, 코드 수정이 힘든 코드
	Mp3() {
		System.out.println("MP3");
	}

	@Override
	void play() {
		System.out.println("재생합니다.");
	}
	
	void st() {
		System.out.println("일시정지합니다.");
	}

	void en() {
		System.out.println("종료합니다.");
	}
}

class Game extends Pla {

	Game() {
		System.out.println("game");
	}

	@Override
	void play() {
		System.out.println("재생합니다.");
	}

	void st() {
		System.out.println("일시정지합니다.");
	}

	void en() {
		System.out.println("종료합니다.");
	}
}

class TV extends Pla {

	TV() {
		System.out.println("TV");
	}

	@Override
	void play() {
		System.out.println("재생합니다.");
	}

	void st() {
		System.out.println("일시정지합니다.");
	}

	void en() {
		System.out.println("종료합니다.");
	}
}

public class Player {

	public static void main(String[] args) {
		Mp3 m = new Mp3();
		m.st();
		Game g = new Game();
		g.play();
		TV t = new TV();
		t.en();

	}

}
