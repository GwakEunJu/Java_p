package basic;

public class ExamMain {

	public static void main(String[] args) {
		final int ban = 2, kor = 88, eng = 76,mat = 67;
		final String name = "정우성";
		final int tot = kor + eng + mat;
		final double avg = (double)tot / 3;  //(double)tot는 정수를 실수로 강제변환 (연산의 방식 때문에 연산 전에 형 변환을 해줘야한다) 

				System.out.println("반: "+ban);
				System.out.println("성명: "+name);
				System.out.println("국어: "+kor);
				System.out.println("영어: "+eng);
				System.out.println("수학: "+mat);
				System.out.println("총점: "+tot);
				System.out.println("평균: "+avg); 
	}

}

//int num = 2;
//String name = "홍길동";
//int ko = 67;
//int en = 88;
//int e = 78;
//int total = ko+en+e;
//double avg = ko+en+e/3;
//
//System.out.println("반: "+num);
//System.out.println("성명: "+name);
//System.out.println("국어: "+ko);
//System.out.println("영어: "+en);
//System.out.println("수학: "+e);
//System.out.println("총점: "+total);
//System.out.println("평균: "+avg);
//


//final int ban = 2, kor = 88, eng = 76, mat = 67;  // final 변경 불가한 변수 지정
//final String name = "정우성";				 
//final int tot = kor + eng + mat;
//double tot2 = tot;						  // tot을 tot2에 실수로 변환
//
//final double avg = tot2 / 3;
//
//      System.out.println("반: "+ban);
//		System.out.println("성명: "+name);
//		System.out.println("국어: "+kor);
//		System.out.println("영어: "+eng);
//		System.out.println("수학: "+mat);
//		System.out.println("총점: "+tot);
//		System.out.println("평균: "+avg);
//