package collection_p;

import java.util.TreeSet;

/*
도형 정보를 입력하여 도형의 종류 및 넓이 순서대로 출력하세요

5_6,6,7_8_15,10_20,7

직사각형,원,직각삼각형,직사각형,원

*/


class ComparShape implements Comparable {
	
	String name;
	int border;
	
	
	public ComparShape(String name, int border) {
		
		this.name = name;
		this.border = border;
	}
	


	@Override  // Comparable 재정의 출력 순서 
	public int compareTo(Object o) {
		
		return 0;
	}



	@Override
	public String toString() {
		return name + " , " + border;
	}
	
	
	
}

public class ComparebleShapeMain {

	public static void main(String[] args) {
		String aa = "5_6,6,7_8_15,10_20,7";
		
		
		
	
		
	}

}
