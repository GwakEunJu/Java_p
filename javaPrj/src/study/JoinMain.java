package study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JoinMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String logPattern = "^[a-z0-9]*@[a-z]*.[a-z]*$";

		String pwPattern = "^[a-z0-9!@#$%^&*()_+\\[\\]{};':\"\\\\|,.<>/?`~\\-]{4,10}$";

		String namePattern = "^[가-힣]{2,}$";
		
		String phonePattern = "^(010)[0-9]{1,4}[0-9]{1,4}$";
		
		while (true) {
			try {
				System.out.println("Id입력");
				String id = sc.nextLine();

				if (Pattern.matches(logPattern, id)) {
					System.out.println("id 확인되었습니다");
					break;
				}
				throw new Exception("id를 다시 입력해주세요");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}

		while (true) {
			try {
				System.out.println("비밀번호 입력");
				String password = sc.nextLine();

				if (Pattern.matches(pwPattern, password)) {
					System.out.println("비밀번호가 확인되었습니다.");
					break;
				}
				throw new Exception("비밀번호를 다시 입력하세요");
			} catch(Exception e) {
			System.out.println(e.getMessage());	
			}
			
		}
		while (true) {
			try {
				System.out.println("이름 입력");
				String name = sc.nextLine();

				if (Pattern.matches(namePattern, name)) {
					System.out.println("이름이 확인되었습니다.");
					break;
				}
				throw new Exception("이름을 다시 입력하세요");
			} catch(Exception e) {
			System.out.println(e.getMessage());	
			}
			
		}
		while (true) {
			try {
				System.out.println("휴대폰번호 입력");
				String number = sc.nextLine();

				if (Pattern.matches(phonePattern, number)) {
					System.out.println("환영합니다.");
					break;
				}
				throw new Exception("번호를 다시 입력하세요");
			} catch(Exception e) {
			System.out.println(e.getMessage());	
			}
			
		}
	}
}