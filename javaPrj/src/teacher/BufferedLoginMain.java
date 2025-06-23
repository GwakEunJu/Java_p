package teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
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

class BufferMember{
	final String id, pw, pname;
	
	BufferMember(String ttt) {
		String [] arr = ttt.trim().split(",");
		id = arr[0];
		pw = arr[1];
		pname = arr[2];
	}
}

public class BufferedLoginMain {
	
	HashMap<String, BufferMember> mems;

	void loadMemData() {
		mems = new HashMap<String, BufferMember>();

		try {
			FileReader fr = new FileReader("fff/member.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			
			while((line=br.readLine())!=null) {
				BufferMember mem = new BufferMember(line);
				mems.put(mem.id, mem);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	void login() {
		while(true) {
			
			loadMemData();
			try {
				System.out.print("id : ");
				String tt = sc.nextLine();
				
				BufferMember bm = mems.get(tt);
				
				if(bm==null) {
					throw new Exception("id 에러");
				}
				
				System.out.print("pw : ");
				tt = sc.nextLine();
				
				if(!bm.pw.equals(tt)) {
					throw new Exception("pw 에러");
				}
				
				System.out.println(bm.pname+" 안녕하세요");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	BufferedLoginMain() {		
		//loadMemData();
		
		login();
		
	}

	public static void main(String[] args) {
		new BufferedLoginMain();
	}

}
