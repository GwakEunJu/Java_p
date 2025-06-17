package collection_p;

//mp3 노래듣기를 구현하세요

//1. 노래 정보 :  트랙번호, 노래제목, 가수
//2. 노래 리스트 -->next 에 넣기
//3. 구현내용 다음곡, 이전곡, 트랙번호

import java.util.Stack;

public class MusicPlayerMain {

	Object now = null;
	Stack back = new Stack();
	Stack next = new Stack();

	MusicPlayerMain() {
		goMusic(1,"노래","가수");
		
		

	}

	void goMusic(int no, String music, String name) {
		System.out.println("goMusic("+no+", " + music +", "+name+ ")-----------------");
		if (now != null) {
			back.push(now);
		}
		
		now = music;
		ppp();
	}

	void goBack(int no, String music, String name) {
		System.out.println("goBack("+no+", " + music +", "+name+ ")-----------------");
		if(!back.empty()) {
			next.push(now);
			now=back.pop();
		}  else {
			System.out.println("이전 노래가 없습니다.");
		}
		
		ppp();
	}

	void goNext(int no, String music, String name) {
		System.out.println("goNext("+no+", " + music +", "+name+ ")-----------------");

		if (!next.empty()) {
			back.push(now);
			now=next.pop();
		} else {
			System.out.println("다음 노래가 없습니다.");
		}

		ppp();
	}

	void ppp() {
		System.out.println("현재 : " + now);
		System.out.println("이전 : " + back);
		System.out.println("다음 : " + next);

	}

	public static void main(String[] args) {
		new MusicPlayerMain();

	}

}
