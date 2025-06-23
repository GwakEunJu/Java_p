package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerializableInExamMain {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("fff/rrr.zxc");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
//			System.out.println(ois.readObject());
						
			REC r1 = (REC)ois.readObject();
			REC r2 = (REC)ois.readObject();
			REC r3 = (REC)ois.readObject();
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			
    		fis.close();
			ois.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
