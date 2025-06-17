package teacher;

public class LowupMain {

	public static void main(String[] args) {
		
		// "aBcd Efg HIJk lMn opQR" -> Abcd Efg Hijk Lmn Opqr 로 변경해주세요
				
		String ori = "aBcd Efg HIJk lMn opQR";	//원래 문자열			
		System.out.println(ori);	
		String ret = "";						//결과 문자열 초기화
		
		// ori를 모두 소문자로 변환, 공백(" ")을 기준으로 단어별로 나눠 반복
		for (String xx : ori.toLowerCase().split(" ")) {
//			System.out.println(xx.substring(0,1).toUpperCase()+xx.substring(1));
			ret += xx.substring(0,1).toUpperCase()+xx.substring(1)+ " ";
			// 각 단어 xx에서:
			// 1. 첫 글자 (substring(0,1))를 대문자로 바꾸고,
			// 2. 나머지 부분 (substring(1))은 그대로 둔 채 연결
			// 3. 각 단어 사이에 공백 추가
		}
		// 마지막 단어 뒤의 여분 공백 제거 (맨 끝 공백 제거용)
		System.out.println(ret.substring(0,ret.length()-1));

	}

}
