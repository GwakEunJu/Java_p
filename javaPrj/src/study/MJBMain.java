package study;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MJBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("가위 바위 보 게임 시작");

		String[] a1 = "가위,바위,보".split(",");
		String[] a2 = "찌,묵,빠".split(",");
		int at = 0;
		
		while (true) {
			try {
				System.out.println("0:종료 1:가위 2:바위 3:보");
				System.out.print("입력 : ");
				
			
				int user = sc.nextInt();
				if (user == a1.length) {
					throw new Exception("존재하지 않는 번호입니다.");
				}
				if (user == 0) {
					System.out.println("게임 종료");
					return;
				}

				int com = (int) (Math.random() * 3);
				System.out.println("user : " + a1[user]);
				System.out.println("com : " + a1[com]);

				if (user == com) {
					System.out.println("무승부");
				} else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
					at = 1;
					System.out.println("게이머가 선공입니다.");
					break;
				} else {
					at =2;
					System.out.println("컴퓨터가 선공입니다.");
					break;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("묵찌빠 게임 시작");
		while (true) {
			try {

				System.out.println("0:종료 1:찌 2:묵 3:빠");

				int user = sc.nextInt();
				if (user == a1.length) {
					throw new Exception("존재하지 않는 번호입니다.");
				}
				if (user == 0) {
					break;
				}

				int com = (int) (Math.random() * 3);
				System.out.println("user : " + a2[user]);
				System.out.println("com : " + a2[com]);
				
				if(user == com) {
					if (at==1) {
						System.out.println("게이머 승리");
					} else {
						System.out.println("컴퓨터 승리");
					}
					break;
				} else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
					at = 1;
					System.out.println("게이머가 선공으로 바뀌었습니다");
				} else {
					at = 2;
                    System.out.println("컴퓨터가 선공으로 바뀌었습니다");
				}	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("게임 종료");
	}
}
