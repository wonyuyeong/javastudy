package com.ict.day06;

import java.util.Scanner;

public class EX06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		esc:while (true) {
			// 숫자를 받아서 홀수인지 짝수인지 출력하자
			System.out.print("숫자 입력 : ");
			int k1 = scan.nextInt();
			String result = "";
			if (k1 % 2 == 0) {
				result = "짝수";
			} else {
				result = "홀수";
			}
			System.out.println(k1 + "는" + result + "입니다.");
			
			 while (true) {	
			System.out.print("계속 하시겠습니까? (1. yes, 2.no) >>");
			int k2 = scan.nextInt();
			if(k2==1) continue esc;
			if (k2 == 2)		break esc;
			
			System.out.println("제대로 입력하세요.");
				} // 안쪽 while
		}		// 바깥쪽 while
		
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		
		
		
	}
}
