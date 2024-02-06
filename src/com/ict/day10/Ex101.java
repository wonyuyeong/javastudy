package com.ict.day10;

import java.util.Scanner;

public class Ex101 {
	public static void main(String[] args) {
		// 게터세터
		// 디스
		// get/set getter/setter
		// 변수의 접근제한자가 private임으로 외부에서는
		// 접근불가하다/
		// 내부에서는 접근가능하다는 부분을 이용해서 메서드를
		// 만들어서 접근해서 값을 데이터를 삽입하거나 가져올 수 있다.
		//

		Ex09 coffee = new Ex09();
		coffee.sName("커피음료");
		coffee.sPrice(1500);

		Ex09 ion = new Ex09();
		ion.sName("이온음료");
		ion.sPrice(2300);

		Ex09 cola = new Ex09();
		cola.sName("탄산음료");
		cola.sPrice(2000);

		Ex09 juice = new Ex09();
		juice.sName("과일음료");
		juice.sPrice(1800);

		Ex09[] arr = { coffee, ion, cola, juice };

		Scanner scan = new Scanner(System.in);

		System.out.println("금액을 투입하세요");
		int input = scan.nextInt();
		int output = input;

		
		esc :while (true) {

			if (output < 1500 ) {
				System.out.println("금액이 부족합니다.");
				System.out.println("금액은 자동으로 반환됩니다.");
				System.out.println("잔돈 : " + output); break ;
			} else {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				// 각 음료수의 가격을 가져와서 비교하자
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].gPrice() <= output) {
						System.out.print("O\t");
					} else {
						System.out.print("X\t");
					}
				}
				System.out.println();
				System.out.println("선택하세요 >> ");
				String drink = scan.next();

				switch (drink) {
				case "커피":
					output = output - (arr[0].gPrice());
					break;
				case "이온":
					output = output - (arr[1].gPrice());
					break;
				case "탄산":
					output = output - (arr[2].gPrice());
					break;
				case "과일":
					output = output - (arr[3].gPrice());
					break;
				case "반환":
				
					System.out.println("잔돈은 : " + output);
					break esc;
				}
				System.out.println("잔돈은 : " + output);
			}

		} // while

	}// main
}