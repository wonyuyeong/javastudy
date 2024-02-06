package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		// 자바를 오라클에 접속 할 수 있도록 도와주는 클래스
		Connection conn = null ;
		// sql 구분 작성
		Statement stmt = null ;
		// 결과를 받은 클래스 (select일떄)
		ResultSet rs = null ;
		
		try {
			// jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver") ;
			// 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe" ;
			String user = "c##ictedu" ;
			String password = "1111" ;
			// 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password) ;
			// sql 작성
			// String sql = "select * from book" ;
			String sql = "select * from book where bookname like '축구%' " ;
			
			// sql 을 보내기 위해서 구문을 만든다.
			stmt = conn.createStatement() ;
			// 보내서 결과받기
			rs = stmt.executeQuery(sql) ;
			
			while (rs.next()) {
				System.out.print(rs.getInt("BOOKID")+"\t");
				System.out.print(rs.getString("BOOKNAME")+"\t");
				System.out.print(rs.getString("PUBLISHER")+"\t");
				System.out.print(rs.getInt("PRICE")+"\n");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
	}
}
