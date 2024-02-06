package com.ict.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> booklist = new ArrayList<>() ;
		
		booklist.add(new Book("자바", 25000)) ;
		booklist.add(new Book("파이썬", 15000)) ;
		booklist.add(new Book("안드로이드", 30000)) ;
	
		// 스트림 생성 후 출력
		
		// 모든 책의 가격의 합
		Stream<Book> book = booklist.stream() ;
		int sum =booklist.stream().mapToInt(i->i.getPrice()).sum() ;
		System.out.println("가격의 합 : "+sum);
		
		// 책의 가격이 20000원 이상인 책의 이름 정렬후 출력
		book= booklist.stream() ;
		book.filter(i->i.getPrice()>=20000).map(i->i.getName()).sorted().forEach(i->System.out.println("책 가격 20000원 이상 : "+i));
		
		
		
		
		
	}
}
