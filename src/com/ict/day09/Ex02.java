package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 클래스에 static 변수와 상수가 있다.
		// 객체 생성 없이 호출 할 수 있다.
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER ;
		System.out.println("eng : "+k1);
		System.out.println("com : "+k2);
		
		// Ex01 클래스를 객체로 만들자
		// 해당 클래스에 생성자가 없으면 무조건 기본생성자 만든다.
		// 클래스이름() => 즉, 인자가 없는 생성자를 기본생성자라고 한다.
		// Ex01 참조변수 = new 생성자( [인자] ) ;
			Ex01 t = new Ex01();
			System.out.println(t);
			System.out.println(t.name);
			System.out.println(t.kor);
			System.out.println(t.MATH);
			System.out.println();
			
			//권장사항
			System.out.println("eng : " +k1);
			System.out.println("com : " +k2);
			System.out.println();
			
			// 이렇게 할 수도 있다. 결과나옴
			System.out.println(t.eng);
			System.out.println(t.COMPUTER);
			
			System.out.println();
			
		// 변수와 상수
			t.kor = 90 ;
			System.out.println(t.kor);
			
		// 상수는 값을 바꿀 수 없다.
		// t.MATH = 100 ;		<- 오류. 
			
			
			
			
			
			
			
	}
}
