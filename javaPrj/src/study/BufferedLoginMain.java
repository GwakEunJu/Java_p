package study;
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

/*
 1. 문제 이해
   - 입력
     파일 "fff/member.txt" (회원정보 저장)
     사용자로부터 id, pw 입력
   - 처리
     파일에서 회원 정보를 읽어와 저장
     입력받은 id 가 있는지 확인
     있으면 pw 도 확인
   - 출력
     로그인 성공: 000님 안녕하세요
     로그인 실패: 에러 메세지     
     
 2. 필요한 데이터 구조 고민
   - 회원 1명당 정보 3개(id, pw, name) -> 객체로 만들면 좋음
   - id 로 빠르게 찾고싶음 -> HashMap<String, BufferedMember> 사용
   
 3. 전체 흐름 설계 (순서도처럼)
   - 파일을 읽어서 회원정보를 메모리에 저장(한 번만)
   - 사용자로부터 id, pw 입력 받음
   - 입력받은 id 가 있는지 검사
   - pw가 일치하는지 검사
   - 성공->이름 출력/실패->오류메세지 출력
   
 4. 기능을 작은 단위로 나누기 (모듈화 사고)
   - 파일에서 회원정보 읽기 = loadMemData()
   - 사용자 입력 받아 로그인 = login()
   - 한 줄 회원정보 -> 객체로 변환 = BufferMember 생성자
   
 5. 처리순서 생각하며 코드 구성
   - BufferMember 생성자
   - login 메서드 실행
   - loadMemData 파일 읽어서 HashMap 저장
   - 사용자 입력받음
   - HashMap에서 id로 찾음
   - pw 일치 검사
   - 성공 or 실패 메세지 출력           
 * */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

class BufferMember {
	final String id, pw, pname;	//멤버변수 선언 final은 불변

	BufferMember(String ttt) {
		String [] arr = ttt.split(",");	// 한줄씩 받아온 정보 ,로 나누기
		id=arr[0];		// arr의 첫번째 값 	aaa,1111,임꺽정
		pw=arr[1];		// arr의 두번째 값		[0]  [1]  [2]	
		pname=arr[2];	// arr의 세번재 값 
	}
}

public class BufferedLoginMain {
	
	HashMap<String, BufferMember> mems;
//HashMap생성  k,         v         
	
	void loadMemData() {
		mems = new HashMap<String, BufferMember>();	//HashMap 초기화
		
		try {
			FileReader fr = new FileReader("fff/member.txt");	//문자 기반으로 파일 읽기
			BufferedReader br = new BufferedReader(fr);			// 한 줄씩 읽을 수 있도록 보조 스트림 사용
			
			String line = null;	//한 줄씩 저장할 변수 
			
			while((line=br.readLine())!=null) {	//readLine()은 텍스트 파일에서 한 줄을 문자열로 읽어오는 메서드
				BufferMember mem = new BufferMember(line);		//문자열->객체로 변환
				mems.put(mem.id, mem);	// id 를 키로 저장
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	void login () {
		while(true) {		//올바른 로그인이 될 때까지 반복
			loadMemData();  //파일에서 회원정보 다시 읽어오기
			try {
				System.out.println("id : ");
				String pid = sc.nextLine();
				
				BufferMember bm = mems.get(pid);	//입력한 id에 해당하는 회원 정보 가져오기
				
				if(bm==null) {
					throw new Exception("id 에러");
				}
				
				System.out.println("pw : ");
				String ppw = sc.nextLine();
				
				if(!bm.pw.equals(ppw)) {		//equals는 문자열 내용 비교
					throw new Exception("pw 에러");
				}
				
				System.out.println(bm.pname+" 안녕하세요");
				break;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	BufferedLoginMain() {
		login();
	}

	public static void main(String[] args) {
		new BufferedLoginMain();	// 인스턴스 생성 -> 생성자 호출 -> 로그인 시작

	}

}
