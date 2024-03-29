package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL(Uniform Resource Locator)	:	인터넷에서 접근 가능한 자원의 주소
// URL 클래스 :	해당 위치의 자원의 결과만 가져온다.
//						final 클래스이다. 상속 안됨.

public class Ex12 {
	public static void main(String[] args) {
		InputStream is = null ;
		InputStreamReader isr = null ;
		BufferedReader br = null ;
		
		// 내 컴퓨터에 저장
		String pathname = "D:/wyy/util/webPage01.text";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null ;
		try {
			URL url = new URL("https://comic.naver.com/index") ;
			
			is = url.openStream() ;
			isr = new InputStreamReader(is) ;
			br = new BufferedReader(isr) ;
			
			String msg = null ;
			//  String 에 여러번 "+" 를 사용하면 메모리에 쓸데없는공간들이 만들어 진다.
			// 그것을 해결하기 위해서 StringBuffer 나 StringBuilder 사용
			// append() 로 추가 한다.
			StringBuffer sb = new StringBuffer() ;
//			StringBuilder sb = new StringBuilder() ;
			while((msg = br.readLine()) != null) {
				//화면에 출력
				// System.out.println(msg+"\n");
				sb.append(msg+"\n") ;
			}
//			sb.toString(); =>자료형을 String으로 만들어 준다.
//			System.out.println(sb.toString());
			
			// 파일에 저장하기
			fw = new FileWriter(file) ;
			bw = new BufferedWriter(fw) ;
			bw.write(sb.toString()) ;
			bw.flush() ;
			
		} catch (Exception e) {
			
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
	}
}
