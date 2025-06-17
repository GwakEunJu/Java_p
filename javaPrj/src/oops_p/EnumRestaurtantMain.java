package oops_p;

enum Restttt {

	KC("김치찌개", 6000), DJ("된장찌개", 5500), MIL("부대찌개", 7000);

	String name;
	int price;
	int cnt;

	private Restttt(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void add(int cnt) {

		this.cnt += cnt;
	}

	@Override
	public String toString() {

		return name + "\t" + price + "\t" + cnt + "\t" + (price * cnt);
	}

}

public class EnumRestaurtantMain {

	void order(String menu, int cnt) {
		Restttt rt = Restttt.valueOf(menu);
		rt.add(cnt);
		System.out.println(rt.name + " " + cnt + "개 주문이요" + rt.price * cnt);

	}
	
	void order(String menus) {
		System.out.println("문자열 1개");
		String [] arr = menus.split(","); 
		//String [] arr = {"KC","MIL","DJ","DJ"};
		order(arr) ;
		/*
		String ttt = "";
		int tot = 0;
		for (String mm: menus.split(",")) {
			Resttt rt = Resttt.valueOf(mm);
			rt.add(1);
			ttt += rt.name+",";
			tot += rt.price;
		}
		System.out.println(ttt+" : "+tot);
		*/
	}
	void order(String ...menus) {
		//String [] menus ={ "KC","MIL","MIL","KC"};
		System.out.println("가변형");
		String ttt = "";
		int tot = 0;
		for (String mm : menus) {
			Restttt rt = Restttt.valueOf(mm);
			rt.add(1);
			ttt += rt.name + ",";
			tot += rt.price;
		}
		System.out.println(ttt + " : " + tot);
	}
	
	void adgustment () {
		System.out.println("정산>>>");
		int tot=0;
		for (Restttt rt : Restttt.values()) {
			System.out.println(rt);
			tot += rt.price*rt.cnt;
		}
		System.out.println("합계 : "+tot);
	}

	public EnumRestaurtantMain() {
		order("KC", 2);
		order("DJ", 1);
		order("MIL", 3);
		order("KC,DJ,DJ,MIL");
		order("KC", 2);
		order("KC","DJ","DJ","MIL");

	}

	public static void main(String[] args) {
		new EnumRestaurtantMain();
	}

}
