package thread_p;

class FirstTH extends Thread {
	
	FirstTH(String pname) {
		super(pname); // Thread 생성자 -> 부모 멤버 name에 대입 
	}

	//쓰레드 실행할 메소드 <- start()로 시동
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(getName());
			
			//getName() : 부모의 메소드
			
			try {
				sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void start() {
		//System.out.println("start 이지롱");
		super.start();
	}
}

public class MulThreadMain {

	public static void main(String[] args) {
		
		System.out.println("\n active : "+Thread.activeCount());
		FirstTH th1 = new FirstTH("+");
		FirstTH th2 = new FirstTH("/");
		
		th1.start();	// run을 호출하여 멀티 쓰레드로 실행
		th2.start();
//		th1.run();	run 직접 호출 시 단일 쓰레드로 실행
//		th2.run();

		System.out.println("\n active : "+Thread.activeCount());
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("\n active : "+Thread.activeCount());
	}
	

}
