package kr.s31.jdbcstatement;
import java.sql.*;
public class DropTableMain {

	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체 생성 (오라클 접속을 위한 인증)
			conn = DriverManager.getConnection(db_url, db_id, db_password);
			
			System.out.println("test1 테이블을 삭제합니다.");
			
			sql = "DROP TABLE test1";
			//JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			//JDBC 수행 4단계 : SQL문을 수행해서 테이블에 정보를 변경하는 작업 수행
			stmt.executeUpdate(sql);
			System.out.println("테이블 삭제를 완료하였습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (stmt != null) try {stmt.close();} catch(SQLException e) { }
			if (conn != null) try {conn.close();} catch(SQLException e) { } 
			}
	}

}
