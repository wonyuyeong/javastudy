package com.ict.day05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		// 숫자를 입력받아서 짝수인지 홀수인지 알아내고, 계속할까요? 물어봐서 no하면 끝내기.
	
	while (true) {
		
		Scanner scan = new Scanner(System.in) ;
		String result = "" ;
		System.out.print("숫자 입력 : ");
		int k1 = scan.nextInt() ;
		
		if (k1%2==0) {
			result = "짝수" ;
		}else if(k1%2==1){
			result = "홀수" ;
		}
		System.out.println("결과는 "+result+"입니다.");
			
		System.out.println("계속하시겠습니까? 1.yes, 2.no");
		int k2 = scan.nextInt() ;
		if (k2==2)  break ;
	}	
		System.out.println("수고하셨습니다.");
		
	}
}
