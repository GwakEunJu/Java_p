package io_p;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedMain {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("fff/aaa.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line=null;
			for (int i = 0; (line=br.readLine())!=null; i++) {
				System.out.println(i+" : "+line);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
