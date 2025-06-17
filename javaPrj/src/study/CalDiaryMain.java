package study;

import java.util.Calendar;

public class CalDiaryMain {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		calToPPP(today);

		int now = today.get(Calendar.DATE);

		int last = today.getActualMaximum(Calendar.DATE);
		today.set(Calendar.DATE, 1);
		int first = today.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < first; i++) {

			System.out.println("\t");
		}

		for (int i = 1; i <= last; i++) {
			today.set(Calendar.DATE, i);
			String pre = " ", sur = "\t";
			if (now == i) {
				pre = "[";
				sur = "]" + sur;
			}
			System.out.print(pre + i + sur);

			if (today.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.println();
			}

		}
	}

	static void calToPPP(Calendar cc) {
		String ttt = cc.get(Calendar.YEAR) + "년 ";
		ttt += cc.get(Calendar.MONTH) + 1 + "월 ";
		ttt += cc.get(Calendar.DATE) + "일 (";
		ttt += " 일월화수목금토".charAt(cc.get(Calendar.DAY_OF_WEEK)) + "요일) ";
		ttt += cc.get(Calendar.HOUR_OF_DAY) + ":";
		ttt += cc.get(Calendar.MINUTE) + ":";
		ttt += cc.get(Calendar.SECOND) + ".";
		ttt += cc.get(Calendar.MILLISECOND);

		System.out.println(ttt);

	}

}