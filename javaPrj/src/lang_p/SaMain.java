package lang_p;

public class SaMain {

	public static void main(String[] args) {
		/*
		///사원번호 -- 20020320a2lsh
		///ex) 입사일 :20020320, a - 부서명, 2-직급, lsh - 이름

		///부서명 : a 인사, b 총무, c 두부, d 부부
		///직급 : 0 사장, 1 부장, 2 과장, 3 대리, 4 사원

		사원증을 출력하세요
		입사일, 부서명, 직급, 이름
		*/		
				
		String data = "20020320a2lsh";
		//			   0123456789012	
		
	
 		
		
		System.out.println("입사일 : "+data.substring(0,8)+"\t이름 : "+data.substring(10));
	}

}
