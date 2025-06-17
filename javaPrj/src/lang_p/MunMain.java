package lang_p;

import java.util.Scanner;

public class MunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] ar = "가위,바위,보".split(",");
		String [] ar2 = "묵,찌,빠".split(",");
		String at = " ";
		
		
		while(true) {	
			
			System.out.println("0:종료, 1:가위, 2:바위, 3:보 입력 : ");
		
			int user = sc.nextInt();
			if(user==0) {
				break;
			}
			
			user--;
			
			int com = (int)(Math.random()*3);

			System.out.println("게이머 : "+ar[user]); 
			System.out.println("컴퓨터 : "+ar[com]);
			
			if(user==com) {
				System.out.println("비김");
			} else if (
					(user==0 && com==2) ||
					(user==1 && com==0) ||
					(user==2 && com==1) 
					) {
				System.out.println("승");
			} else {
				System.out.println("패");
			}	
		}
			
		while(true) {	
			
			System.out.println("0:종료, 1:가위, 2:바위, 3:보 입력 : ");
		
			int user = sc.nextInt();
			if(user==0) {
				break;
			}
			
			user--;
			
			int com = (int)(Math.random()*3);

			System.out.println("게이머 : "+ar2[user]); 
			System.out.println("컴퓨터 : "+ar2[com]);
			
			if(user==com) {
				System.out.println("비김");
			} else if (
					(user==0 && com==2) ||
					(user==1 && com==0) ||
					(user==2 && com==1) 
					) {
				System.out.println("승");
			} else {
				System.out.println("패");
			}	
			}
		
		
		System.out.println("게임 종료");
	}

}