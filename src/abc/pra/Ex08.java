package abc.pra;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//k1이 홀수 짝수 인지 판별
		// 자료형 변수 = (조건식) ? 참 일 때 실행할 문장 : 거짓일때 실행할 문장 ;
		System.out.print("k1은 : ");
		int k1 = scan.nextInt();
		
		String result = (k1%2==0) ? "짝수" : "홀수" ;
		
		System.out.println("k1은 : " + result + "입니다.");
		
		System.out.println();
		// 받은 점수가 60점 이상이면 합격 아니면 불합격
		
		System.out.print("받은 점수 : ");
		int k2 = scan.nextInt();
		
		String result2 = (k2>=60)? "합격" : "불합격";
		
		System.out.println(result2);

	}
}
