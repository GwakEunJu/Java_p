package extends_p;

//캡슐화를 위한 setter, getter 사용 

//DTO는 데이터 전송용
class StudDTO {
	private String pname;
	private int kor, eng, mat;
//	private int tot, avg;

	public StudDTO(String pname) {
		this.pname = pname;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor < 0 || kor > 100) {
			System.out.println("국어 에러 입력");
			return;
		}
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng < 0 || eng > 100) {
			System.out.println("영어 에러 입력");
			return;
		}
		this.eng = eng;

	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		if (mat < 0 || mat > 100) {
			System.out.println("수학 에러 입력");
			return;
		}
		this.mat = mat;
	}

	public String getPname() {
		return pname;
	}

	public int getTot() {
		return kor + eng + mat;
	}

	public int getAvg() {
		return getTot()/3;
	}
	
	void ppp() {
		String ttt = pname+ "\t" + kor +"\t" + eng + "\t" + mat;
		ttt += "\t" +getTot() +"\t" + getAvg();
		
		System.out.println(ttt);
	}

}

public class CapsuleExamMain {

	public static void main(String[] args) {
		StudDTO st1 = new StudDTO("황영묵");
		st1.setKor(78);
 		//st1.setKor(178); if 문으로 제한 설정!
		st1.setEng(81);
		st1.setMat(62);
		System.out.println(st1.getPname());
		System.out.println(st1.getKor());
		System.out.println(st1.getEng());
		System.out.println(st1.getMat());
		System.out.println(st1.getTot());
		System.out.println(st1.getAvg());
		
		st1.ppp();


		

	}

}
