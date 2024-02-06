package abc.pra;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//초기값 설정.
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		
		int[] total = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
		}
		
		// 총점, 평균, 학점 구하기
		for (int i = 0; i < rank.length; i++) {
			
			total[i] = kor[i] + eng[i]+ math[i];
			avg[i] = (int)(total[i]/3.0*10) /10.0 ;
			if (avg[i]>=90) {
				hak[i] = "A학점";
			} else  if (avg[i]>=80) {
				hak[i] = "B학점";
			}else if (avg[i]>=70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
				}
			
	}
		
		// 순위구하기
	for (int i = 0; i < rank.length; i++) {
		for (int j = 0; j < rank.length; j++) {
			if (total[i]==total[j]) continue ;
			if (total[i]<=total[j]) {
				rank[i]++;
			}
		}
		}	
	
		for (int i = 0; i < rank.length; i++) {
			
			System.out.print(name[i]+"\t");
			System.out.print(total[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.print(rank[i]+"\n");
			
		}
			
	
		
		
		
		
		
		
		
	}
}
