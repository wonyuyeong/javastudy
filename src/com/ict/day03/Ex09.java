package com.ict.day03;

public class Ex09 {
	public static void main(String[] args) {
		// 카페모카 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가? (단, 부가세 10% 포함)
		
		//입력 정보
		//String coff = "카페모카";
		int input = 15000 ;   
		int dan = 6500 ;   //카페모카 가격
		int su = 2;        // 수량
		
		int total = dan*su;  //총 카페모카 가격
		int vat = total/10;         // 총 카페모카 가격의 부가세 10%
		int vat1 = (int)(total*0.1);// 계산 방법만 다를뿐 vat=vat1
		System.out.println(vat);
		System.out.println(vat1);
		
		int sum= total+vat;  // 총 카페모카 가격+부가세10%
		int output = input-sum;
		System.out.println(sum);
		System.out.println("잔돈 : "+output+"원");    // 낸 돈에서 카페모카 가격 및 부가세10% 뺀 금액
		
		//다른방법
		int sum2 = (int)(total*1.1);
		System.out.println(sum2);

	
	
		
		
		
		
		
		
	}
}
