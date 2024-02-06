package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 첫번째 숫자 :
		System.out.print("첫번째 숫자 : ");
		int k1 = scan.nextInt();

		// 두번째 숫자 :
		System.out.print("두번째 숫자 : ");
		int k2 = scan.nextInt();

		// 연산자 : +, 0, *, /
		System.out.print("연산자 : +, -, *, /  ");
		String str = scan.next();

		// 객체 만들기
		Ex17 t = new Ex17();

		//출력
		switch (str) {
		case "+":
			t.plus(k1, k2);
			System.out.println(k1+str+k2+"="+t.res);
			break;
		case "-":
			t.sub(k1, k2);
			System.out.println(k1+str+k2+"="+t.res);
			break;
		case "*":
			int k = t.mul(k1, k2);
			System.out.println(k1+str+k2+"="+k);	
			break;
		case "/":
			double s = t.div(k1, k2);
			System.out.println(k1+str+k2+"="+s);
			break;
		}


		// 숫자 연산자 숫자 = 결과

	}
}
