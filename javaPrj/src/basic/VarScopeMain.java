package basic;

public class VarScopeMain {

	public static void main(String[] args) {
		
		/*for( ; ; ) {
			System.out.println("for 문 실행");*/
		
		int a = 5;
		
		System.out.println("a:" +a);
		
		for( ;a<10; a++) { // 외부변수를 반복변수로 사용
			System.out.println("for 문 실행 2 : "+a);
		}
		System.out.println("a : "+a);
	
		/* 반복변수와 외부변수 중첩선언 불가
		for(int a =1; a<10; a++) {
			System.out.println("for 문 실행 3 : "+a);
		}*/
		
		
		// 외부변수를 반복변수로 사용
		// 반복변수 초기값 대입
		for(a =100; a<200; a+=20) {
			
			// int a = 1357; 반복변수와 내부변수 중첩불가
			System.out.println("for 문 실행 3 : "+a);
		}
		System.out.println("a : "+a);
		
		
		System.out.println("[[반복변수와 지역변수]]");
		
		for(int i =0; i<20; i+=2 ) {
			
			System.out.println("시작 : "+i);
			int j = 9; // 지역 내부변수는 for 구간 반복할때마다 선언
					   // 구간이 끝나면 소멸됨
					   // 반복변수는 for문이 종료될때에 소멸됨
			
			System.out.println("중간 : "+i+" ,"+j);
			
			j++;
			
			System.out.println("끝 : "+i+" , "+j);
			
		}
		
		//System.out.println("종료 : "+i);
		System.out.println("종료 : ");
		
	}
	
//	int x,y,z;
//	int x1=10, y1=20, z1=30;
//	int x2=y2=z2=30; 에러 발생 (초기값 지정하지않음)
//	int x3=10, y3=x3, z3=y3;
//	int x4=y4, y4=z4, z4=30; 에러발생 (코드 진행순서 왼쪽에서 오른쪽, x4에서 초기값이 지정되지않아 에러 발생)

}



