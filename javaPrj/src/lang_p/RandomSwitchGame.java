package lang_p;

import java.util.Scanner;

public class RandomSwitchGame {

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
			int com = (int)(Math.random()*3);	//0~2 무작위 숫자 (컴퓨터의 선택)
			
			System.out.println("게이머 : "+ar[user]); 
			System.out.println("컴퓨터 : "+ar[com]);

			//switch문으로 판단
			switch(user) {
			  case 0:
				  switch(com) {
				  case 0: System.out.println("비김"); break;
				  case 1: System.out.println("패"); break;
				  case 2: System.out.println("승"); break;
				  }
				  break;
			  case 1:
				  switch(com) {
				  case 0: System.out.println("승"); break;
				  case 1: System.out.println("비김"); break;
				  case 2: System.out.println("패"); break;
				  }
				  break;
			  case 2:
				  switch(com) {
				  case 0: System.out.println("패"); break;
				  case 1: System.out.println("승"); break;
				  case 2: System.out.println("비김"); break;
				  }
				  break;
			}
		}
		System.out.println("게임 종료");
		
    }
}