package abc.pra;

import java.util.Scanner;

public class Study04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String pans = "";
		String cans = "";
		int count = 0;
		int win = 0;
		int lose = 0;
        int same = 0;

		esc: while (true) {
			System.out.print("무엇을 내실건가요?" + "\n" + "(가위, 바위, 보)");
			String player = scan.next();
			int play = 0;
			int com = (int) (Math.random() * 3 + 1); // 1, 2, 3

			switch (player) {
			case "가위":
				play = 1;
				break;
			case "바위":
				play = 2;
				break;
			case "보":
				play = 3;
				break;
			default:
				System.out.println("다시 입력해주세요.");
				continue esc;
			}

			if (com == 1) {
				cans = "가위";
			} else if (com == 2) {
				cans = "바위";
			} else if (com == 3) {
				cans = "보";
			}

			int result = play - com;

			System.out.println("나: " + pans + "| 컴퓨터: " + cans);

			if (result == -2 || result == 1) {
				System.out.println("-------------------");
				System.out.println("   player win");
				System.out.println("-------------------");
				win++;
				count++;
			} else if (result == 2 || result == -1) {
				System.out.println("-------------------");
				System.out.println("   player lose");
				System.out.println("-------------------");
				count++;
				lose++;
			} else if (result == 0) {
				System.out.println("-------------------");
				System.out.println("        draw");
				System.out.println("-------------------");
				count++;
				same++;
			} else if (play != 1 && play != 2 && play != 3) {
				System.out.println("다시 입력주세요");
			}

			System.out.print("계속하시겠습니까? (네/아니오)");

			while (true) {
				String a = scan.next();
				if (a.equals("네")) {
					System.out.println();
					break;
				} else if (a.equals("아니오")) {
					double avg = ((int) (win * 1.0 / count * 1000) / 10.0);
					System.out.println("플레이 횟수: " + count+ "번");
					System.out.println("승리 횟수 : " + win+ "번");
					System.out.println("패배 횟수 : " + lose + "번");
                    System.out.println("비긴 횟수 : " + same + "번");
					System.out.println("승률: " + avg + "%");

					break esc;
				} else {
					System.out.println("다시입력해주세요 \n 계속하시겠습니까? (네/아니오)");
					continue;
				}
			}
		}
	}// main
}
