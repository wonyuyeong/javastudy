package abc.pra;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 학생 수
		System.out.print("학생 수  : ");
		int su = scan.nextInt();
		double[][] arr = new double[su][8] ;
		
		for (int i = 0; i < arr.length; i++) {
			double[] p = new double[8] ;
			
			System.out.print("번호 : ");
			p[0] = scan.nextInt() ;
			
			System.out.print("국어 : ");
			p[1] = scan.nextInt();
			
			System.out.print("영어 : ");
			p[2] = scan.nextInt();
			
			System.out.print("수학 : ");
			p[3] = scan.nextInt();
			
			p[4] = p[1] + p[2] + p[3] ;			//총점
			
			p[5] = (int)(p[4] / 3.0*10) / 10.0 ;		//평균

			//학점
			if (p[5]>=90) {
				p[6] = 'A' ;
			}else if (p[5]>=80) {
				p[6] = 'B' ;
			}else if (p[5]>=70) {
				p[6] = 'C' ;
			}else {
				p[6] = 'F' ;
			}
	
			// 순위 초기값 넣어주기
			p[7] = 1;
			
			// 다차원 배열에 넣기
			arr[i] = p ;
			
		}		
			
		// 순위
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][4] < arr[j][4]) {
						arr[i][7]++ ;
					}
				
				}
			}
		// 정렬
		// 임시 저장할 배열 만들기	
		double[] tmp = new double[8] ;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][7]>arr[i][7]) {
					tmp = arr[i] ;
					arr[i] = arr[j];
					arr[j] = tmp ;
				}
			}
		}
		       
		       
		       
		       
		//출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					//국영수 출력에서 제외
					if (j==1 || j==2 || j==3) continue ;
					
					// 평균
					if (j==5) {
						System.out.print(arr[i][j]+"\t");
					// 학점
					} else if(j==6){
						System.out.print((char)(arr[i][j])+"\t");
					// 나머지 int
					}else {
						System.out.print((int)arr[i][j]+"\t");
					}
				}
		
		System.out.println();
	}
		
		
		
		
	}
}
