package kr.s31.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteMain {

	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";
		
		/*
		 * CRUD 작업
		 * C Create (생성) ---> INSERT 문
		 * R Read (읽기) -----> SELECT 문
		 * U Update (갱신) --> UPDATE 문 
		 * D Delete (삭제) ---> DELETE 문
		 */
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : Driver load
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체 생성
			conn = DriverManager.getConnection(db_url, db_id, db_password);
			//SQL문 작성
			sql = "DELETE FROM test1 WHERE id='SKY'";
			//JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			//JDBC 수행 4단계 : SQL 문을 실행해서 테이블에서 행을 삭제한 후 삭제한
			//						행의 개수 반환
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "개 행을 삭제했습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (conn != null) try {conn.close();} catch(SQLException e) {}
			if (stmt != null) try {stmt.close();} catch(SQLException e) {}
		}
	}

}
