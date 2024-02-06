package abc.pra;

import java.util.Scanner;

public class Study02 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String res = "";
	int win = 0;
	int count = 0;
	while (true) {
		
	System.out.println("무엇을 내실래요? 0. 가위 1. 바위 2. 보");
	int play = scan.nextInt() ;
	int com = (int)(Math.random() *3) ;
	if (play==com) {
		res = "무승부";
		System.out.println("무승부입니다.");
	}
	if (com==0) {
		System.out.println("컴퓨터는 가위를 냈습니다.");
		if (play==1) {
			res = "패배";
		}
		if (play==2) {
			res = "승리";
			win++ ;
		}
	}
	if (com==1) {
		System.out.println("컴퓨터는 바위를 냈습니다.");
		if (play==0) {
			res = "패배";
		}
		if (play==2) {
			res = "승리";
			win++ ;
		}	
	}
	if (com==2) {
		System.out.println("컴퓨터는 보를 냈습니다.");
		if (play==0) {
			res = "승리";
			win++ ;
		}
		if (play==1) {
			res = "패배";
		}
	}
	count++;
	System.out.println("결과는 : "+res+"입니다.");
	System.out.println("계속 하시겠습니까? (y/n)");
	
	String a = scan.next();
	if (a.equals("y")) {
		continue ;
	}else if (a.equals("n")) {
		System.out.println("플레이 횟수 : "+count);
		System.out.println("승률 : "+(win*1.0/count*100));
		break ;
	}
	
	
	
	
	
	}
	
	
	
}
}
