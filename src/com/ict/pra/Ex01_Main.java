package com.ict.pra;

import java.util.Scanner;

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("학생 수  : ");
		int su = scan.nextInt() ;
		
		Ex01[] arr = new Ex01[su] ;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름 : ");
			String name  = scan.next() ;
			System.out.println("국어 점수 : ");
			int kor = scan.nextInt() ;
			System.out.println("영어 점수 : ");
			int eng = scan.nextInt() ;
			System.out.println("수학 점수 : ");
			int math = scan.nextInt() ;
			
			Ex01 p = new Ex01(name, kor, eng, math) ;
			
			arr[i] = p ;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].name);
			System.out.println(arr[i].sum);
			System.out.println(arr[i].avg);
			System.out.println(arr[i].hak);
		}
		
	}
}