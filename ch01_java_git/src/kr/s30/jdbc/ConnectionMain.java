package kr.s30.jdbc;

import java.sql.*;

public class ConnectionMain {

	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";
		
		try {	
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			//JDBC 수행 2단계 : connection  객체 생성 (오라클 접속을 위한 인증)
			Connection conn = DriverManager.getConnection(db_url,db_id,db_password);
			System.out.println("Connection 객체가 생성되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
