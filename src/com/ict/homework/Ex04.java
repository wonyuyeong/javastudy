package com.ict.homework;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {

		public static void main(String[] args) {
			Random ran = new Random();
			Scanner scan = new Scanner(System.in);

			int[] com = new int[3]; // 컴퓨터 랜덤
			int[] play = new int[3]; // 사용자 플레이
			int count = 0; // 몇회했나
			int strike = 0; // 스트라이크
			int ball = 0;// 볼
			int out = 0;

			// 같은 난수 나오지 않게 중복값제거
			com[0] = ran.nextInt(10);

			do {
				com[1] = ran.nextInt(10);
			} while (com[1] == com[0]); // arr[1]이 arr[0]과 다르도록 보장

			do {
				com[2] = ran.nextInt(10);
			} while (com[2] == com[0] || com[2] == com[1]);

			// 컴퓨터 숫자 미리보기
			System.out.println("com: " + com[0] + " " + com[1] + " " + com[2]);
			for (int m = 0; m < 10; m++) {

				// 정보받기
				System.out.println(m + 1 + "회차 ");
				System.out.print("세 자리 숫자를 입력하세요 >> ");
				String strNum = scan.next();

				if (strNum.length() != 3) {
					System.out.println("수의 개수가 많거나 적습니다");
					m--;
					continue;

				}

				int num = Integer.parseInt(strNum);
				play[0] = num / 100;
				play[1] = num % 100 / 10;
				play[2] = num % 10;

				if (play[0] == play[1] || play[1] == play[2] || play[0] == play[2]) {
					System.out.println("똑같은 입력이 있습니다.");
					m--;
					continue;
				}

				count++;
				// 스트라이크 볼 횟수 체크
				for (int i = 0; i < com.length; i++) {
					for (int j = 0; j < play.length; j++) {
						if (com[i] == play[j]) {
							if (i == j) {
								strike++;
							} else {
								ball++;
							}
						}
					}
				}

				// 결과
				if (strike == 3) {
					System.out.println("!!!!!홈런입니다!!!!!.");
					break;
				}

				else if (strike == 0 && ball == 0) {
					out++;
					System.out.println("Out입니다.");
					System.out.println("---------------------------------------------");
				}

				else {
					System.out.println("Strike: " + strike + "\n" + "Ball : " + ball);
					System.out.println("---------------------------------------------");
					strike = 0;
					ball = 0;
				}

				if (out == 3) {
					System.out.println("3아웃");
					break;
				}

			} // m for문 끝

			// 정리
			System.out.println((count) + "회 플레이하셨습니다.");
			System.out.println("종료합니다.");
			System.out.println("정답:  " + com[0] + " " + com[1] + " " + com[2]);
		}
	}

