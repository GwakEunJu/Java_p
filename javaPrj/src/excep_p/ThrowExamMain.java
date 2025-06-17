package excep_p;

import java.util.Scanner;

public class ThrowExamMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int jum = 0;
		while(true) {
			try {
				System.out.print("점수입력 : ");
				
				jum = sc.nextInt();
				if(jum<0 || jum >100) {
					throw new Exception("범위 에러");
				}
				
				break;	//while 탈출
			} catch (Exception e) {
				
				System.out.println("에러발생 : "+e.getMessage());
				if(e.getMessage() !="범위 에러") {
					sc.next();  // 문자열 입력시 enter 소진 코드
				}
				
			}
		}
		System.out.println("프로그램 종료");

	}

}
