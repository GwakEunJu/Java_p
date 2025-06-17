package inner_p;

/*
커피 전문점을 구현하세요
       
         하삼동, 상남동
         지역별로 커피전문점이 존재

         별다방 - 창원,진주,김해
         커피콩 - 창원,부산,통영

                        하삼동   상남동
        아메리카노:		2000    2100
        아시아노:			2300    2500
        아프리카노:		2700    2200
        
		각 지점이 커피를 주문받으세요(각 지점에서만 주문가능)

        각 지점별 커피 판매내역과
        총판 커피 판매 내역을 출력하세요
 */

class Bon {
	String name;
	int am, as, af;
	
	
	public Bon(String name) {
		this.name = name;
		
	}
	
	void ppp() {
		System.out.println(name);
		System.out.println("아메리카노 : "+am);
		System.out.println("아시아노 : "+as);
		System.out.println("아프리카노 : "+af);
	}
	
	class Bun {
		String name;
		int am, as, af;
		String [] ttt = {"아메리카노","아시아노","아프리카노"};
		
		public Bun(String name) {
			this.name = name;
		}
		
		
		void ha(int am, int as, int af) {
		this.am = 2000;
		this.as = 2300;
		this.af = 2700;
	}
		void ppp() {
			System.out.println(Bon.this.name+" "+name+"--------------");
			
		}
		
	}
	
}


public class CoffeeMain {

	public static void main(String[] args) {
		Bon b1 = new Bon("하삼동");
		Bon b2 = new Bon("상남동");
		
		Bon.Bun [] aa = {
			b1.new Bun("창원"),
			b1.new Bun("진주"),
			b1.new Bun("김해"),
			b2.new Bun("창원"),
			b2.new Bun("부산"),
			b2.new Bun("통영"),
		};
		
		
		
		
		b1.ppp();
		b2.ppp();

	}

}
