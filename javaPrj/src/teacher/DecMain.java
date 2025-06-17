package teacher;


//예외처리 강의
import java.util.Scanner;

//클래스 정의
class ReThrowsLogin {
		
	final Scanner sc = new Scanner(System.in);
	
	//멤버 변수 선언
	final String pid , ppw ,pname;
		
	//생성자 
	public ReThrowsLogin(String pid, String ppw, String pname) {
		
		this.pid = pid;
		this.ppw = ppw;
		this.pname = pname;
	}

	// 로그인 처리만 있음 - try~catch 가 없다.  메소드
	void login() throws Exception {

		System.out.println("id : ");
		String uid = sc.nextLine();
		if (!uid.equals(pid)) {
			throw new Exception("ID가 존재하지 않습니다.");
		}
		
		System.out.println("pw : ");
		String upw = sc.nextLine();
		if (!upw.equals(ppw)) {
			throw new Exception("암호가 일치하지 않습니다.");
		}
		
		System.out.println(pname+"님 안녕하세요");
	}
}

//예외처리만 있음 - 입력 및 검사 파트가 없음
public class DecMain {

	public static void main(String[] args) {

		//인스턴스 생성
		ReThrowsLogin rt = new ReThrowsLogin("zxcv","5678","장남건");

		while (true) {
			try {
				rt.login();

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

	}
}
