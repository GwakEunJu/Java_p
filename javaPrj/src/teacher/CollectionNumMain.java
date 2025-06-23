package teacher;

/*
13,45,67,88,92,14,52,54,93,26,38,11,75

2 , 3의 배수를 삭제해 주세요
  
솟수를 삭제해 주세요 (Prime Number)

*/

import java.util.ArrayList;

public class CollectionNumMain {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i : new int[] { 13, 45, 67, 88, 92, 14, 55, 52, 54, 93, 26, 38, 11, 75 }) {
			arr.add(i);
		}

		ArrayList<Integer> arr1 = (ArrayList<Integer>) arr.clone();
		System.out.println(arr);

		arr.removeIf(i -> i % 2 == 0 || i % 3 == 0);
		System.out.println(arr);

		System.out.println(arr1);
		arr1.removeIf(i -> {
			boolean res = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					res = false;
					break;
				}
			}

			return res;
		});
		System.out.println(arr1);
	}
}
