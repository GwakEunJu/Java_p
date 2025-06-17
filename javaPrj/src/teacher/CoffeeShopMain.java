package teacher;

/*
커피 전문점을 구현하세요
       
         하삼동, 상남동
         지역별로 커피전문점이 존재

         하삼동 - 창원,진주,김해
         상남동 - 창원,부산,통영

                        하삼동   상남동
        아메리카노:		2000    2100
        아시아노:			2300    2500
        아프리카노:		2700    2200
        
		각 지점이 커피를 주문받으세요(각 지점에서만 주문가능)

        각 지점별 커피 판매내역과
        총판 커피 판매 내역을 출력하세요
 */

//본사 클래스 모든 지점이 공유해야할 정보 생성! 본사이름, 메뉴, 가격, 총 주문 수
class CoffeeShop{
	String name;
	String [] menu = {"아메리카노","아프리카노","아시아노"};
	int [] price;
	int [] cnt = new int[menu.length];
	
	//생성자 각 메뉴의 가격을 받아서 초기화 시킨다.
	CoffeeShop(String name, int ame, int afr, int asia) {
		this.name = name;
		price = new int[] {ame, afr, asia};
	}
	
	void ppp() {
		System.out.println(name+" >>>");
		int tot = 0;
		for (int i = 0; i < cnt.length; i++) {
			int money = price[i]*cnt[i];
			tot+=money;
			System.out.println(menu[i]+"\t"+price[i]+"\t"+cnt[i]+"\t"+money);
		}
		System.out.println("합계 : "+tot);
	}
	
	class Branch{
		String name;
		int [] cnt = new int[menu.length];
		
		Branch(String name) {
			this.name = name;
		}
		
		void ppp() {
			System.out.println("["+CoffeeShop.this.name+" "+name+"]");
			int tot = 0;
			for (int i = 0; i < cnt.length; i++) {
				int money = price[i]*cnt[i];
				tot+=money;
				System.out.println(menu[i]+"\t"+price[i]+"\t"+cnt[i]+"\t"+money);
			}
			System.out.println("지점 합계 : "+tot);
		}
		
		void order(String mm) {
			int no = -1;
			for (int i = 0; i < menu.length; i++) {
				if(menu[i].equals(mm)) {
					no = i;
					break;
				}
			}
			if(no==-1) {
				System.out.println(mm+" 없는 메뉴 다시해줭");
				return;
			}
			String ttt = CoffeeShop.this.name+" "+name+" : "+mm;
			ttt += "("+price[no]+")";
			System.out.println(ttt);
			cnt[no]++;
			CoffeeShop.this.cnt[no]++;
		}
	}
}

public class CoffeeShopMain {

	public static void main(String[] args) {
		CoffeeShop cs1 = new CoffeeShop("하삼동", 2000, 2300, 2700);
		CoffeeShop cs2 = new CoffeeShop("상남동", 2100, 2500, 2200);
		
		CoffeeShop.Branch [] brs = {
			cs1.new Branch("창원"),
			cs1.new Branch("진주"),
			cs1.new Branch("김해"),
			cs2.new Branch("창원"),
			cs2.new Branch("부산"),
			cs2.new Branch("통영")
		};
		
		brs[0].order("아메리카노");
		brs[1].order("아메리카노");
		brs[3].order("아프리카노");
		brs[2].order("아메리카노");
		brs[3].order("아시아노");
		brs[4].order("유럽이노");
		brs[3].order("아시아노");
		brs[1].order("호주노");
		brs[5].order("아메리카노");
		brs[2].order("아메리카노");
		brs[0].order("아프리카노");
		brs[0].order("아메리카노");
		brs[1].order("아시아노");
		brs[2].order("유럽이노");
		brs[4].order("아시아노");
		brs[5].order("호주노");
		
		for (CoffeeShop.Branch branch : brs) {
			branch.ppp();
		}
		cs1.ppp();
		cs2.ppp();

	}

}