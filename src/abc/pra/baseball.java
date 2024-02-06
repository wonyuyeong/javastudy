package abc.pra;

import java.util.Random;
import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int[] com = new int[3]; // 컴퓨터 랜덤
		int[] play = new int[3]; // 사용자 플레이
		int count = 0; // 몇회했나
		int strike = 0; // 스트라이크
		int ball = 0;// 볼
		int out = 0; // 아웃한 횟수

		// 같은 난수 나오지 않게 중복값제거
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(9) + 1;
			for (int m = 0; m < i; m++) {
				if (com[i] == com[m]) {
					i--;
				}
			}
		}

		for (int m = 0; m < 10; m++) {
			System.out.println(m + 1 + "회차 ");
			// 사용자 입력 받기
			for (int i = 0; i < com.length; i++) {

				while (true) {
					System.out.print((i + 1) + "번째 숫자를 입력하세요 >> ");
					play[i] = scan.nextInt();
					count++;

					if (play[i] > 10) {
						System.out.println("숫자 한개만 입력하세요.");
					} else {
						break;
					}
				}

			}

			if (play[0] == play[1] || play[1] == play[2] || play[0] == play[2]) {
				System.out.println("똑같은 입력이 있습니다.");
				m--;
				count--;
				count--;
				count--;
				continue;
			}

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
			if (strike == 3) {
				System.out.println("!!!!!홈런입니다!!!!!.");
				break;
			} else if (strike == 0 && ball == 0) {
				out++;
				System.out.println("Out입니다.");
				System.out.println("---------------------------------------------");
				if (out >= 3) {
					System.out.println("쓰리아웃입니다.");
					break;
				}
			} else {
				System.out.println("Strike: " + strike + "\n" + "Ball : " + ball);
				System.out.println("---------------------------------------------");
				strike = 0;
				ball = 0;
			}

		}
		System.out.println((count / 3) + "회 플레이하셨습니다.");
		System.out.println("종료합니다.");
		System.out.println("정답:  " + com[0] + " " + com[1] + " " + com[2]);
	}

}
