package study;

public class FriDay {

	public static void main(String[] args) {
		int [] jum = {87,65,82,46,98,65,72,34,91,79,45,67};  // 점수 배열 생성
		
		for (int i = 0; i < jum.length; i++) {   // jum의 길이만큼 반복 후 증감
			System.out.println(jum[i]);   //배열의 i값을 출력
		}
		
		System.out.println("----------------------------------------");
		
		int cnt = 0;			// 70점 이상인 점수의 개수를 저장할 변수 
		for (int j : jum) {		// 배열jum에서 값을 하나씩 꺼내서 j에 저장하며 반복
			
			System.out.println(j);
			if(j >=70) {
				System.out.println(j);
				cnt++;
			}
		}System.out.println(cnt);

		int [] suc = new int [cnt];  // suc 배열에 cnt크기만큼 의 배열을 새로 생성
		int pos = 0;				// 70점 이상인 점수를 지정할 배열의 인덱스를 나타내는 변수
		for (int j : jum) {
			if(j>=70) {
				System.out.println(j);
				suc[pos] = j;		// j를 suc배열에 넣는다
				pos++;				// 다음 칸으로 이동
			}
		}
		
		for (int i : suc) {			// 배열 suc에서 갑을 하나씩 꺼내 i에 저장
			System.out.println(i);
		}
	}

}
