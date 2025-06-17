package collection_p;

import java.util.Comparator;
import java.util.TreeSet;

/*  직급, 이름순으로 정렬해 주세요 

직급 : 사장 > 부장 > 과장 > 대리 > 사원

이름 : 오름차순
사원_정우성,과장_현빈,부장_원빈,과장_장동건,사원_장서건,대리_정남성,대리_정좌성,부장_이효리,사원_삼효리,과장_한가인,대리_두가인

*/

class Jic {
	String kind, name;
	int no;

	public Jic(int no, String kind, String name) {
		this.no = no;
		this.kind = kind;
		this.name = name;

	}

	@Override
	public String toString() {
		return kind + " : " + name;
	}

}

class JicTo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Jic me = (Jic) o1;
		Jic you = (Jic) o2;

		int res = me.no - you.no;
//		System.out.println("---------"+res);
		if (res == 0) {
			res = me.kind.compareTo(you.kind);
		}
		if (res == 0) {
			res = me.name.compareTo(you.name);
		}

		return res;
	}

}

public class JicMain {

	public static void main(String[] args) {
		TreeSet aa = new TreeSet(new JicTo());
		aa.add(new Jic(1, "사원", "정우성"));
		aa.add(new Jic(1, "사원", "장서건"));
		aa.add(new Jic(3, "과장", "현빈"));
		aa.add(new Jic(4, "부장", "원빈"));
		aa.add(new Jic(3, "과장", "장동건"));
		aa.add(new Jic(2, "대리", "정남성"));
		aa.add(new Jic(2, "대리", "정좌성"));
		aa.add(new Jic(4, "부장", "이효리"));
		aa.add(new Jic(1, "사원", "삼효리"));
		aa.add(new Jic(3, "과장", "한가인"));
		aa.add(new Jic(2, "대리", "두가인"));

		for (Object oo : aa) {
			System.out.println(oo);
		}
	}

}
