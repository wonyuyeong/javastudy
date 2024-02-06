package com.ict.day07;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// 		** 반드시 같은 자료형이여야함.!!**
		//			생성할 때 크기를 지정해야 한다. (지정하지 않으면 생성 안됨)
		//			한번 지정한 크기는 변경이 안됨
		//			배열 안에 데이터를 가져오기 위해서는 일반적으로 for문을 사용
		
		// 배열 생성 순서 : 선언 => 생성 => 초기화 (데이터 저장)
		// 1. 선언 : 		자료형 이름[]; 또는 자료형[] 이름;
			int su[];		// 또는 int[] su;
		
		// 2. 생성  : 		이름 = new 자료형[배열크기];
		//			new 예약어 : 메모리에 데이터를 저장할 공간을 만들어 달라.
		//								-> 인스턴스, 객체 생성
			su = new int[4];
			
		// 3. 데이터 저장 : 	이름[index = 위치값 = 0부터 시작]
		// 							데이터는 같은 자료형 이여야 한다(프로모션 가능 : 작은 자료형이 큰자료형으로 변경)	
		
			su[0] = 100;
			su[1] = 'a';						// 프로모션,    int>char
			// su[2] = 3.14 ;				// 정수보다 실수가 크므로 오류
			su[2] = (int)3.14;			// 디모션(강제 형변환) 값은 정수값만 들어간다.
			su[3] = 100 ;					// 값은 겹쳐도 상관없음
		//	su[4] = 107;					// 배열의 크기를 벗어났으므로 실행할 때 오류남. -> run time 오류
			
			// 배열 호출 하면 주소(생성 ID)가 출력
			System.out.println(su);					// 생성ID 출력
			System.out.println(su[0]);				// 100
			System.out.println(su[1]);				// 97
			System.out.println(su[2]);				// 3
			System.out.println(su[3]);				// 100
			System.out.println();
			
			// 배열의 전체를 출력할 때는 보통 for문 사용
			 for (int i = 0; i < 4; i++) {
				System.out.println(su[i]);
			}
			
			
			
			
			
		
	}
}
