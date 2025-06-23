package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


class Shape {
	private final ArrayList<Integer>wh;
	private int border, aera;
	
	
	public Shape(String ttt) {
		String [] arr = ttt.split(",");
		wh = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			wh.add(Integer.parseInt(arr[i]));
		}
		
		calc();
	}

	private void calc() {
		border = 0;
		aera =0;
		
		
		
	}

	@Override
	public String toString() {
		
		
		return "Shape [berder=" + border + ", aera=" + aera + "]";
	}
	
	
	
	
	
}

public class FileShapeMain {

	public static void main(String[] args) {
		try {
			
			ArrayList<Shape> mm = new ArrayList<Shape>();
			FileReader fis = new FileReader("fff/shape.txt");
			
			String line = "";
			
			int data;
			
			while((data = fis.read()) != -1) {
				char ch = (char)data;
//				System.out.println(ch);
				
				if (ch == '\n') {
					mm.add(new Shape((line)));
					line = "";
				} else {
					line += ch;
				}
			}
			
			fis.close();
			
			FileWriter fw = new FileWriter("zzz/shapeRes.txt");
			
			for (Shape sh : mm) {
				fw.write(sh.toString()+"\n");
				
			}
			
			fw.close();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
