package util_p;

import java.util.Calendar;

public class CalDiaryMain {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		calToPPP(today);

		//현재의 날짜의 일(day) 값을 가져와서 변수 now에 저장(오늘이 6일이면 now= 6)
		int now = today.get(Calendar.DATE);
		//현재 달의 마지막 날짜를 구해서 변수 
		int last = today.getActualMaximum(Calendar.DATE);
		//현재 날짜 객체 today의 일(day) 값을 1로 설정 -> 이번달 1일로 날짜변경
		today.set(Calendar.DATE, 1);
		//이번 달 1일의 요일 정보를 가져옴 (1=일요일 , 7=토요일) 
		int first = today.get(Calendar.DAY_OF_WEEK);
		//달력의 첫 줄에 1일 이전의 빈 공간을 출력 (요일 정렬을 위한 탭)
		//예: 1일이 수요일이면 앞에 일, 월은 빈칸으로 출력
		for (int i = 1; i < first; i++) {
			System.out.println("\t"); //탭으로 빈공간 출력
		}
		//이번 다 ㄹ1일부터 마지막 날까지 반복하며 날짜를 출력
		for (int i = 1; i <= last; i++) {
			//현재 출력할 날짜(i)를 today 객체에 설정			
			today.set(Calendar.DATE, i);
			//날짜 앞뒤에 붙일 문자열 초기값 설정
			String pre = " ", sur = "\t";
			//만약 현재 날짜가(i) 오늘(now)라면, [] 감싸기
			if (now == i) {
				pre = "[";
				sur = "]" + sur;
			}
			//날짜 출력
			System.out.print(pre + i + sur);

			//요일이 토요일(7)이면 줄 바꿈 (한 주가 끝났기 때문)
			if (today.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.println();
			}

		}

	}

	static void calToPPP(Calendar cc) {
		//cc에서 연도를 가져와 "년"을 붙여서 문자열 ttt에 저장
		String ttt = cc.get(Calendar.YEAR) + "년 ";
		//cc에서 월을 가져오고 +1을 해서 (월은0부터 시작) "월"을 붙여서 이어 붙임
		ttt += cc.get(Calendar.MONTH) + 1 + "월 ";
		//cc에서 일을 가져와 "일 (" 형태로 이어 붙임
		ttt += cc.get(Calendar.DATE) + "일 (";
		// 요일을 가져와 요일 문자 중 해당 인덱스의 문자로 변환하여 붙임
	    // Calendar.DAY_OF_WEEK는 1~7 범위를 가지며, " 일월화수목금토" 문자열에서 해당 문자 추출
		ttt += " 일월화수목금토".charAt(cc.get(Calendar.DAY_OF_WEEK)) + "요일) ";
		// 시(24시간 기준)를 붙임
		ttt += cc.get(Calendar.HOUR_OF_DAY) + ":";
		// 분을 붙임
		ttt += cc.get(Calendar.MINUTE) + ":";
		// 초를 붙임
		ttt += cc.get(Calendar.SECOND) + ".";
		// 밀리초를 붙임
		ttt += cc.get(Calendar.MILLISECOND);

		System.out.println(ttt);

	}

}
