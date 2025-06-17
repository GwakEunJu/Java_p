package collection_p;

import java.util.HashSet;

public class BingoMain {

	public static void main(String[] args) {

		HashSet bingo = new HashSet();

		while(true) {
			int no = (int)(Math.random()*100)+1;
			bingo.add(no);
		}
	}

}
