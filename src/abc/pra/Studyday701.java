package abc.pra;

import java.util.Scanner;

public class Studyday701 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		esc : while (true) {
			
		System.out.println("숫자 입력 : ");
		String su = scan.next() ;
		
		// String 으로 받은거 int로 변환하기.
		int s1 = Integer.parseInt(su) ;
		String res = "" ;
		if (s1%2==0) {
			res = "짝수";
		}else {
			res = "홀수" ;
		}
		System.out.println(su + "는"+res+"입니다.");
		
		while (true) {
			
		System.out.println("계속 할까요? y/n");
		String msg = scan.next() ;
		
		if (msg.equalsIgnoreCase("y")) {
			continue esc ;
		} 
		if (msg.equalsIgnoreCase("n")) {
			break  esc;
		}
			System.out.println("제대로 입력하세요");
		}
		
		}
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		
	}
}
