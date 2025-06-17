package array_P;

public class MulVarExamMain {

	public static void main(String[] args) {
		
		
		//입력부
		String [] pname = {				// 7명의 이름을 pname 배열로 저장
				"현빈",
				"원빈",
				"김우빈",
				"장희빈",
				"커피빈",
				"미스터빈",
				"텅빈"				
		};
		
		int [][] jum = {				// 각 사람마다 3~과목 점수를 저장한 2차원 배열(행은 사람 열은 점수)
				{77,78,72,74},			//현빈
				{77,78,72},				//원빈
				{37,58,72,94},			//김우빈	
				{97,78,52,34},			//장희빈
				{37,68,92},				//커피빈
				{97,68,32},				//미스터빈
				{67,68,62,64}			//텅빈
				
		};
		
		int [][] res = new int [pname.length][2];  // 총점과 평균을 저장할 2차원 배열 
	
		/*
		 {총점, 평균		 res[0][0] 총점
		  {0, 0},		 res[0][1] 평균 
		  {0, 0},
		  {0, 0},
		  {0, 0},
		  {0, 0},
		  {0, 0},
		  {0, 0}
		 }
		 * */
		
					//	  국어   영어   수학  예체능	
		double [] rate = {0.1, 0.15, 0.2, 0.55};	//과목별 가중치 : 국어(10%), 영어(15%), 수학(20%), 예체능(55%)
		
	
		
		
		//연산부
		
		for (int i = 0; i < res.length; i++) {   //각 사람을 한명씩 반복
			int [] me = res[i];					 //결과 저장용 : [총점, 평균]
			int [] meJum = jum[i];				 //점수 저장용
			//me[0] = 77;
			//res[i][0] = 77;
			for (int j =0; j<meJum.length; j++) {
				me[0] += meJum[j];				 //총점 계산	
				me[1] += meJum[j] * rate[j];	 //가중치 평균 계산(4과목일 때만 정확)	
			}
			
			if(jum[i].length == 3) {			
			me[1] = me[0] /meJum.length;		 //3과목일 경우 일반 평균으로 덮어씀
		} 
	}
		
		
		
		//출력부
		
		for (int i = 0; i < pname.length; i++) { //각 사람을 한명씩 출력
			String ttt = pname[i];				 // 이름부터 시작
			
			
			for (int j : jum[i]) {				  	
				ttt += "\t"+j;					 // 점수들 추가
			}
			
			if(jum[i].length == 3) {
				ttt += "\t";					 // 점수가 3개면 줄 맞추기용 탭 추간	
			}
			
			for (int j : res[i]) {
				ttt += "\t"+j;					 // 총점, 평균 추가
			}
			
			
			
			
			System.out.println(ttt);
		}
		

	}

}
