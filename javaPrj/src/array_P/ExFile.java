package array_P;

public class ExFile {
    public static void main(String[] args) {
        // 입력부
        String[] men = {"아메리카노", "아프리카노", "아시아노"};
        String[] ord = {"아시아노", "아프리카노", "아메리카노", "아시아노", "아프리카노", "아메리카노", "아프리카노", "아프리카노", "아시아노"};
        int[] pri = {2000, 2300, 2400};
        int[] cnt = new int[men.length];  // 각 메뉴가 몇 번 주문되었는지 카운트 할 배열 모두 0으로 초기화

        // 연산부
        for (int m = 0; m < men.length; m++) {
        	
            for (String tt : ord) {
            	
                if (men[m]==tt) {
                    cnt[m]++;
                
                }
            }
        }

        // 출력부
        for (int m = 0; m < men.length; m++) {
            String zx = m + ":" + men[m] + ", " + cnt[m] + ", " + pri[m] + ", " +cnt[m] * pri[m];
            System.out.println(zx);
        }
    }
}
