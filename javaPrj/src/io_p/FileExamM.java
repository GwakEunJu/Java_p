package io_p;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

class FileStud {
	private final String name;
	private final ArrayList<Integer> jum;
	private int tot, avg;

	FileStud(String ttt) {

		String[] arr = ttt.split(",");
		name = arr[0];
		jum = new ArrayList<Integer>();

		for (int i = 1; i < arr.length; i++) {
			jum.add(Integer.parseInt(arr[i].trim()));
			// .trim()은 앞 뒤 공백문자들을 제거 (' ', \t, \n, \r 등)
		}

		calc();
	}

	private void calc() {
		tot = 0;
		for (Integer i : jum) {
			tot += i;
		}
		avg = tot / jum.size();
	}

	@Override
	public String toString() {
		String ttt = name + ",";
		for (Integer i : jum) {
			ttt += i + ",";
		}
		ttt += tot + "," + avg;

		return ttt;
	}

}

public class FileExamM {

	public static void main(String[] args) {
		try {

			// 1.입력부
			ArrayList<FileStud> studs = new ArrayList<FileStud>();

			FileReader fr = new FileReader("fff/exam.txt");

			String line = "";

			int data;

			while ((data = fr.read()) != -1) {
				char ch = (char) data;
//				System.out.println(ch);

				if (ch == '\n') {
					studs.add(new FileStud(line));
//					FileStud fst = new FileStud(line);
//					System.out.println(line);
					line = "";

				} else {
					line += ch;
				}
			}

			fr.close();

			// 2.데이터 확인 - 정보들이 잘 들어왔는지 확인
//			for (FileStud st : studs) {
//				System.out.println(st);
//			}

			// 3.출력부
			FileWriter fw = new FileWriter("zzz/examRes.txt");

			for (FileStud st : studs) {
				fw.write(st.toString() + "\n");
				System.out.println(st);
			}

			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
