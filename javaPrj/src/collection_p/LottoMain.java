package collection_p;

import java.util.ArrayList;
import java.util.HashSet;

public class LottoMain {

	public static void main(String[] args) {
		ArrayList lotto1 = new ArrayList();
		HashSet lotto2 = new HashSet();
		
		while(true) {
			//44번까지 나와서 +1
			int no = (int)(Math.random()*45)+1;
			lotto1.add(no);
			lotto2.add(no);
			
			if(lotto2.size()==6) {
				break;
			}
		}
		System.out.println("lotto1 : "+lotto1);
		System.out.println("lotto2 : "+lotto2);
		

	}

}
