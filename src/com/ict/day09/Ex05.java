package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스를 객체로 만들어야
		// Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다.
		
		// Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04() ;
		
		System.out.println(t.name);
		
		// Ex04에 있는 play01 메서드를 호출하자
		// play01이 void 이기 때문에 데이터를 가져오지는 않는다.
		//System.out.println(1);
		System.out.println(t.total);		// play01 호출하기전이라 0
		t.play01();
		System.out.println(t.total);		// play01 호출한 후라 260
		//System.out.println(4);
		
		t.play02();
		//	System.out.println(t.sum);  // 불러올 수 없다.
		
		int k = t.play03() ;
		System.out.println(k);
		
		
		
		
	}
}
