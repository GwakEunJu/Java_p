package study;



class RetAAA {
	int meth_1() {
		System.out.println("meth_1  실행");
		return 10;  // 리턴 이후 실행문 불가
	}
	
	//매개변수로 문자열을 받아서 조건에 따라 정수 반환
	int meth_2(String text) {
		System.out.println("meth_2  실행");
		
		if(text == "qq") {
		return 10;
	}
		System.out.println("meth_2  실행");
			
		if(text == "ww") {
		return 20;
	}
		System.out.println("meth_2  실행");
		
		return 30;
	}
	
	// 배열 자체를 반환하는 메소드
	int [] meth_4() {
		int [] ret = new int [] {11,22,33};
		System.out.println("meth_4 실행 : "+ret);
		return ret;
	}
	
	RetData dataMake(String pname, int age) {
//		System.out.println("dataMake 실행 : "+pname+","+age);
		
		RetData ret = new RetData();
		ret.input(pname, age, true);
		return ret;
	}
		
		
	
}

class RetData {
	
	//필드 선언
	String pname;
	int age;
	boolean marrige;
	
	//입력메소드
	void input (String pname, int age,boolean marrige ) {
		this.pname = pname;
		this.age = age;
		this.marrige = marrige;
	}
	
	//출력 메소드
	void ppp() {
		System.out.println(this+","+pname+","+age+","+marrige);
	}
}

public class RetStudyMain {

	public static void main(String[] args) {
		
		RetAAA ra = new RetAAA();
		
		int rr = ra.meth_1();
		System.out.println("rr : "+rr);
		
		rr= ra.meth_2("ee");
		System.out.println("rr : "+rr);
		
		RetData rd = new RetData();
		rd.input("박보검", 17, false);
		rd.ppp();
		
		RetData rd2 = ra.dataMake("박보물",27);
		System.out.println("rd2 : "+rd2);
		rd2.ppp();
		
		RetData [] dataArr = {
		       ra.dataMake("박보름",17),	
		       ra.dataMake("박보물",27),	
		       ra.dataMake("박보석",37),	
		       ra.dataMake("박보건",47),	
		       ra.dataMake("박보겁",57)      
		};
		
		// 기본 버전
//		for (int i = 0; i < dataArr.length; i++) {
//			dataArr[i].ppp();
//		}
		
		//간결 버전
		for (RetData zxc : dataArr) {
			zxc.ppp();
		}

	}

}
