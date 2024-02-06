package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		// 삭제하기
		Scanner scan = new Scanner(System.in) ;
		System.out.print("삭제할 번호  : ");
		int custid = scan.nextInt() ;
		
		Connection conn = null ;
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		int result = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver") ;
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe" ;
			String user = "c##ictedu" ;
			String password = "1111" ;
			
			conn = DriverManager.getConnection(url, user, password) ;
			
			String sql = "delete from customer where custid = ? " ;
			
			pstmt = conn.prepareStatement(sql) ;
			
			pstmt.setInt(1, custid);

			
			result = pstmt.executeUpdate() ;
			
			if (result>0) {
				System.out.println("삭제 성공");
				sql = "select * from customer" ;
				pstmt = conn.prepareStatement(sql) ;
				rs = pstmt.executeQuery() ;
				
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}else {
				System.out.println("삭제 실패");
			}
		
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				scan.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
