package com.ict.day03;

public class Ex03 {
	public static void main(String[] args) {
		// 논리 연산자 : &&(AND, 논리곱, 교집합), ||(OR, 논리합, 합집합), !(NOT, 논리부정)
		// 논리연산자 대상은 boolean형(비교연산,논리연산자,논리형)
		// 논리연산자 결과는 boolean형
		
		// &&(AND, 논리곱, 교집합)
		// 주어진 조건들이 모두 참(true)일 때 결과는 참(true)이다.
		// 조건들 중에 거짓(false)이 있으면 결과는 거짓(false)이다.
		// ** 거짓 이후에 연산은 하지 않는다.
		// AND 조건을 이용하면 범위를 지정할 수 있다.
		// a>= 10 && a<= 20
		// a는 10이상 20 이하의 범위를 의미한다.
		
		int su1 = 10;
		int su2 = 7;
		boolean res ;
		// true = true && true
		res=(su1>=7) && (su2>=5);
		System.out.println(res);
		// true = true && false
		res=(su1>=7) && (su2<=5);
		System.out.println(res);
		// true = false && true
		res=(su1<=7) && (su2>=5);
		System.out.println(res);
		// true = false && false
		res=(su1<=7) && (su2<=5);
		System.out.println(res);
		
		System.out.println();
		
		// int su1 = 10, int su2 = 7
		res = ((su1=su1+2) > su2) && (su1 == (su2=su2+5));
		// ((su1=12)>su2=7) && (12 ==(su2=12))  
		//        true      &&       true       ->true
		System.out.println("결과 : "+ res);
		System.out.println("su1 : "+ su1);
		System.out.println("su2 : "+su2);
		
		System.out.println();
		
		su1 = 10 ;
		su2 = 7;
		res = ((su1=su1+2) < su2) && (su1 == (su2=su2+5));
		// ((su1=12)<su2=7) && (12 ==(su2=12))  
		//        false                         ->false (false가 나왔으므로 뒤에 값은 계산 안함)
		System.out.println("결과 : "+ res);
		System.out.println("su1 : "+ su1);
		System.out.println("su2 : "+su2);
		
		System.out.println();
		
		int su3 = 34;
		// su3값은 20~30 사이의 값이다.
		res = su3>=20 && su3<=30 ;
		System.out.println(res);
		// su3 값은 30~40 사이의 값이다.
		res = su3>=30 && su3<=40 ;
		System.out.println(res);
		System.out.println();
		//char c1 이 소문자이냐?
		char c1 = 'G';
		res = c1>='a' && c1<='z';
		System.out.println(res);
		
		c1 = 'm';
		res = c1>='a' && c1<='z';
		System.out.println(res);
		
		
		
		
		
		
		
	}
}
