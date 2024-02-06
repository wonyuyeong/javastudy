package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// PrintStream 은 모든 데이터를 출력할 수 있다. (입력없음)
// 기본 생성자가 없어서 BufferedStream처럼 FileStream 을 이용하자
public class Ex02 {
	public static void main(String[] args) {
		String pathname = "D:/wyy/util/test04.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null ;
		PrintStream ps = null ;
		
		try {
			fos = new FileOutputStream(file) ;
			ps = new PrintStream(fos) ;
			// System.out.println(기본자료형+String) 와 같음
			ps.println('A');
			ps.println(false);
			ps.println(3.14);
			ps.println("Hello World");
			ps.println(92);
			ps.println("자바의 세계에 오신 것을 환영합니다.");
			ps.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
