package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>() ;
		for (int i = 0; i < 6; i++) {
			int su = (int)(Math.random()*10) ;
//			if (set1.add(su)) {
//				continue ;
//			} else {
//				i-- ;
//			}
			if (! set1.add(su)) {			// 앞에 ! 붙이면 거짓->참, 참->거짓됨
				i-- ;
			}
			
			
		}
		System.out.println(set1);
		
		
		
	}
}
