package com.ict.day14;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc :while (true) {
			try {
				System.out.print("숫자 입력 : ");
				String su = scan.next();
				// 숫자가 아닌 것을 넣으면 오류 발생(나중에 try~catch처리)
				int s1 = Integer.parseInt(su);			// 문자열(String)로 받은 su를 int로 변환
				String res = "";
				if (s1%2==0) {
					res = "짝수";
				}else {
					res = "홀수";
				}
				System.out.println(su+"는 "+res+"입니다.");
				
				while (true) {
					System.out.println("계속할까요(y/n)");
					String msg = scan.next();
					// String에서는 같다를 == 사용하면 안됨
					// equals() -> 대소문자 구별o, equalsIgnoreCase() -> 대소문자 구별x
					if (msg.equalsIgnoreCase("y")) {
						continue esc;
					}
					if (msg.equalsIgnoreCase("n")) {
						break esc;
					}
					System.out.println("제대로 입력 하세요.");
				}				// 안 while
			} catch (NumberFormatException e) {
				System.out.println("문자를 입력하면 안돼요!");
			}
			System.out.println("밖while 전");
		}						// 바깥 while
					System.out.println("수고하셨습니다.");
					
					
					
					
					
					
					
					
					
					
					
	}
}
