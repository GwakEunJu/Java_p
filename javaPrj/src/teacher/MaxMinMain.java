package teacher;

/*
숫자 배열을 입력받아 합계, 최대, 최소 를 출력하세요 
48 56 79 12 45 9 7 81 32 100 54 56

전체입력 : input
합계메소드, 최대메소드, 최소메소드

결과 : 합계,최대,최소
 
*/

class MCNumber{
	int tot, max, min;
	void input(int [] nums) {
		
		if(nums.length==0) {
			min = 0;
			max = 0;
			tot = 0;
		}else {
			sum(nums);
			maxGo(nums);
			minGo(nums);
		}
		
	}
	
	void sum(int [] nums) {
		tot=0;
		for (int i : nums) {
			tot += i;
		}
	}
	void maxGo(int [] nums) {
		
		max = nums[0];
		for (int i : nums) {
			if(max<i) {
				max = i;
			}
		}
	}
	
	void minGo(int [] nums) {
		
		min = nums[0];
		for (int i : nums) {
			if(min>i) {
				min = i;
			}
		}
	}
	
	void ppp() {
		System.out.println("합계 : "+tot+" , 최대:"+max+" , 최소:"+min);
	}
	
}

public class MaxMinMain {

	public static void main(String[] args) {

		MCNumber mcn = new MCNumber();
		mcn.input(new int[] {
			48, 56, 79, 12 ,45 ,9 ,7 ,81 ,32 ,100 ,54 ,56				
		});
		mcn.ppp();
	}

}
