package collection_p;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


class TMStud {
	int ban, jum;
	String gender, name;

	public TMStud(int ban, String name, String gender, int jum) {

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

// TMStud 를 TreeSet(반>성별) 에 add 할때 정렬기준
class TMStudCom implements Comparator {

	//점수 > 이름 순 정렬
	@Override
	public int compare(Object o1, Object o2) {
		TMStud me = (TMStud)o1;
		TMStud you = (TMStud)o2;
		
		int res = you.jum-me.jum;
		
		if(res==0) {
			res = me.name.compareTo(you.name);
		}
		if(res==0) {
			res = 1;
		}
		return res;
	}
	
}

public class TreeMapExamMain {

	public static void main(String[] args) {
		TMStud [] ori = {
				new TMStud(1,"현빈","남",79),
				new TMStud(2,"빈라덴","남",79),
				new TMStud(1,"원빈","남",89),
				new TMStud(2,"현빈","남",89),
				new TMStud(1,"투빈","남",79),
				new TMStud(2,"장희빈","남",79),
				new TMStud(1,"현빈","남",89),
				new TMStud(2,"원빈","it",89),
				new TMStud(1,"투빈","남",79),
				new TMStud(2,"현빈","여",69),
				new TMStud(1,"빈라덴","여",89),
				new TMStud(1,"투빈","여",89),
				new TMStud(2,"원빈","여",79),
				new TMStud(3,"현빈","여",89),
				new TMStud(1,"빈라덴","여",89),
				new TMStud(1,"투빈","여",89),
				new TMStud(2,"원빈","여",79)
		};
		
		TreeMap total = new TreeMap();
		
//		TreeMap banl = new TreeMap();
//		TreeMap ban2 = new TreeMap();
//		
		//정렬 인스턴스
		TMStudCom tsc = new TMStudCom();
//		
//		banl.put("남", new TreeSet(tsc));
//		banl.put("여", new TreeSet(tsc));
//		
//		ban2.put("남", new TreeSet(tsc));
//		ban2.put("여", new TreeSet(tsc));
//		
//		
//		//반 TreeMap
//		total.put(1, banl);
//		total.put(2, ban2);
		
		

		for (TMStud tst : ori) {
//			System.out.println(tst.ban);
			//반에 해당하는 TreeMap  가져오기  --> ban1, ban2
			TreeMap currBan = (TreeMap)total.get(tst.ban);
			
			//현재 반이 없을 경우 생성하여 넣는다
			
			if (currBan==null) {
				currBan = new TreeMap();
				total.put(tst.ban,currBan);
			}
			
//			System.out.println("currBan"+currBan);
			
			//currBan-> 성별 TreeMap 가져오기 --> "남", new TreeSet()
//											   "여", new TreeSet()
			//System.out.println(tst.gender); 

			TreeSet currGen = (TreeSet)currBan.get(tst.gender);
//			System.out.println("currGen"+currGen);
			
			
			//현재 성별이 없을 경우 생성하여 넣는다.
			if (currGen==null) {
				currGen = new TreeSet(tsc);
				currBan.put(tst.gender, currGen);
			}
			currGen.add(tst);
		}
		
		//출력부
		//반
	     for (Object banobj : total.entrySet()) {
			Map.Entry ban = (Map.Entry)banobj;
			
			System.out.println("[["+ban.getKey()+"반]]"); 
			
			
			//반의 성별
			for (Object genobj : ((TreeMap)ban.getValue()).entrySet()) {
				Map.Entry gen = (Map.Entry)genobj;
				
				System.out.println(">>"+gen.getKey());
				
				//System.out.println(">>"+gen.getValue());
				for (Object stObj : (TreeSet)gen.getValue()) {
					System.out.println(stObj);
				}
			}
			
		}
	}

}

/*
//////오늘 경기 기록을 출력하세요
/// 입력: "h22","h23","h11","a3","a7","a22","h23","a11","h5","a3","h8","a11","h22","h23"..........

/// 출력내용

//h : 홈팀,  a:상대팀
//각 팀별로 선수가 안타를 친 갯수를 출력하세요
//단 선수번호는 오름차순으로 정렬

ex)

홈팀

22 : 2
23 : 3

...

상대팀

3 : 2
7 : 1
* */
