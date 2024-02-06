package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 키보드로 받아서
		// 총점과 평균을 구하자.
		// 출력은 이름, 총점, 평균만 출력하자.(단, 평균은 소수점 둘째자리 까지 구하자)
		
		//키보드로 정보를 입력 받자.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		// 요구사항 구하기
		// 처리 = 비지니스 로직
		int sum = kor+eng+math;
		double avg = (int)(sum/3.0*100)/100.0 ;
		
		//출력
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		
	

		
		
		
	}
}
