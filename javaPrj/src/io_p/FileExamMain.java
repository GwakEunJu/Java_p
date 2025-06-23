package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileExamMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/aaa.txt");
			FileOutputStream fos = new FileOutputStream("zzz/ccc.txt");
			
			
			System.out.println("fis 값 : "+fis.available());
			
			
			while(fis.available() > 0) { 	// while 문 없이해야함
				byte [] buf = new byte[fis.available()];
				fis.read(buf);
				
				fos.write(buf);
				
			
			}
			
			
			
			

			
			fis.close();
			fos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
