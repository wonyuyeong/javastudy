package com.ict.day11;

public class Ex14 {
	public static void main(String[] args) {
		// 객체 생성과 상관없이 호출 가능
		System.out.println(Ex13.num);
		System.out.println(Ex13.play2());
		
		// static private 는 접근 못함
		// System.out.println(Ex13.age);
		
		//static은 static 메모리에 저장됨
		Ex13 t1 = new Ex13() ;
		System.out.println(t1.su);				//11
		System.out.println(t1.num);			//11	
		System.out.println(Ex13.num);		//11
		
		Ex13 t2 = new Ex13() ;
		System.out.println(t2.su);				//11
		System.out.println(t2.num);			//12
		System.out.println(Ex13.num);		//12
		Ex13 t3 = new Ex13() ;
		
		System.out.println(t3.su);				//11
		System.out.println(t3.num);			//13
		System.out.println(Ex13.num);		//13
		
		
		
		
		
		
		
		
	}
}
