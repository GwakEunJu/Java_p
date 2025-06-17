package basic;

public class WhileMain {

	public static void main(String[] args) {
		
		boolean bb = false;
		
		while (bb) 
			System.out.println("while 실행");
			
		System.out.println("while 종료  ------1"); // 중괄호가 없다고 같은 바운더리가 아니다
		
		
		int a = 10; // 초기값
		
		while (a< 50) { //조건
			System.out.println("while 2:" + a); 
			a +=10; //증감
		}
		System.out.println("while 종료  ------2");
	}

}
