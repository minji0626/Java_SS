package kr.s32.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.util.DBUtil;

public class DeleteMain {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행문 1,2 단계
			conn= DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM test2 WHERE id=?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터를 바인딩한다.
			pstmt.setString(1,"star");// ?안에 star 내용이 입력되면서, ID값이 star인 행을 삭제하게 된다.
			
			//JDBC 수행 4단계 : SQL문을 테이블에 반영해서 행을 삭제한다.
			int count = pstmt.executeUpdate();
			
			System.out.println(count + "개 행을 삭제했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

}
