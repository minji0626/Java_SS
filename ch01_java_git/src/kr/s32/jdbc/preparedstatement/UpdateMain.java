package kr.s32.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.util.DBUtil;


public class UpdateMain {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			//JDBC 수행문 1,2 단계
			conn= DBUtil.getConnection();
			//SQL문 작성
			sql = "UPDATE test2 SET name=?, age=? WHERE id=?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터를 바인딩한다
			pstmt.setString(1, "강호동"); // 1번의 물음표 NAME에 해당 => 바꿀 이름 입력
			pstmt.setInt(2, 40);			  // 2번의 물음표 AGE에 해당 => 바꿀 나이 입력
			pstmt.setString(3, "sky");  // 3번의 물음표 ID에 해당 => 위치 지정
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블의 데이터를 수정한다.
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 정보를 수정했습니다.");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

}
