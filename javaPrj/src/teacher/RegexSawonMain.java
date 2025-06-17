package teacher;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;
	

public class RegexSawonMain {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar ddd = Calendar.getInstance();
		

		while (true) {
			try {
//				System.out.println("사번 : ");
//				String ttt = sc.nextLine();
				String ttt = "c20020122_las";
						//	  0123456789012	
				if (!Pattern.matches("[a-d]\\d{8}_[a-z]{2,4}", ttt)) {
					throw new Exception();
				}
				
				String buseo = "영업부,인사부,두부,부부".split(",")[ttt.charAt(0)-'a'];
				System.out.println("부서 :"+buseo);
				System.out.println("이름 : "+ttt.substring(10));
				ddd.set(
					   Integer.parseInt(ttt.substring(1,5)),
					   Integer.parseInt(ttt.substring(5,7))-1,
					   Integer.parseInt(ttt.substring(7,9))
				);	   
						
				System.out.println("입사일 : ");
				
				
				ddd.add(Calendar.YEAR, 10);
				System.out.println("근속일 : ");
				RegexSawonMain.calToPPP(ddd);
				
				int wday = ddd.get(Calendar.DAY_OF_WEEK);
				
				int day_mm = 0;
				if(wday==7) {
					day_mm=-1;
				} else if (wday==1) {
					day_mm=-2;
				}
				
				
			
						
				

				break;

			} catch (Exception e) {
				System.out.println("다시 입력해주세요");

			}

			
		}
		System.out.println("프로그램 종료");
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
