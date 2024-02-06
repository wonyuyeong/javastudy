package abc.pra;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String res = "";
		double win = 0;
		int count = 0;
		
		esc : while (true) {
			System.out.print("무엇을 내실건가요?(0=가위, 1=바위, 2=보)>>");
	
			int play = scan.nextInt();
			int com = (int) (Math.random() * 3);
			if (play<0 || play>2) {
				System.out.println("다시 입력해주세요.");
				continue ;
			}
			if (play == com) {
				res = "무승부";
				System.out.println("com: 무승부");
			} else if (com == 0) {
				System.out.println("com: 가위");
				if (play == 2) {
					res = "패배";
				} else if (play == 1) {
					res = "승리";
					win++;
				}
			} else if (com == 1) {
				System.out.println("com: 바위");
				if (play == 2) {
					res = "승리";
					win++;
				} else if (play == 0) {
					res = "패배";
				}
			} else if (com == 2) {
				System.out.println("com: 보");
				if (play == 1) {
					res = "패배";
				} else if (play == 0) {
					res = "승리";
					win++;
				}
			}
			count++;
				
			System.out.println(res);
			System.out.print("계속하시겠습니까? (y/n)");

			while (true) {
				String a = scan.next();
				
			if (a.equals("y")) {
				break ;
			} else if (a.equals("n")) {
				System.out.println("플레이 횟수: " + count);
				System.out.println("승률: " + (int)(win * 1.0 / count * 1000)/10.0+"%");	
				 break esc;
			}else {
				System.out.println("다시입력해주세요. (y/n)"); continue ;
			}
			}
		}
	}
}
