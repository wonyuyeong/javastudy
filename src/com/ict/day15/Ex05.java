package com.ict.day15;

public class Ex05 {
	public static void main(String[] args) {
		// 배열 6자리 채우기 (중복 안됨)
		int[] arr = new int[6] ;
		
		for (int i = 0; i < 6; i++) {
			int su = (int)(Math.random()*10) ;
			arr[i] = su ;
			for (int j = 0; j < i; j++) {
				if (arr[j]==su) {
					i-- ;
					break ;
				}  
			}
		}
		// 배열출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
	}
}
