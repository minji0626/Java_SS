package kr.s31.jdbcstatement;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {

	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "user01";
		String db_password = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : Driver load
			Class.forName(db_driver);
			//JDBC 수행 2단계 : Connection 객체 생성
			conn = DriverManager.getConnection(db_url, db_id, db_password);
			//SQL 문 작성
			sql = "SELECT * FROM test1";
			//JDBC 수행 3단계 :Statement 객체 생성
			stmt = conn.createStatement();
			//JDBC 수행 4단계: SQL문을 실행해서 테이블로부터 레코드(행)을 전달받아서 결과 집합을 만들고 RESULT SET객체에 담아서 반환
			rs = stmt.executeQuery(sql);
			
			System.out.println("ID\t나이");
			//ResultSet에 보관된 결과 집합에 접근하여 행 단위로 데이터 추출
			while(rs.next()) {
				//컬럼명을 통해서 데이터 반환
				/*
				System.out.print(rs.getString("id"));
				System.out.print("\t");
				System.out.println(rs.getInt("age"));
				*/
				//컬럼 인덱스를 통해서 데이터를 반환
				System.out.print(rs.getString(1));
				System.out.print("\t");
				System.out.println(rs.getInt(2));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs != null) try {rs.close();} catch(SQLException e) {}
			if (stmt != null) try {stmt.close();} catch(SQLException e) {}
		}
	}

}
