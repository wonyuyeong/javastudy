package abc.pra;

import java.util.Random;
import java.util.Scanner;

public class baseball_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int[] com = new int[3]; // 컴퓨터 랜덤
		int[] play = new int[3]; // 사용자 플레이
		int count = 0; // 몇회했나
		int strike = 0; // 스트라이크
		int ball = 0; // 볼
		int out = 0; // 아웃

		// 같은 난수 나오지 않게 중복값제거
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(9) + 1;
			for (int m = 0; m < i; m++) {
				if (com[i] == com[m]) {
					i--;
				}
			}
		}
		
		// 컴퓨터 값
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();

		for (int m = 0; m < 10; m++) {
			// 사용자 입력 받기 // +한꺼번에 입력 받기
			System.out.print("세 자리 숫자를 입력하세요 >> ");
			int num = scan.nextInt(); 
			play[0] = num / 100;
			play[1] = num % 100 / 10;
			play[2] = num % 10;
			 

			// 똑같은 입력값있을때 횟수 차감 안되게? 어떻게?
			if (play[0] == play[1] || play[1] == play[2] || play[0] == play[2]) {
				System.out.println("똑같은 입력이 있습니다.");
				m--;
				continue;
			}

			// 자릿수가 안 맞으면 다시
			if (play[0] >= 10 || play[0] == 0) {
				System.out.println("수의 개수가 많거나 적습니다");
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
			if(strike==3) {
				System.out.println("!!!!!홈런입니다!!!!!."); 
				break;
			}else if(strike ==0&&ball==0){
				System.out.println("Out입니다.");
				System.out.println("---------------------------------------------");
			}else {
				System.out.println("Strike: " + strike +"\n" + "Ball : " + ball );
				System.out.println("---------------------------------------------");
				strike = 0;
				ball=0;
			}

		}
		System.out.println(count + "회 플레이하셨습니다.");
		System.out.println("종료합니다.");
	}

}

