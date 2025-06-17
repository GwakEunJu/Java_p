package teacher;

class CapsuleMovie {
	
	
	//final 초기화 : 멤버필드 선언시 초기화
	// 			   생성자에서 초기화 (둘 중 하나만/ 모두 적용시 에러)
	
	private final String id, time;
	private final int seat;
	private String pname, tel;
	
	public CapsuleMovie(String id, String pname, String tel, String time, int seat) {
		
		this.id = id;
		this.pname = pname;
		this.tel = tel;
		this.time = time;
		this.seat = seat;
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

	public String getTime() {
		return time;
	}

	public int getSeat() {
		return seat;
	}
	
	void ppp() {
		String ttt = id + "\t" + pname + "\t" + tel + "\t" + time + "\t" + seat;
		System.out.println(ttt);
	}
	
	
}

public class CapsuleMovieMain {

	public static void main(String[] args) {
		CapsuleMovie cm = new CapsuleMovie("asdf", "황일묵", "010-0000-0000" , "2", 17);
		cm.setPname("황이묵");
		cm.setTel("010-1111-2222");
		cm.ppp();
		System.out.println("아이디: "+cm.getId());
		System.out.println("이름 : "+cm.getPname());
		System.out.println("전화번호 : "+cm.getTel());
		System.out.println("상영시간 : "+cm.getTime());
		System.out.println("좌석번호 : "+cm.getSeat());
		
		

	}

}
