package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 t = new Ex01() ;
		int var1  = 100 ;
		// 인자가 기본자료형 : Call By Value
		// 값이 변하지 않는다.
		int var2  = t.add(var1) ;
		
		System.out.println("값1 : "+var1);		// 100, 값이 변하지 않는다.
		System.out.println("값2 : "+var2); 		// 101

		int[] su = {1,10,100,1000} ;
		// 인자가 객체(배열도 포함) 자료형 : Call By Reference
		// 참조되는 값이 변할 수도 있다.
		t.add2(su);
		
		// 배열안에 값이 변한다.
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);		// 10씩 증가되어 있음
		}
		
		
		
		
		
	}
}
