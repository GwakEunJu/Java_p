package teacher;

interface Num3 {
	int calc(int a, int b, int c);
}

public class Numver3Main {

	public static void main(String[] args) {
		Num3 n3 =(a,b,c)->a+b+c;
		System.out.println(n3.calc(10, 20, 30)); 
		
		n3 =(a,b,c)-> {
			int ret =a;
			if (ret<b)
				ret=b;
			if(ret<c)
				ret=c;
			
			return ret;		
		};
		System.out.println(n3.calc(10, 82, 30));

		n3 =(a,b,c)->a*b-c;
		System.out.println(n3.calc(10, 20, 30));

	}

}
