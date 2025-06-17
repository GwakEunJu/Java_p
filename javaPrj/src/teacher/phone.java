package teacher;

/*
핸드폰 기본스펙
카메라 : 인문계카메라
이어폰 : 인문계이어폰
전화하기
사진찍기
게임하기


//핸드폰을 두개 사서 
//핸드폰1 ->카메라 : 광학 카메라
//핸드폰2 ->이어폰 : 블루투스 이어폰 으로 변경하세요

//핸드폰1 ->전화를 하고, 사진을 찍고
//핸드폰2 ->
*/

class HandPhone{
	String name,camera = "인문계카메라", earPhone="인문계이어폰";
	
	void call() {
		System.out.println(name+" "+earPhone+"으로 전화해요");
	}
	void photo() {
		System.out.println(name+" "+camera+" 사진 찍어요");
	}
	void game() {
		System.out.println(name+" 게임해요");
	}
}

public class phone {

	public static void main(String[] args) {
		HandPhone hp1 = new HandPhone();
		HandPhone hp2 = new HandPhone();
		hp1.name = "갤럭시";
		hp1.camera = "광학카메라";
		hp2.name = "어른폰";
		hp2.earPhone = "블루투스이어폰";
		
		System.out.println("hp1 "+hp1.name+","+hp1.camera+","+hp1.earPhone);
		System.out.println("hp2 "+hp2.name+","+hp2.camera+","+hp2.earPhone);
		
		hp1.call();
		hp1.photo();
		
		hp2.call();
		hp2.game();

	}

}
