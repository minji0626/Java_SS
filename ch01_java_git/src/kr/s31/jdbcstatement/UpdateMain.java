package kr.s31.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMain {

	public static void main(String[] args) {

		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : Driver load
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체 생성
			conn = DriverManager.getConnection(db_url,db_id, db_password);
			// SQL문 작성
			sql = "UPDATE test1 SET age =90 WHERE id='SKY'";
			stmt = conn.createStatement();
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블의 행을 수정하고
			//					    수정한 행의 개수를 반환 
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {// 자원 정리
			if (conn != null) try {conn.close();} catch(SQLException e) {}
			if (stmt != null) try {stmt.close();} catch(SQLException e) {}
		}
	}

}
