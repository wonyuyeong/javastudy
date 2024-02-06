package com.ict.day11;

// 저장하는 관점 : 변수(1개저장가능) => 배열(여러개 저장 가능하나 같은 자료형) => 클래스(여러개 저장 가능, 자료형 달라도됨)
public class Ex07 {
	
	String name = "" ;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0 ;
	String hak = "" ;
	int rank = 1 ;
	
	public Ex07() {
	
	}
	
	// 생성자는 메서드를 호출할 수 있다.
	public Ex07(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		process();
		
	}


	// 한번에 처리하자
	public void process() {			// 이름 , 국어, 영어, 수학 저장.
		
		sum = kor+eng+math ;
		avg = (int)(sum/3.0*10) /10.0 ;
		if (avg>=90) {
			hak = "A학점";
		}else if (avg >=80) {
			hak = "B학점";
		}else if (avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		
	}
	
	
	
	
}
