package extends_p;


/*
 영화예약 클래스를 생성하여 출력해보세요
 예약시 필수 입력 사항 : id, 성명, 전화번호, 상영시간, 좌석번호
 예약 후 변경 가능사항 : 성명, 전화번호
 출력 시 모두 나와야 함
 
 */

class MMM {
	private String id, pname, tel;
	private int hor, no;

	public MMM(String id, String pname, String tel, int hor, int no) {

		this.id = id;
		this.pname = pname;
		this.tel = tel;
		this.hor = hor;
		this.no = no;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public int getHor() {
		return hor;
	}

	public int getNo() {
		return no;
	}

	void ppp() {
		String ttt = id + "\t" + pname + "\t" + tel + "\t" + hor + "시간" + "\t" + no + "번";
		System.out.println(ttt);
	}

}

public class MoMain {

	public static void main(String[] args) {
		MMM m1 = new MMM("와아앙", "홍길동", "010-1234-5678", 2, 36);
		MMM m2 = new MMM("와아앙", "고길동", "010-1234-2222", 3, 14);

		m1.setPname("서길동");
		m1.setTel("010-1234-7894");

		m1.ppp();
		m2.ppp();

	}

}
