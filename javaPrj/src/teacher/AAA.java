package teacher;

public class AAA {

	public static void main(String[] args) {
		
		/*
		///사원번호 -- 20020320a2lsh
		///ex) 입사일 :20020320, a - 부서명, 2-직급, lsh - 이름

		///부서명 : a 인사, b 총무, c 두부, d 부부
		///직급 : 0 사장, 1 부장, 2 과장, 3 대리, 4 사원

		사원증을 출력하세요
		입사일, 부서명, 직급, 이름
		*/	

		String swNo =  "20020320a2lsh";
		//				0123456789012
		
		String []  buseo = {"인사","총무","두부","부부"};
		String []  grade = {"사장","부장","과장","대리","사원"};
		
		
		System.out.println("입사일 : "+swNo.substring(0,8));
		System.out.println("부서 : "+buseo[swNo.charAt(8)-'a']);	//swNo.charAt(8) → 'b' (문자), 'b' - 'a' → 98 - 97 = 1, 결과적으로 → buseo[1]을 출력하는 코드
		System.out.println("직급 : "+grade[swNo.charAt(9)-'0']);
		System.out.println("이름 : "+swNo.substring(10));
		
		

	}

}
