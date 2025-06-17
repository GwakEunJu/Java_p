package teacher;

/*
커피를 주문하세요
    아메리카노:2000
    아시아노:2300
    아프리카노:2700
 
    주문서1 : AMERICANO_2,ASIANO_3,AFRICANO_1
    주문서2 : AFRICANO_2,ASIANO_1
    주문서3 : AFRICANO_2,AMERICANO_1,ASIANO_2
 
    출력
    주문서1 : AMERICANO_2(4000) , ASIANO_3(6900) , AFRICANO_1(2700) , :13600
    주문서2 : AFRICANO_2(5400) , ASIANO_1(2300) , :7700
    주문서3 : AFRICANO_2(5400) , AMERICANO_1(2000) , ASIANO_2(4600) , :12000
    total----------------------
     AMERICANO_3(6000)
     ASIANO_6(13800)
     AFRICANO_5(13500)
    ----------------------
              ?
*/

enum EnumCoffee {
	AMERICANO("아메리카노", 2000), ASIANO("아시아노", 2300), AFRICANO("아프리카노", 2700);

	String name;
	int price;
	int cnt = 0;

	private EnumCoffee(String name, int price) {
		this.name = name;
		this.price = price;
	}

	int add(int cnt) {
		this.cnt += cnt;
		return price * cnt;
	}

	@Override
	public String toString() {

		return name + "\t" + price + "\t" + cnt + "\t" + (price * cnt);
	}
}

public class EnumCoffeeMain {


//	void order(String ttt) {
		// String ttt = "AFRICANO_2,AMERICANO_1,ASIANO_2";
		
//		int tot = 0;
//		String str = "";
//		
//		//{"AFRICANO_2","AMERICANO_1","ASIANO_2"}  
//		
//		for (String ord : ttt.split(",")) {
//			String [] arr = ord.split("_");
//			//System.out.println(arr[0]);
//			//System.out.println(arr[1]);
//			
//			EnumCoffee coffee = EnumCoffee.valueOf(arr[0]);
//			int money = coffee.add(Integer.parseInt(arr[1]));
//			str += coffee.name+":"+arr[1]+"("+money+") , ";
//			tot += money;
//			
//		}
//		System.out.println(str+":"+tot);
//	}
	
	
//	void order(String ...ttt) {
//		int tot = 0;
//		String str = "";
//		for (String ord : ttt) {
//			String[] arr = ord.split("_");
//
//			EnumCoffee coffee = EnumCoffee.valueOf(arr[0]);
//			int money = coffee.add(Integer.parseInt(arr[1]));
//			str += coffee.name + ":" + arr[1] + "(" + money + "), ";
//			tot += money;
//		}
//		System.out.println(str + ":" + tot);
//
//	}
	
	void order(String ...ttt) {
		int tot = 0;
		String str = "";
		
		for (String ord : ttt) {
			String[] arr = ord.split("_");

			EnumCoffee coffee = EnumCoffee.valueOf(arr[0]);
			int money = coffee.add(Integer.parseInt(arr[1]));
			str += coffee.name + ":" + arr[1] + "(" + money + "), ";
			tot += money;
		}
		System.out.println(str + ":" + tot);

	}

	// 정산
	void adjustment() {
		System.out.println("total----------------------");
		int tot = 0;
		for (EnumCoffee rt : EnumCoffee.values()) {
			System.out.println(rt);
			tot += rt.price * rt.cnt;
		}
		System.out.println("----------------------");
		System.out.println("합계 : " + tot);
	}

	EnumCoffeeMain() {
		order("AMERICANO_2,ASIANO_3,AFRICANO_1");
		order("AFRICANO_2,ASIANO_1");
		order("AFRICANO_2,AMERICANO_1,ASIANO_2");
		order("AFRICANO_2","AMERICANO_1","ASIANO_2");
		order("AFRICANO_2","AMERICANO_1");
		adjustment();
	}

	public static void main(String[] args) {
		new EnumCoffeeMain();
	}

}
