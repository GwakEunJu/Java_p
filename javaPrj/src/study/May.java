package study;

public class May {

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
		int [] day = new int [] {1, 2, 0, 1};		// 4/10 [0][0]
		int [] day2 = new int [] {2, 0};
//		int [] day3 = new int [] {0, 1, 0};
		
		
		int res = 0;   
//		int no = 0;	
		
//		res += price[no];
		res += price[day[0]];  // price 값에서 day에 0번째 자리에 있는 인덱스 1번의 값 가져오기
		
//		no = 1;
//		res += price[no];
		res += price[day[1]];  // price 값에서 day에 1번째 자리에 있는 인덱스 2번의 값 가져오기
		
//		no =2;
//		res += price[no];
		res += price[day[2]];  // price 값에서 day에 2번째 자리에 있는 인덱스 0번의 값 가져오기
		
//		no = 3;
//		res += price[no];
		res += price[day[3]];  // price 값에서 day에 3번째 자리에 있는 인덱스 1번의 값 가져오기
			
		
		int res2 = 0;
//		int no = 2;
		
//		res2 += price[no];
		res2 += price[day2[0]];
//		res2 += price[no];
		res2 += price[day2[1]];
		
		int res3 = 0;
		int no = 1;
		
		res3 += price[no];
		
		res3 += price[no];
		
		res3 += price[no];
		
		System.out.println(price[no]);
		
		
		
		
		
		
//		System.out.println(res2);
		
		
													
//		System.out.println(price[0]);
//		System.out.println(price[1]);
//		System.out.println(price[2]);
		
		
//		System.out.println(price[no]);             
		
	
		//연산부
	
//		for (int i = 0; i < day.length; i++) {
//			System.out.println(i);
//		}
		
		
		//출력부
	
//			System.out.println(res);
		
		
	}

}
