package teacher;

import java.util.Scanner;

public class GBBMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		
		String [] ar = "가위,바위,보".split(",");
		String [][] res = {			//user
				{"비김","패","승"}	,	//0:가위
				{"승","비김","패"}	,	//1:바위
				{"패","승","비김"}		//2:보
		};//com  0:가위, 1:바위,  2:보
			
		while(true) {	// true는 무한 반복 루프 끝내기 위한 조건 따로 입력해야함
			System.out.println("0:종료, 1:가위, 2:바위, 3:보 입력 : ");
			
			int user = sc.nextInt();
			if(user==0) {
				break;
			}
			
			user--;
			
			int com = (int)(Math.random()*3);

			System.out.println("게이머 : "+ar[user]); 
			System.out.println("컴퓨터 : "+ar[com]);
			System.out.println(res[user][com]); 
		}
		
		System.out.println("게임 종료");
	}

}