package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Ex07 담을 set 컬렉션 만들기
		HashSet<Ex07> set1 = new HashSet<Ex07>();

		esc: while (true) {
			System.out.print("이름 입력 : ");
			String name = scan.next();
			System.out.print("국어 점수 : ");
			int kor = scan.nextInt();
			System.out.print("영어 점수 : ");
			int eng = scan.nextInt();
			System.out.print("수학 점수 : ");
			int math = scan.nextInt();

			Ex07 p = new Ex07(name, kor, eng, math);
			set1.add(p);

			while (true) {
				System.out.print("계속하시겠습니까? (y/n)");
				String a = scan.next();
				if (a.equalsIgnoreCase("y")) {
					continue esc;
				} else if (a.equalsIgnoreCase("n")) {
					System.out.println("수고하셨습니다.");
					break esc;
				} else {
					System.out.println("제대로 입력하세요(y/n)");
					continue;
				}
			} // 안 while
		} // 밖 while

		// 순위
		for (Ex07 i : set1) {
			for (Ex07 j : set1) {
				if (i.getSum() < j.getSum()) {
					i.setRank(i.getRank() + 1);
				}
			}
		}
		
		// 정렬 x
			
		// 출력
		for (Ex07 k : set1) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.print(k.getRank() + "\n");
		}

	}
}
