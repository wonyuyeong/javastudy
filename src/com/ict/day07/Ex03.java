package com.ict.day07;

public class Ex03 {
	public static void main(String[] args) {
		// 선언
		// char[] ch;
		
		// 생성
		// ch = new char[4];
		
		//선언과 생성을 한번에
		char[] ch = new char[4];
		// 초기값 넣기
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 65;		// 0~65,635 사이의 숫자는 형변환 안해도 가능
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);  						// J A V A
		}
		
		// 선언과 생성, 초기값 넣기를 한번에
		char[] ch2 = {'j', 'a', 'v', 97};
		int[] k2 = {100, 200, 300, 'a'};
		double[] d2 = {7.15, 7.16, 7.0, 7};
		// 자료형 클래스 이므로 참조자료형 배열(객체형 배열)
		String[] s1 = {"홍길동", "이길동", "고길동", "박길동"};
		
		for (int i = 0; i < k2.length; i++) {
			System.out.println(k2[i]);					// 100, 200, 300, 97
	
		}
		
		
		
		
	}
}
