package study;
import java.util.Scanner;

public class Ex {


		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String[] arr = { "", "가위", "바위", "보" };
		        int user, com;

		        while (true) {
		            int attacker = 0;
		            while (true) {
		                System.out.println("가위바위보 (0: 종료, 1: 가위, 2: 바위, 3: 보)");
		                System.out.print("입력 : ");
		                user = sc.nextInt();
		                if (user == 0) {
		                    System.out.println("게임종료");
		                    return;
		                }

		                com = (int) (Math.random() * 3) + 1;

		                System.out.println("게이머 : " + arr[user]);
		                System.out.println("컴퓨터 : " + arr[com]);

		                if (user == com) {
		                    System.out.println("무승부 다시 가위바위보");
		                } else if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
		                    attacker = 1;
		                    System.out.println("게이머가 선공입니다");
		                    break;
		                } else {
		                    attacker = 2;
		                    System.out.println("컴퓨터가 선공입니다");
		                    break;
		                }
		            }

		            while (true) {
		                System.out.println("묵찌빠 (1: 가위, 2: 바위, 3: 보)");
		                System.out.print("입력 : ");
		                user = sc.nextInt();
		                com = (int) (Math.random() * 3) + 1;

		                System.out.println("게이머 : " + arr[user]);
		                System.out.println("컴퓨터 : " + arr[com]);

		                if (user == com) {
		                    if (attacker == 1) {
		                        System.out.println("게이머 승리");
		                    } else {
		                        System.out.println("컴퓨터 승리");
		                    }
		                    break;
		                } else if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
		                    attacker = 1;
		                    System.out.println("게이머가 선공으로 바뀌었습니다");
		                } else {
		                    attacker = 2;
		                    System.out.println("컴퓨터가 선공으로 바뀌었습니다");
		                }
		            }
		        }
		    }
		}