package teacher;

import java.util.HashSet;
import java.util.Iterator;

public class BingoMain {

	public static void main(String[] args) {
		HashSet bingo = new HashSet();

		while (bingo.size() != 25) {
			int no = (int) (Math.random() * 100) + 1;
			bingo.add(no);
		}
		int cnt =1;
		for (Object oo : bingo) {
			System.out.print(oo+"\t");
			
			if(cnt++%5==0) {
				System.out.println();
			}
		}
		
	}

}
