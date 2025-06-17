package util_p;

import java.util.Arrays;
import java.util.Scanner;

public class SaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String [] sa = {"a20020122_lsh"};
		String[] bu = "영업부,인사부,두부,부부".split(",");
		String aa = "";

		while (true) {
			System.out.println("입력 : ");
			String user = sc.nextLine();
			if (user == "a") {
				System.out.println(bu[0]);
			}
		}
	}

}
