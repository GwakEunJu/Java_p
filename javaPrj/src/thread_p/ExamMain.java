package thread_p;

// 인스턴스를 어떻게 다룰건가에 대한 문제 - Thread의 기법이 아님

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

class ThTimer extends Thread {
	// 제어
	boolean endChk = false;
	
	@Override
	public void run() {
		for (int i = 15; i > 0; i--) {
			
			if(endChk) {
				break;
			}
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 제어
		endChk = true;
		System.out.println("타이머 종료");	
	}
}

class ThExam extends Thread {
	
	LinkedHashMap<String, String> exam;
	
	ThTimer tm;	//ThTimer를 멤버필드로 가져온다.
	
	//문제 출제 - 문제와 답
	ThExam(ThTimer tm) {
		this.tm = tm;
	exam = new LinkedHashMap<String, String>();
	exam.put("동네주민","임");
	exam.put("범인은?","b");
	exam.put("1+1","귀");
	exam.put("숙제는","없어");
	exam.put("내일은","보강");
	//        문제,    답			
	}
	
	@Override
	public void run() {
		int cnt = 0;	// 정답 갯수
		for (Map.Entry<String, String> qq : exam.entrySet()) {
			
			if(tm.endChk) {	//타이머가 끝났는지 확인
				break;
			}
			
			String answer = JOptionPane.showInputDialog(qq.getKey());  // 화면처럼 UI
			
			if(tm.endChk) { //타이머가 끝났는지 확인- 혹시몰라서 한번 더 
				break;
			}
			
			if(answer.equals(qq.getValue())) {
				cnt++;
			}
			
			System.out.println(answer);
		}
		tm.endChk = true;
		System.out.println("시험 종료 : "+cnt);
	}
}

public class ExamMain {

	public static void main(String[] args) {
		ThTimer timer = new ThTimer();
		ThExam ex = new ThExam(timer);
		
		timer.start();
		ex.start();
	}

}
