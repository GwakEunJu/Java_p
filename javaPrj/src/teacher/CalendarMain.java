package teacher;

import java.util.Calendar;

public class CalendarMain {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		calToPPP(today);
	}
		

	static void calToPPP(Calendar cc) {
		String ttt = cc.get(Calendar.YEAR)+"년 ";
		ttt += cc.get(Calendar.MONTH)+1+"월 ";
		ttt += cc.get(Calendar.DATE)+"일 (";
		ttt += " 일월화수목금토".charAt(cc.get(Calendar.DAY_OF_WEEK))+"요일) ";
		ttt += cc.get(Calendar.HOUR_OF_DAY)+":";
		ttt += cc.get(Calendar.MINUTE)+":";
		ttt += cc.get(Calendar.SECOND)+".";
		ttt += cc.get(Calendar.MILLISECOND);
		
		System.out.println(ttt);
	}
	
}
