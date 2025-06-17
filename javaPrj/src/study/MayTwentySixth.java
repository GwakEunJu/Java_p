package study;

public class MayTwentySixth {

	public static void main(String[] args) {
		/*
		   주문번호 : 
		   0-아메리카노 (2000)
		   1-아프리카노 (2300)
		   2-아시아노  (2700)
		   
		   4/10 - 1, 2, 0, 1
		   4/11 - 2, 0
		   4/12 - 0, 3, 0
		   4/13 - 1, 1, 1, 2, 1
		   
		    
		   각 날짜별 판매금액과 전체 금액을 출력하세요
		   4/10 - ?
		   4/11 - ?
		   4/12 - ?
		   4/13 - ?
		   
		   
		 * */
				
		
		// 입력부
		
		String [] menu = new String[] {"아메리카노","아프리카노","아시아노"};
		int [] price = new int [] {2000, 2300, 2700};    // 0= 아메리카노, 1= 아프리카노, 2= 아시아노
		int [][] day = new int [][] {
			{1, 2, 0, 1},		// 4/10 [0][0]
			{2, 0},				// 4/11 [0][1]
			{0, 1, 0},			// 4/12 [0][2]
			{1, 1, 1, 2, 1}		// 4/13 [0][3]
		};
		
		
		int []res = new int [day.length];   
		
	
		//연산부
		
		for (int i = 0; i < day.length; i++) {
			for (int[] j : day) {
				
			}
		}
		
		
		
		
		
		//출력부
		
		for (int i = 0; i < day.length; i++) {
			String tt = menu[i];
			
			System.out.println(tt);
		}
		
		

	}

}
