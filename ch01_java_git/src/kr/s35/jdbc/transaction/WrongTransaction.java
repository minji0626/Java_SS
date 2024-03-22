package kr.s35.jdbc.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.util.DBUtil;

public class WrongTransaction {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt1 =null;
		PreparedStatement pstmt2 =null;
		PreparedStatement pstmt3 =null;
		String sql = null;
		
		try {
			// 기본 트랜잭션 처리가 오토커밋으로 설정되어 있기 때문에
			//복수의 SQL문을 실행할 경우 정상적으로 트랜잭션 처리가
			// 되지 않을 수 있다.
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			sql = "INSERT INTO test1 VALUES('SMITH',10)";
			pstmt1 = conn.prepareStatement(sql);
			pstmt1.executeUpdate();
			
			sql = "INSERT INTO test1 VALUES ('PETER',20)";
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.executeUpdate();
			//테스트용으로 잘못된 SQL문 작성
			sql = "INSERT INTO test1 VALUES('JOHN',30";
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.executeUpdate();
			
			System.out.println("작업 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt3, null);
			DBUtil.executeClose(null, pstmt2, null);
			DBUtil.executeClose(null, pstmt1, conn);
		}
	}

}
