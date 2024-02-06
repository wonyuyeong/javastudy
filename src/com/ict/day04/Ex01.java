package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		//삼항 연산자
		// 형식) 자료형 변수 = (조건식) ? 참 일 때 실행할 문장 : 거짓일때 실행할 문장 ;
		// int k1 이 홀수인지 짝수인지 판별하자
		// 힌트 ) 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		int k1 = 7;
		int res = k1%2;       
		
		// 자료형 변수 = (res == 1) ? "홀수" : "짝수" ;
		 String result = (res == 0) ? "짝수" : "홀수" ;    //더 많이 씀
		 
		 System.out.println(k1+":"+result);
		 
		 result = (k1%2==0)?"짝수":"홀수";
		 
		 //int k2가 60 이상이면 합격, 아니면 불합격
		 int k2 = 57;
		  result = (k2>=60)?"합격":"불합격";
		 
		 System.out.println(k2+":"+result);
		 
		 // k3가 1이면 가격에 0.1 할인 한다.(얼마에 살 수 있나?)
		 int k3 = 1;
		 int price = 1000;
		
		 int res2  = (k3==1)? price-(int)(price*0.1):price;
		 // 자료형 변수 = (k3==1)? price-(price/10):price;   <-3개다 같은 뜻
		 // 자료형 변수 = (k3==1)?(int)(price*0.9):price;
		 
		 System.out.println("결과 : "+res2);
		 
		 //char k4 = 대문자 인지 대문자가 아닌지 판별하자
		 char k4 = 'Q';
		 result = (k4>='A' && k4<='Z') ? "대문자" : "대문자 아님" ;
		 System.out.println("결과 : "+result);
		 
		 // 근무시간이 8시간 까지는 시간당 9860 이고
		 // 8시간 초과한 시간 만큼은 1.5배 지급한다.
		 // 현재 근무한 시간이 10시간 이다.
		 // 얼마를 받아야 하는가?
		 int time = 10;
		 int dan = 9860;
		 int res3 = (time>8) ? (int)(dan*1.5*(time-8))+(8*dan) : time*dan ;
		 System.out.println("금액 : "+res3);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		
		
	}
}
