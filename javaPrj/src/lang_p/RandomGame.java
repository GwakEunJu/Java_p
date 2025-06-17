package lang_p;

import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		
		String [] ar = "가위,바위,보".split(",");
		
		while(true) {
			System.out.println("0:종료, 1:가위, 2:바위, 3:보 입력 : ");
			
			int user = sc.nextInt();
			if(user==0) {
				break;   //게임 종료
			}
				
			user--;		// 입력 값을 1~3 -> 0~2로 조정
//			
			int com = (int)(Math.random()*3);	//0~2 무작위 숫자 (컴퓨터의 선택)
			//random은 double타입 -> com은 0 < com > 1 
			//					   int로 형 변환은 해서 소수점 이하 잘라내기	
			
			System.out.println("게이머 : "+ar[user]); 
			System.out.println("컴퓨터 : "+ar[com]);
//			String res = "패";
//			if(user==com) {
//				res = "비김";	
//			} else if (user>com) {
//				res = "승";
//			}
			if(user==com) {
				System.out.println("비김");
			} else if (
					(user == 0 && com == 2) ||	//가위가 보 이김
					(user == 1 && com == 0) ||	//바위가 가위 이김
					(user == 2 && com == 1) 	//보가 바위 이김
					) {
				System.out.println("승");
			} else {
			System.out.println("패");
			}
		}
		System.out.println("게임 종료");
		
    }
}





