package abc.pra;

import java.util.Scanner;

public class Study1106 {
	public static void main(String[] args) {
		
		Study1105 coffee = new Study1105("커피음료" ,1500) ;
		Study1105 ion = new Study1105("이온음료", 2300) ;
		Study1105 cola = new Study1105("탄산음료", 2000) ;
		Study1105 juice = new Study1105("과일음료", 1800) ;
		
		Study1105[] arr = {coffee, ion, cola, juice} ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("금액을 투입하세요 ");
		int input = scan.nextInt() ;
		int output = 0 ;
		
		esc : while (true) {
			
		if (input<1500) {
			System.out.println("금액이 부족합니다");
			output = input ;
			 break esc;
		} else {
			System.out.println("커피\t이온\t탄산\t과일\t반환");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <=input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}// for문
			System.out.println();
			System.out.println("선택하세요 >>");
			String drink = scan.next() ;
			
			switch (drink) {
			case "커피":
				output = input - arr[0].getPrice();
				break;
			case "이온":
				output = input - arr[1].getPrice();
				break;
			case "탄산":
				output = input - arr[2].getPrice();
				break;
			case "과일":
				output = input - arr[3].getPrice();
				break;
			case "반환":
				output = input;
				break esc;
			} //switch 괄호
			
			
			
			
		} // else
		input = output ; 
		
		
		} // 큰 while
		System.out.println("잔돈 : " + output);
		
		
		
		
	}
}
