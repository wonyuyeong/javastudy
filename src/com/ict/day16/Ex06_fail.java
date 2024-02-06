package com.ict.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex06_fail {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성

		// 나라입력하면 수도 출력되게하기
		// 계속할까요 YN
		// 없는나라 입력시 데이터에 없는 나라

		Scanner scan = new Scanner(System.in);

		Map<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		esc: while (true) {

			System.out.print("나라를 입력하세요 : ");
			String name = scan.next();
				
				if (map.containsKey(name)) {
					System.out.println( name+"의 수도는 " + map.get(name) + "입니다.");
					break ;
				}else if(! map.containsKey(name)){
					System.out.println("데이터가 없는 나라입니다.");
					continue ;
				}
						
			while (true) {
				System.out.println("계속 하시겠습니까? (y/n)");
				String res = scan.next();
				if (res.equalsIgnoreCase("y")) {
					continue esc;
				} else if (res.equalsIgnoreCase("n")) {
					break esc;
				}
			} // 작은 while

		} // while
		 System.out.println("수고하셨습니다.");
		}
}

