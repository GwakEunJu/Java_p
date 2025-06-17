package excep_p;

/*
id : asdf, pw : 1234 , 로그인 성공시 : 장동건님 안녕하세요
*/

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id = "asdf";
		String pw = "1234";
		
		while(true) {
			try {
				System.out.println("ID를 입력하세요.");
				id = sc.nextLine();
				if(!id.equals("asdf")) {
					throw new Exception("id가 일치하지않습니다");
				}
				
				System.out.println("Password를 입력하세요.");
				pw = sc.nextLine();
				if(!pw.equals("1234")) {
					throw new Exception("password가 일치하지않습니다");
				}
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
		}
		
	  }
		System.out.println("장동건님 안녕하세요.");
	}

}
