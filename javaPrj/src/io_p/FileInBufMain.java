package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInBufMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/aaa.txt");
			
			System.out.println("---->> "+fis.available());
			byte [] buf = new byte[fis.available()];
			int len = fis.read(buf);
			String ttt = new String(buf);
			System.out.println(ttt);
			
			fis.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
