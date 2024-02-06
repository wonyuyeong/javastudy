package com.ict.day07;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = {"", "", "", "", ""};
		int[] kor = {0, 0, 0, 0, 0};
		int[] eng = {0, 0, 0, 0, 0};
		int[] math = {0, 0, 0, 0, 0};
		
		int[] sum = {0, 0, 0, 0, 0};
		// 소수점 첫째짜리 까지 구하자
		double[] avg = {0.0, 0.0, 0.0, 0.0, 0.0};
		String[] hak = {"", "", "", "", ""};
		int[] rank = {1, 1, 1, 1, 1};
		
		
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름 입력 : ");
			name[i] = scan.next();
			
			System.out.print("국어 점수 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 점수 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 점수 : ");
			math[i] = scan.nextInt();
		System.out.println();
		// 총점, 평균, 학점 구하자
			sum[i] = kor[i]+eng[i]+math[i];
			avg[i] =(int) (sum[i] / 3.0*10) /10.0 ;
			if (avg[i]>=90) {
				hak[i] =  "A학점";
			}else if (avg[i]>=80) {
				hak[i] = "B학점";
			}else if (avg[i]>70) {
				hak[i]= "C학점";
			}else {
				hak[i] = "F학점";
			}
		
		}	
		// 순위는 구하자 (값이 다 채워진 상태에서 구해야함)
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i]==sum[j])  continue;
				if (sum[i] <sum[j]) {
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < rank.length; i++) {
			System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.print(rank[i]+ "\n");
	}		
		
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}
}
