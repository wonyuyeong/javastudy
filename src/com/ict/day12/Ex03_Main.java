package com.ict.day12;

public class Ex03_Main {
	public static void main(String[] args) {
		// 자식클래스를 객체 생성 하면 부모 클래스가 먼저 생성된다.		
		Ex03_Sub t1 = new Ex03_Sub() ;
	//		부모						자식
		Ex03_Sup t2 = new Ex03_Sub() ;		//Ex03_Sub is a Ex03_Sup
		
	//		자식						부모			=> 컴파일 오류	
//		Ex03_Sub t3 = new Ex03_Sup() ;		
		
		
		
		
		
		
		
		
	}
}
