package array_P;

public class ArrayCutline {

	public static void main(String[] args) {
		int [] arr = {67,98,34,72,86,23,84};
		
		int tot = 0;
		
//		if (arr[0]>=70) {
//			System.out.println(0);
//			tot += arr[0];
//		}
//		if (arr[1]>=70) {
//			System.out.println(1);
//			tot += arr[1];
//		}
//
//		if (arr[2]>=70) {
//			System.out.println(2);
//			tot += arr[2];
//		}
//
//		if (arr[3]>=70) {
//			System.out.println(3);
//			tot += arr[3];
//		}
//
//		if (arr[4]>=70) {
//			System.out.println(4);
//			tot += arr[4];
//		}
//
//		if (arr[5]>=70) {
//			System.out.println(5);
//			tot += arr[5];
//		}
//		if (arr[6]>=70) {
//			System.out.println(6);
//			tot += arr[6];
//		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>=70) {
				System.out.println(i);
				tot += arr[i];
			}
		}

		System.out.println(tot);
	}

}
