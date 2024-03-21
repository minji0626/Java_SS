package kr.s32.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.util.DBUtil;

public class InsertMain {
	public static void main(String[] args) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = null;
			
			try {
				//JDBC 수행문 1, 2단계
				conn = DBUtil.getConnection();
				//SQL문 작성						1번? 2번?   3번?  4번SYSDATE(데이터 삽입 날짜 및 시간)  => 자리 잡기
				sql = "INSERT INTO test2 (id, name, age, reg_date) VALUES(?,?,?,SYSDATE)";
				//JDBC 수행 3단계 : PreparedStatement 객체 생성
				pstmt = conn.prepareStatement(sql);
				// ? 에 데이터를 바인딩 
				pstmt.setString(1, "she'g"); // SQL문의 1번 물음표에 "star" 데이터를 삽입
				pstmt.setString(2, "김연아"); // SQL문의 2번 물음표에 "홍길동" 데이터를 삽입
				pstmt.setInt(3, 30); //SQL문의 3번 물음표에 20 데이터를 삽입
				
				//JDBC 수행 4단계 : SQL문을 실행해서 테이블에 행을 추가한다.
				int count = pstmt.executeUpdate(); // 이미 위에서 SQL을 전달했기 때문에 여기서는 SQL을 전달하면 안 된다.
				
				System.out.println(count + "개 행을 추가했습니다.");
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				//자원 정리
				DBUtil.executeClose(null, pstmt, conn);
			}
	}

}
