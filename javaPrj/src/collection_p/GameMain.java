package collection_p;

import java.util.HashMap;
import java.util.TreeSet;

/*
//////오늘 경기 기록을 출력하세요
/// 입력: "h22","h23","h11","a3","a7","a22","h23","a11","h5","a3","h8","a11","h22","h23"..........

/// 출력내용
//h : 홈팀,  a:상대팀
//각 팀별로 선수가 안타를 친 갯수를 출력하세요
//단 선수번호는 오름차순으로 정렬

ex)

홈팀
22 : 2
23 : 3

...

상대팀
3 : 2
7 : 1
* */

class Home {

	@Override
	public String toString() {
		return "Home";
	}
	
}

class Away {
	@Override
	public String toString() {
		return "Away";
	}
}

public class GameMain {
		
	public static void main(String[] args) {
		String arr = "h22,h23,h11,a3,a7,a22,h23,a11,h5,a3,h8,a11,h22,h23";

		HashMap mm = new HashMap();
		
		for (String ttt : arr.split(",")) {
			int cnt = 1;
			if(mm.containsKey(ttt)) {
				cnt += (int)mm.get(ttt);
			}
			mm.put(ttt, cnt);
			
		}
		for (Object k : new TreeSet(mm.keySet())) {
			System.out.println(k+"\t"+mm.get(k));
		}
	
	

		
		
	}

}
