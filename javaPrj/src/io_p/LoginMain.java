package io_p;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

/*
fff/member.txt
 
aaa,1111,임꺽정
bbb,2222,홍길동
ccc,3333,일지매
ddd,4444,백동수 
eee,5555,임우정 

id, pw 를 입력받아 로그인을 구현하세요
회원정보는  fff/member.txt 에서 확인

id : eee,  pw : 5555

임우정님 안녕하세요
*/

public class LoginMain {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("ID : ");
//			String id = sc.nextLine().trim();
//			System.out.println("Password : ");
//			String pw = sc.nextLine().trim();
//			
//			if(id.equals("") || pw.equals("")) {
//				break;
//			}
//		}
//		
//		
//		System.out.println("값을 입력하세요");
//		

	}

	static void memberCheck(String ttt) {
		try {
			FileReader fis = new FileReader("fff/member.txt");
			BufferedReader br = new BufferedReader(fis);

			String line = null;
			for (int i = 0; (line = br.readLine()) != null; i++) {
				System.out.println(line);
			}

			br.close();
			fis.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
