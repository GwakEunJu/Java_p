package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

	public static void main(String[] args) throws ParseException {
	Date now = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
	System.out.println(sdf.format(now));
	
	String [] ppArr= {
		"y","yy","yyy",
		"M","MM","MMM","MMMM",
		"d","dd","D","DD","DDD",
		"w","ww","W","WW",
		"E","EE","EEE","EEEE",
		"F",//이번달에서 요일이 몇번째인가
		"z","Z",
			//24시간  //12시간
		"a","H","HH","h","hh",
		"m","mm",
		"s","ss",
		"S","SSS"
	};
	
	
	Locale loc = new Locale("en");
	loc = new Locale("ko");
	
	for (String pp : ppArr) {
		sdf = new SimpleDateFormat(pp,loc);
		System.out.println(pp+" : "+sdf.format(now));
	}

//	//문자열로 Date 받기
//	sdf = new SimpleDateFormat("yyyy-MM-dd");
//	Date ddd = sdf.parse("1997-03-20");
//	System.out.println(ddd);
//	
//	//주민번호 형식으로 받기
//	sdf = new SimpleDateFormat("yyMMdd");
//	ddd = sdf.parse("970320");
//	System.out.println(ddd);
//	
//	sdf = new SimpleDateFormat("HH:mm:ss");
//	ddd = sdf.parse("13:45:27");
//	System.out.println(ddd);
//	
//	sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	ddd = sdf.parse("1999-06-23 13:45:27");
//	System.out.println(ddd);
//	//환산 가능
//	ddd = sdf.parse("1999-89-61 123:9888:1234");
//	System.out.println(ddd);
//	
	
	
	}

}
