package com.ict.day11;

public class Ex03 {
	private boolean live  ;
	private int age  ;
	private String name ;
	
	public Ex03() {
		name = "큰뿔소";
		age = 3 ;
		live = true ;
	}
	

	// boolean 형은 get 대신 is 로 만든다.
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	

	
	
	
	
	
}