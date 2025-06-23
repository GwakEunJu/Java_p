package lamda_p;

// 25.06.23 람다식 강의

/*
   람다식 : 
   추상 메소드가 1개인 인터페이스의 
   선언 및 생성 시 추상메소드를 간략히 재정의 하는 방식 
*/

// 추상메소드가 1개인 인터페이스
interface AAA {
	void meth(int a, int b);
}

// 매개변수. 리턴이 있는 추상메소드
interface BBB {
	int meth(int a, int b);
}

interface CCC {
	int meth_1(int a, int b);
	int meth_2(int a, int b);
}

// Exam
interface DDD {
	int meth(int a, int b, int c);
}

public class LamdaMain {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("생성시 재정의 run");
			};
		}.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("인터페이스 Runnable 재정의 run");
			}
		}).start();

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("r1 run");
			}
		};

		// 인터페이스 선인 및 람다식 생성
		Runnable r2 = () -> System.out.println("r2 run");
		new Thread(r2).start();
		new Thread(() -> System.out.println("생성시 람다식 run")).start();

		AAA a1 = new AAA() {
			@Override
			public void meth(int a, int b) {
				System.out.println(a+b);
			}
		};
		a1.meth(10, 20);
		
		// 추상메소드가 1개인 인터페이스는 람다식으로 메소드 재정의 가능
		AAA a2 = (a,b)->System.out.println("람다식 재정의 : "+a+","+b);
		a2.meth(10, 20);
		
		BBB b1 = (c,d)->c+d;	//return c+d;
		int rr = b1.meth(10, 20);
		System.out.println(rr);
		
		b1 = (c,d)->{
			int res= 0; 
			for (int i = c; i <= d; i++) {
				res += i;
				System.out.println(i+" : "+res);
			}
			
			return res;
		};
		
		rr=b1.meth(10, 20);
		System.out.println(rr);
		
		CCC c1 = new CCC() {
			
			@Override
			public int meth_2(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int meth_1(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		// 추상메소드가 2개인 경우 람다식 불가 
		// CCC c2 = (a,b)->System.out.println("람다식 재정의 : "+a+","+b);
		
		DDD d1 = (a,b,c)->a+b+c;
		int rd = d1.meth(10, 20, 30);
		System.out.println(rd);
		
		d1 = (a,b,c)->{
			int aa = a;
				b =aa;
			
			if(c>aa) {
				c=aa;
				
			}
		
			System.out.println("-->"+aa);
			return a;
			
		};
		
		d1 = (a,b,c)->a*b-c;
		int re = d1.meth(10, 20, 5);
		System.out.println("-->"+re);
		
	}
}
