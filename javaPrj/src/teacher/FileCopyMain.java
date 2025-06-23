package teacher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("fff/face.jpg");
			FileOutputStream fos = new FileOutputStream("zzz/rayn.jpg");
			
			byte [] buf = new byte[fis.available()];
			
			fis.read(buf);
			fos.write(buf);
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
