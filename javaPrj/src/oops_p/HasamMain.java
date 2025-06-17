package oops_p;

import java.util.Iterator;

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

enum coffe {
	AM("아메리카노",2000),ASI("아시아노",2300),AF("아프리카노",2700);
	
	String name;
	int price;
	int cnt;
	
	private coffe(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void add(int cnt) {
		this.cnt += cnt;
	}
	
	void total (int price, int cnt) {
		this.price =price;
		this.cnt = cnt;
		int tot = 0;
		tot += price*cnt;
	}

}

public class HasamMain {
	
	void order(String menu, int cnt) {
		coffe co = coffe.valueOf(menu);
		co.add(cnt);
		System.out.print("주문서 : "); 
		System.out.println(co.name+ ":"+cnt+"("+co.price*cnt+")");
	}
	
	void order(String menus) {
		String ttt = "";
		int tot = 0;
		for (String st : menus.split(",")) {
			coffe co = coffe.valueOf(st);
			co.add(1);
			ttt += co.name+ ":"+(co.price*co.cnt);
			tot += co.price;
		}
		
		
		System.out.print("주문서 : "); 
		System.out.println(ttt + " : "+tot);
	}
	
	void adgustment () {
		System.out.println("정산>>>");
		int tot=0;
		for (coffe co : coffe.values()) {
			System.out.println(co);
			tot += co.price*co.cnt;
		}
		System.out.println("합계 : "+tot);
	}
	
	public HasamMain() {
		order("AM,AM,ASI,AF");
		order("AF,ASI");
		order("AF,AM,ASI");
		
	}



	public static void main(String[] args) {
		new HasamMain();
	}

}
