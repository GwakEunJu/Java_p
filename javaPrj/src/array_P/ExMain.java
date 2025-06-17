package array_P;

public class ExMain {

	public static void main(String[] args) {
		
		/*

		   {5},
		   {5,6},
		   {5,6,8},
		   {10,4},
		   {8},
		   {10,6,13}

		  
		  도형의 넓이와 둘레를 출력하세요
		  
		 도형명		선분 	 		넓이	 					둘레
		 원	 		반지름	 		반지름*반지름*pi 	 		반지름*2*pi
		 직사각형	 	가로, 세로 	 	가로*세로	 				(가로+세로)*2
		 직각삼각형	밑변, 높이, 빗변	밑변*높이/2	 			밑변+높이+빗변

		 * */
		
		
		// 입력부
		String [] shape = {
				"원","직사각형","직각삼각형"
				};
		
		double pi = 3.14;
		
		
		double [][] a = {
				 {5},
				 {5,6},
				 {5,6,8},
				 {10,4},
				 {8},
				 {10,6,13}
		};
		
		double [][] res = new double [shape.length][3]; 
		// {0,0,0};
		
	
		
		// 연산부
		
		
		
		
		
		// 출력부
		
		for (int i = 0; i < shape.length; i++) {
			String ttt = shape[i];
			
		if(a[i].length == 1) {
			double cir = a[i].length * pi;
			
		}
	
		
			System.out.println(ttt);
			
			
		}
		
		
	
		

	}

}
