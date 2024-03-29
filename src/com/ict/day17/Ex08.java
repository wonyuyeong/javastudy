package com.ict.day17;

public class Ex08 {
/*		함수형 프로그래밍과 람다식
		- 메서드와 함수의 차이 :	클래스 안에 존재하는 함수를 메서드, 별도로 만들 수 있는 함수를 함수 또는 Function
												기능적으로는 똑같다.
		- 함수형 프로그래밍	:	함수의 구현과 호출만으로 프로그램을 만들 수 있는 프로그래밍 방식을 말한다/. 
		- 람다식	: 	함수형 프로그래밍에서 사용하는 방식으로
						- 코드가 매우 간결해진다.
						- 컬렉션 요소(대용량 데이터)를 필터링 또는 매핑을 쉽게 집계 (Stream = 스트림)
		자바에서는 람다식을 함수형 인터페이스의 익명 구현 객체 취급 한다.		
		** 함수형 인터페이스란 추상메서드가 하나인 인터페이스를 말한다.	
		** 만약 추상메서드가 하나 이상이면 어떤 메서드를 구현하는 것인지 모호해진다.
			이를 방지하기 위해서 @Functionalinterface 애노테이션을 사용해서
			오류를 발생하게 한다.
			
		람다식 -> 매개변수를 가진 코드블록 -> 익명 구현 객체
					( [매개변수] ) -> { 실행문 } ;
					
					일반메서드								->					람다식	:	1) 반환형과 이름 삭제, 	  ([매개변수]) -> {}
					int add(int x, int y) {																(int x, int y)		->		{		 
						return x+y ;																			return x+y ;
					}																							}
	
				1. 매개변수 자료형과 괄호 생략하기
				-	매개변수의 자료형은 생략할 수 있다.
					(x, y) -> {return x+y ;}
					
				-	만약에 매개변수가 하나이면 () 생략할 수 있다.
						x	->	{ return x+10 ; }
				
				2. 중괄호 생략하기
					- 중괄호의 구현부분이 한 문장인 경우 중괄호 생략 할 수 있다.
						(return 문은 중괄호 생략 불가)
						(x, y) -> {return x+y ;}
						x	->	{ return x+10 ; }
						
						(x,y) -> x+y ;
						x -> x+10 ;
						
				3. return 생략하기
					구현부분의 return 문 하나라면 중괄호와 return 문 모두 생략하고 식만 씁니다.
					(x,y) -> x+y ;
					x -> x+10 ;
						
						
						
						
				
				
				
				
				
*/	
	
}
