package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileInmain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/aaa.txt");
			
			System.out.println("---->> "+fis.available());
			while(fis.available() > 0) {
				int data = fis.read();
				System.out.print((char)data);
			}
			
			fis.close();
			
			
			System.out.println("----------------------------------");
			
			FileReader fr = new FileReader("fff/aaa.txt");
			
			
			//fr.available(); 에러발생.
			//(data = fr.read()는 한글자씩 읽어 정수로 반환하고 data에 대입 ,
			//!= -1는  읽은 값이 -1이 아니라면 반복
			int data ;
			while((data = fr.read()) != -1 ) {
				System.out.print((char)data);
			}
			
			fr.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
