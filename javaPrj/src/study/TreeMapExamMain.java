package study;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class TMStuds {
	int ban, jum;
	String gender, name;

	public TMStuds(int ban, String name, String gender, int jum) {

		this.ban = ban;
		this.name = name;
		this.gender = gender;
		this.jum = jum;
	}

	@Override
	public String toString() {
		return ban + "\t" + gender + "\t" + jum + "\t" + name;
	}

}

// TMStuds를 TreeSet (반> 성별) 에 add 할때 정렬기준,
class TMStudsCom implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		TMStuds me = (TMStuds) o1;
		TMStuds you = (TMStuds) o2;

		int res = you.jum - me.jum;

		if (res == 0) {
			res = me.name.compareTo(you.name);
		}
		if (res == 0) {
			res = 1;
		}
		return res;

//		System.out.println(me);
//		System.out.println(you);

	}

}

public class TreeMapExamMain {

	public static void main(String[] args) {
		TMStuds[] ori = { 
				new TMStuds(1,"현빈","남",79),
				new TMStuds(2,"빈라덴","남",79),
				new TMStuds(1,"원빈","남",89),
				new TMStuds(2,"현빈","남",89),
				new TMStuds(1,"투빈","남",79),
				new TMStuds(2,"장희빈","남",79),
				new TMStuds(1,"현빈","남",89),
				new TMStuds(2,"원빈","it",89),
				new TMStuds(1,"투빈","남",79),
				new TMStuds(2,"현빈","여",69),
				new TMStuds(1,"빈라덴","여",89),
				new TMStuds(1,"투빈","여",89),
				new TMStuds(3,"원빈","여",79),
				new TMStuds(2,"현빈","여",89),
				new TMStuds(1,"빈라덴","여",89),
				new TMStuds(1,"투빈","여",89),
				new TMStuds(2,"원빈","여",79)
		};

		TreeMap total = new TreeMap();

		// 정렬 인스턴스
		TMStudsCom tsc = new TMStudsCom();

		for (TMStuds tst : ori) {
			TreeMap currBan = (TreeMap) total.get(tst.ban);
//			System.out.println(tst.ban);

			if (currBan == null) {
				currBan = new TreeMap();
				total.put(tst.ban, currBan);
			}
			TreeSet currGen = (TreeSet) currBan.get(tst.gender);

			if (currGen == null) {
				currGen = new TreeSet(tsc);
				currBan.put(tst.gender, currGen);
			}
			currGen.add(tst);
		}

		for (Object banobj : total.entrySet()) {
			Map.Entry ban = (Map.Entry) banobj;

			System.out.println("[[" + ban.getKey() + "반]]");

			for (Object genobj : ((TreeMap) ban.getValue()).entrySet()) {
				Map.Entry gen = (Map.Entry) genobj;

				System.out.println(">>" + gen.getKey());

				for (Object stobj : (TreeSet) gen.getValue()) {
					System.out.println(stobj);
				}
			}
		}
	}

}
