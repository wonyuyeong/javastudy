package com.ict.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = "D:/wyy/util/exam01.txt" ;
		File file = new File(pathname) ;
		try {
			// 파일 생성
		boolean b1 =	file.createNewFile() ;
		if (b1==true) {
			System.out.println("파일 생성 성공");
		}else {
			System.out.println("파일 생성 실패");
		}
		System.out.println();
		File file3 = new File("D:/wyy/util/kkk/yyy") ;
		boolean b2 = file3.mkdir() ;
		if (b2==true) {
			System.out.println("디렉토리 생성 성공");
		}else {
			System.out.println("디렉토리 생성 실패");
		}
		System.out.println();
		
		boolean b3 = file3.mkdirs() ;
		if (b3==true) {
			System.out.println("디렉토리 생성 성공");
		}else {
			System.out.println("디렉토리 생성 실패");
		}
		System.out.println();
		
		// 삭제대상
		String pathname2 = "D:/wyy/util/exam01.txt" ;
		File file4 = new File(pathname2) ;
		boolean b4 = file4.delete() ;
		if (b4) {
			System.out.println("파일 삭제 성공");
		}else {
			System.out.println("파일 삭제 실패");
		}
		// 삭제 대상 (폴더 안에 내용이 있으면 삭제 불가)
		String pathname3 = "D:/wyy/util/kkk/yyy" ;
		File file5= new File(pathname3) ;
		boolean b5 = file5.delete() ;
		if (b5) {
			System.out.println("디렉토리 삭제 성공");
		}else {
			System.out.println("디렉토리 삭제 실패");
		}
		
		String pathname4 = "D:/wyy/util/kkk" ;
		File file6= new File(pathname4) ;
		boolean b6 = file6.delete() ;
		if (b6) {
			System.out.println("디렉토리 삭제 성공");
		}else {
			System.out.println("디렉토리 삭제 실패");
		}
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		

		
	}
}
