package kr.s33.jdbc.preparedstatement;

import java.sql.*;

import kr.util.DBUtil;

public class SelectListMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM test3 ORDER BY num DESC";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t작성자\t등록일\t\t제목");
			while(rs.next()) {
				System.out.print(rs.getInt("num"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.print(rs.getDate("reg_date"));
				System.out.print("\t");
				System.out.println(rs.getString("title"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//자원 정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}

}
