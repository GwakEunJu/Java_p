package oops_p;

// 매개변수를 주소로 사용할 때

class ParamAddr {
	void meth(AddrMem am) {
		System.out.println("\t meth am: "+am);
		am.pname="고윤정";
		am.age++;
		am.marriage=!am.marriage;
	}
}

class AddrMem {
	String pname;
	int age;
	boolean marriage;
	
	void ppp() {
		System.out.println(pname+", "+age+", "+marriage);
	}
}


public class ParamAddMain {

	public static void main(String[] args) {
		ParamAddr pa = new ParamAddr();
		AddrMem qqq = new AddrMem();
		System.out.println("pa :"+pa);
		System.out.println("메인 :"+qqq);
		qqq.pname = "중윤정";
		qqq.age = 34;
		qqq.marriage = true;
		qqq.ppp();
		pa.meth(qqq);
		qqq.ppp();
	}

}
