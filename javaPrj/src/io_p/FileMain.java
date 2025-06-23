package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		File ff = new File("fff/kkk.txt");

		System.out.println("ff : "+ff);
		System.out.println("존재유무 : "+ff.exists());	
		System.out.println("파일인지 : "+ff.isFile());
		System.out.println("폴더 인지 : " +ff.isDirectory());	
		System.out.println("절대주소인지 : "+ff.isAbsolute());	
		System.out.println("부모폴더 : "+ff.getParent());
		System.out.println("이름 : "+ff.getName());
		System.out.println("절대경로 : "+ff.getAbsolutePath());
		System.out.println("숨김파일인지 : "+ff.isHidden());
		System.out.println("읽기가능 : "+ff.canRead());
		System.out.println("쓰기가능 : "+ff.canWrite());
		System.out.println("파일크기 : "+ff.length());
		System.out.println("마지막수정시각 : "+new Date (ff.lastModified()));
	
		
		
		
	
		try {
			//파일 생성
			ff = new File("fff/ttt.txt");
			ff.createNewFile();
			
			//폴더 생성
			new File("fff/qqq").mkdir();
			//new File("fff/www/rrr").mkdir();
			new File("fff/www/rrr").mkdirs(); // 폴더 계층 생성
			
			//파일, 폴더 삭제
			boolean bb = ff.delete();
			System.out.println(bb);
			
			bb = new File("fff/qwer.txt").delete();
			System.out.println(bb);
			
			//파일 이동
			new File("fff/rayn_2.jpg").renameTo(new File("zzz/house.jpg"));
			
			//파일 복사
			Files.copy(new File("fff/rc.jpg").toPath(),
					   new FileOutputStream("zzz/racun.jpg"));
			
			
			System.out.println("파일 리스트-----------------------------");
			
			//폴더 안의 내용을 배열로 리턴
			File [] arr = new File("fff").listFiles();
			
			for (File file : arr) {
				System.out.println(file.getName()+" --> "+file.isDirectory());
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
	}

}
