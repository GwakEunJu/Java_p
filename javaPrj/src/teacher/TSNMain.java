package teacher;

// 3 6 9 짝 만들기

public class TSNMain {

	public static void main(String[] args) {
		
		for (int i = 0; i <=20; i++) {
			
			//i의 1의 자리수 구하기
			int one = i%10;
			
			try {
				int a = 1234/(one%3);
				System.out.println(i+","+one+","+one%3); // (i)
			} catch (Exception e) {
				try {
					int a = 1234/one;
					System.out.println("짝"+i+","+one);  //("짝")
				} catch (Exception e2) {
					System.out.println(i+","+one);		// (i)
				}
				
			}
		}
	}

}
