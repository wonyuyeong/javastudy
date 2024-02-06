package com.ict.pra;

public class Ex01 {
	
	String name = "" ;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0 ;
	String hak = "" ;
	int rank = 1 ;
	
	public Ex01(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		process() ;
	}
	
	public void process() {
		sum = kor+eng+math ;
		avg = (int)((sum/3.0*10)/10.0) ;
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
