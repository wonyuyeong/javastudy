package com.ict.day13;

public class Ex11_Guitar {
	public void like(String str) {
		System.out.println(str+"like~~");
	}
	public void sound(String str) {
		System.out.println(str+"sound~~");		
	}
}

class Ex11_BassGuitar extends Ex11_Guitar implements Ex11_Ibehavior{

	@Override
	public void play() {
		System.out.println("기타 연주 시작~");
	}
	
}