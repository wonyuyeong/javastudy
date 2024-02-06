package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		//switch ~ case : 다중 if~else 문과 같은 조건문
		// if 문 : 조건식 boolean 형, 즉 비교연산, 논리연산, boolean 형일 때
		// switch 문 : 인자값이 int 이하, char, String 일 때 사용
		//					(long, 실수형 일 때 사용 불가)
		// 형식) 	switch(인자값 = int, char, String) {
		//						case 조건값1 : 연차값과 조건값1이 같을 때 수행할 문장 ; break ;
		//						case 조건값2 : 연차값과 조건값2이 같을 때 수행할 문장 ; 
		//												 연차값과 조건값2이 같을 때 수행할 문장 ; break ;
		//						case 조건값3 : 연차값과 조건값3이 같을 때 수행할 문장 ; break ;
		//						default : 조건값1, 2, 3 모두 같지 않을 때 수행할 문장 ;
		//					}
		// ** 주의사항 : break가 없으면 break를 만날 때 까지 모든 실행문을 실행한다.
		// break문의 역할은 현재 실행 중인 범위( () 블록 ) 를 벗어나는 역할을 한다.
		// default는 생략 가능
		
		// int k1 = 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일 쥬스
		int k1 = 3;
		String name = "";
		
		if (k1==1) {
			System.out.println("카페모카");
		} else if (k1==2) {
			System.out.println("카페라떼");
		}else if (k1==3) {
			System.out.println("아메리카노");
		}else if (k1==4) {
			System.out.println("과일쥬스");
		} 
		  
		switch (k1) {
		case 1:		System.out.println("카페모카");		break;
		case 2:		System.out.println("카페라떼");		break;
		case 3:		System.out.println("아메리카노");		break;
		case 4:		System.out.println("과일쥬스");		break;
		// switch문은 순서 상관 없음. 만약 k1이 3이면 바로 case3 찾아서 실행함.
		}
		
		
		// char k2가 A면 아프리카. B면 브라질, C면 캐나다, 나머지 한국
		
			char k2 = 'B';
			String result = "";
			
			
			switch (k2) {
			case 'A':		result = "아프리카";	break;
			case 'B':		result = "브라질";	break;
			case 'C':		result = "캐나다";	break;
			default: 		result = "한국";	break;
			}
			System.out.println("결과 : " +result);
		
			// char k3가 A이거나 a 이면 아프리카,  B 또는 b면 브라질, C 또는 c 면 캐나다, 나머지 한국
			
			char k3 = 'F';
			String result2 = "";
			
			switch (k3) {
			case 'A':  result2 = "아프리카"; break;
			case 'a':  result2 = "아프리카"; break;
			case 'B': result2 = "브라질"; break;
			case 'b': result2 = "브라질"; break;
			case 'C': result2 = "캐나다"; break;
			case 'c': result2 = "캐나다"; break;
			default: result2 = "한국"; break;
			}
			System.out.println("결과 : "+result2);
			
			// char k4가 A이거나 a 이면 아프리카,  B 또는 b면 브라질, C 또는 c 면 캐나다, 나머지 한국
			
			char k4 = 'B';
			String result4 = "";
					
			switch (k4) {
			case 'A': 
			case 'a':  result4 = "아프리카"; break;
			case 'B': 
			case 'b': result4 = "브라질"; break;
			case 'C': 
			case 'c': result4 = "캐나다"; break;
			default: result4 = "한국"; break;
			}
			System.out.println("결과 : "+result4);
			// 겹치는게 있을 때 break를 안쓰면 break 만나면 그 줄 실행
		
			// String k5이 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워싱턴
				
			String k5 = "한국";
			String result5 = "";
			
			switch (k5) {
			case "한국": result5 = "서울"; break;
			case "중국": result5 = "베이징"; break;
			case "일본": result5 = "도쿄"; break;
			case "미국": result5 = "워싱턴"; break;
			}
			System.out.println("결과 : "+result5);
			
			// switch문 범위가 넓어지면 사용하지 말자(if 문 사용하자)
			// int k6의 점수가 90 이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
			
				int k6 = 93;
				String result6 = "";
			//		switch (k6) {
			//		case 100 :	break;
			//		case 99 :	break;
			//		case 98 :	break;

			//		default:
			//		break;
			//		} 
			// 이렇게 하면 케이스 범위가 너무 넓음. 이럴땐 if문을 쓰는게 좋다
				
					switch ((int)k6/10) {
					case 10: 
					case 9: result6 = "A";		break;
					case 8: result6 = "B";	break;
					case 7: result6 = "C";		break;
					default: result6 = "F";	break;
					}
					System.out.println("결과 : "+result6);
		
		
		
		
	}
}
