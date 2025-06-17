package excep_p;

class ClaDec {
	
	// meth_1은 meth_2를 호출하고 예외를 처리할 최종 try-catch 블록 / 예외메세지를 출력하고 끝남
	void meth_1() {
		System.out.println("meth_1() 시작 ------");
		try {
			meth_2();	// meth_2() 호출 -> 내부에서 meth_3()까지 호출함	
		} catch (Exception e) {
			
			//meth_3()에서 던져진 예외가 여기까지 올라오면 출력됨
			System.out.println("m1 catch : "+e.getMessage());
			//e.printStackTrace();
			
		}
		System.out.println("meth_1() 끝 ------");
	}
	
	//meth_3() 호출하면서 예외 발생 시 catch로 잡고 다시 던짐 (re-throw) throws Exception은 이 메서드는 예외를 던질 수 있음을 명시
	void meth_2() throws Exception {
		System.out.println("\t meth_2() 시작 ------");
		try {
			meth_3(); //예외처리 위임 메소드는 try~catch 혹은 재위임으로 처리
		} catch (Exception e) {
			
			//e.printStackTrace();  예외가 어디서 발생했는지 추적한 내용 출력
			//meth_3()에서 던져진 예외 메세지 출력
			System.out.println("\t m2 catch : "+e.getMessage());
			
			//예외 발생 종류도 리턴 
			System.out.println("\t m2 catch : "+e.toString());
			
			//re~throwing : 예외 다시 던지기
			throw e;  // throws Exception 필요 - 예외를 다시 상위 meth_1()로 던짐
		}
		System.out.println("\t meth_2() 끝 ------");
	}
	
	
	//예외처리 위임 : throws 예외처리클래스1, 예외처리클래스2
	//이 메소드를 호출하는 구간에서 예외처리해야함
	void meth_3() throws Exception{
		System.out.println("\t\t meth_3() 시작 ----");
		
		throw new Exception("meth3에서 예외 발생");
		
		//System.out.println("\t\t meth_3() 끝 ----");  예외 발생으로 도달 불가
	}
	
}

public class DecMain {

	public static void main(String[] args) {
		ClaDec cd = new ClaDec();
		cd.meth_1();

	}

}
