package com.ict.day11;

public class Ex06 {
	private String name = "";
	private int price = 0 ;
	
	
	public Ex06(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	

	//getter/setter
	// 변수의 접근제한자 private 이므로 외부에서는 접근불가하다.
	// 내부에서는 접근 가능하다는 부분을 이용해서
	// 메서드를 만들어 접근해서 데이터를 삽입하거나 가져올 수 있다.
	
	
	

	public void sName(String k) {
		name = k ;
	}
	
	public void sPrice(int k) {
		price = k ;
	}
	
	public String gName() {
		return name ;
	}
	
	public int gPrice() {
		return price ;
	}

	
	
	
	
	
	
	
}
