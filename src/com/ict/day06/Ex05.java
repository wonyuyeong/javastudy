package com.ict.day06;

public class Ex05 {
	public static void main(String[] args) {
		// continue와 continue label
		// continue : continue 이하 수행문을 포기하고 해당 for문의 증감식으로 이동(for문)
		// continue label : continue 이하 수행문을 포기하고 증감식으로 이동(for문)
		// 단순 for문에서는 label 쓸 필요 없음.
		
		
		// 1~10 출력 
			for (int i = 1; i < 11; i++) {
				System.out.print(i+" ");
			}
		System.out.println();
		
		//단순 for문 continue
		for (int i = 1; i < 11; i++) {
			if (i==6) continue ;
			System.out.print(i+" ");
		}
		System.out.println();
		
		//단순 for문 continue label
		esc:for (int i = 1; i < 11; i++) {
			if (i==6) continue esc;
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("다중 for문에서 continue label 사용");
			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					System.out.println("i= "+i+", j= "+j);
				}
			}
			System.out.println();
			
			// 다중 for문 continue 사용
			for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if (i==2) continue;
					System.out.println("i= "+i+", j= "+j);
				}
			}
			System.out.println();
			
			// 다중 for문 continue label 사용 
			aaa: for (int i = 1; i < 4; i++) {
				for (int j = 1; j < 6; j++) {
					if (i==2) continue aaa;
					System.out.println("i= "+i+", j= "+j);
				}
			}
			// (continue와 결과값은 같지만 실행횟수는 더 적다)
			System.out.println();
		
		
		
		
		
		
	}
}
