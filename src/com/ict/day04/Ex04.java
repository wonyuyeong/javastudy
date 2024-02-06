package com.ict.day04;

public class Ex04 {
	public static void main(String[] args) {
		// 단순 if 문 : 조건이 참일때만 실행, 거짓일 경우는 무시한다.
		// 형식)    if(조건식) {
		//					조건식이 참일때 실행할 문장;
		//					조건식이 참일때 실행할 문장;
		//					조건식이 참일때 실행할 문장;
		//				}
		//		주의사항 : 실행할 문장이 한 줄이면 {}(블록) 생략 가능
		
		// int k1이 60 이상 합격
		int k1 = 30;
		String result = "불합격";
		if (k1>=60) {
			result = "합격";
		}
		System.out.println("결과 : "+result);
		
		// inf k2가 60이상이면 합격, 60 미만이면 불합격
		int k2 = 79;
		String result2 = "초기값";
		if (k2>=60) {
			result2 = "합격";
		}
		if (k2<60) {
			result2 = "불합격";
		}
		
		System.out.println("k2 : " + result2);
		
		// inf k3가 60이상이면 합격, 60 미만이면 불합격
		int k3 = 79;
		String result3 = "불합격";
		if (k3>=60) {
			result3 ="합격";
		}
		System.out.println("k3 : "+result3);
		
		
		
	}
}
