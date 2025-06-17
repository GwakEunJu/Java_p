package lang_p;

public class MathMain {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		//자연로그 E
		System.out.println(Math.E);
		//올림  (음수는 작을수록 큰 수)
		System.out.println("-------ceil-------");
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(987.654));
		System.out.println(Math.ceil(-987.654));
		//내림 
		System.out.println("-------floor-------");
		System.out.println(Math.floor(123.456));
		System.out.println(Math.floor(-123.456));
		System.out.println(Math.floor(987.654));
		System.out.println(Math.floor(-987.654));
		//반올림 
		System.out.println("-------round-------");
		System.out.println(Math.round(123.456));
		System.out.println(Math.round(-123.456));
		System.out.println(Math.round(987.654));
		System.out.println(Math.round(-987.654));
		//절대 값
		System.out.println("-------abs-------");
		System.out.println(Math.abs(123.456));
		System.out.println(Math.abs(-123.456));
		//큰 값, 작은 값
		System.out.println("-------max,min-------");
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		//삼각함수
		System.out.println("-------삼각함수-------");
		System.out.println(Math.sin(30));	
		System.out.println(Math.sin(30*Math.PI/180));	
		System.out.println(Math.cos(30*Math.PI/180));	
		System.out.println(Math.tan(30*Math.PI/180));
		
		System.out.println(Math.atan2(1,1)); 
		System.out.println(180*Math.atan2(1,1)/Math.PI); 
		
		System.out.println("-------랜덤-------");
		System.out.println(Math.random());		// 0 <= r < 1
		
		
		
		
	}

}
