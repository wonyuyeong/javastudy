package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		//3989초는 몇 시간 몇 분 몇 초 일까요?

		int total = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0;  //나머지
		//시간을 구하자
		h= total/(60*60);
		res= total%(60*60);
		
		m=res/60;
		s=res%(60) ;
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		System.out.println(h+"시간"+m+"분"+s+"초");
		
		

			
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		



	
		
		
		
		
		
	}
}
