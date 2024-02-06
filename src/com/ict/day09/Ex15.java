package com.ict.day09;

public class Ex15 {
	
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	// 반환형이 있는 메서드
	public String play01(String k1) {
		name = k1 ;
		return name ;
	} 

	public int play02(int kor, int eng, int math) {
		int total = kor+eng+math ;								// 그냥 지역변수에 넣었으므로 저장x, 이 메서드 안에서만 쓸수 있다
		return total ;
	}
	public int play03(int kor, int eng, int math) {
		sum = kor + eng +math ;									// 전역변수 sum에 저장0, 
		return sum ;
	}
	
	
	
	
}
