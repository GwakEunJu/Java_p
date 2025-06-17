package oops_p;


// 정의 (클래스 정의)
class Spec {
	
	// 필드 - 멤버변수 (힙영역 저장)
	String camera = "인문계카메라";
	String ear = "인문계이어폰";
	String name;
	
	
	// 메소드
	void call() {
		System.out.println("전화를 하고");
	}
	
	void pic() {
		System.out.println("사진을 찍고");
	}
	
	void game() {
		System.out.println("게임을 해요");
	}
}

public class PhoneMain {

	public static void main(String[] args) {
		
		// 선언+생성
		Spec phone1 = new Spec();
		Spec phone2 = new Spec();
		
		
		phone1.camera = "광학카메라";
		phone2.ear = "블루투스 이어폰";
		phone1.name = "핸드폰1";
		phone2.name = "핸드폰2";
		
		
		//호출
		System.out.println(phone1.name+" : "+ phone1.camera+" ,"+ phone1.ear);
		phone1.call();
		phone1.pic();
		
		System.out.println(phone2.name+" : "+ phone2.camera+" ,"+ phone2.ear);
		phone2.call();
		phone2.game();
		
	}

}
