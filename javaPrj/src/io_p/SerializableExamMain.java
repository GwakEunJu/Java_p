package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
직사각형 클래스를 정의하고 직렬화 하여 파일에 데이터를 저장하세요
파일 : fff/rrr.zxc

직사각형 클래스
가로,세로 -> 넓이, 둘레

직사각형 3개

저장된 파일로 부터 직사각형의 정보를 출력하세요
 
 
 * */

//직렬화된 클래스
class REC implements Serializable {
	int w, h, border, area;

	public REC(int w, int h) {
		
		this.w = w;
		this.h = h;
		calc();

	}

	void calc() {
		area = w * h;
		border = (w + h) *2;
		
	}
	
	
	@Override
	public String toString() {
		return "REC [border=" + border + ", areea=" + area + "]";
	}	
}


public class SerializableExamMain {

	public static void main(String[] args) {
		try {
			FileOutputStream fos =  new FileOutputStream("fff/rrr.zxc");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
	
//			fos = new FileOutputStream("fff/rrr.zxc");
			
			
			//Serializable(직렬화) 된 객체
			oos.writeObject(new REC(5,10)); 
			oos.writeObject(new REC(10,10)); 
			oos.writeObject(new REC(6,8)); 
			
			oos.close();
			fos.close();
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
