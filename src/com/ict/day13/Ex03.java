package com.ict.day13;

// 인터페이스 상속
// 1. 일반클래스가 상속을 받으면 반드시 오버라이딩 해야한다.
class Ex03 implements Ex02{
	@Override
	public void sound() {
	}

	@Override
	public void play() {
	}
}

//2. 추상 클래스가 상속을 받으면 오버라이딩 할 필요 없음
abstract class Ex04 implements Ex02{
	
}


//3. 인터페이스가 상속을 받으면 오버라이딩 할 필요 없음
interface Ex05 extends Ex02{
	
}







