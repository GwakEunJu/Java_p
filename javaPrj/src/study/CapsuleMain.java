package study;

class StudDTO {
	//캡슐화를 위한 접근제한자 사용, private는 객체 내부에서만 생성, 호출 가능
 	private String pname;
 	private int kor, eng, mat;
 	
	public StudDTO(String pname) {
		this.pname = pname;
	}

	public int getKor() {
		return kor;
	}

	// 유효한 데이터 값만 받기 위해 if문 사용
	public void setKor(int kor) {
		if(kor < 0 || kor > 100) {
			System.out.println("국어 에러 입력");
			return;
		}
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng < 0 || eng > 100) {
			System.out.println("영어 에러 입력");
			return;
		}
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		if(mat < 0 || mat > 100) {
			System.out.println("영어 에러 입력");
			return;
		}
		this.mat = mat;
	}
	
	public String getPname() {
		return pname;
	}
	
	public int getTot() {
		return kor+eng+mat;
	}
 	
	public int getAvg() {
		return getTot()/3;
	}
	
	void ppp() {
		System.out.println(pname + "\t"+ kor + "\t" + eng + "\t" + mat);
	}
 	
}

public class CapsuleMain {

	public static void main(String[] args) {
		StudDTO st1 = new StudDTO("황영묵");
		st1.setKor(78);
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
