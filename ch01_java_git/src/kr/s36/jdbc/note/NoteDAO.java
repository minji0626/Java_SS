package kr.s36.jdbc.note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import kr.util.DBUtil;
/*
 * DAO : Data Access Object
 * 			데이터베이스의 데이터를 전문적으로 호출하고 제어하는 객체
 * 
 */
public class NoteDAO {
	//글쓰기
	public void insertInfo ( String name, String passwd, String subject, String content, String email) {
		Connection conn = null;
		PreparedStatement  pstmt= null;
		String sql = null;
		try {
			//JDBC 1단계
			conn = DBUtil.getConnection();

			//SQL문 작성
			sql = "INSERT INTO note VALUES(note_seq.nextval,?,?,?,?,?,SYSDATE)";

			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);

			//?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);

			//JDBC 수행 4단계
			int count = pstmt.executeUpdate(); 
			System.out.println(count + "개의 행을 삽입했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

	//목록 보기
	public void selectInfo() {
		Connection conn = null;
		PreparedStatement  pstmt= null;
		String sql = null;
		ResultSet rs = null;
		try {//JDBC 수행문 1, 2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM note ORDER BY num DESC";
			//JDBC 수행 3단계 --- SQL문 전달
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계 : SQL 문장을 실행해서 테이블에 반영하고 
			//						결과 집합을 ReqsultSet에 담아서 반환하기
			rs = pstmt.executeQuery();
			System.out.println("========");
			if(rs.next()) {
				System.out.println("번호\t이름\t작성일\t\t제목");
				do {
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.print(rs.getDate("reg_date"));
					System.out.print("\t");
					System.out.println(rs.getString("subject"));
				} 
				while(rs.next());
			} //end of if
			else {
				System.out.println("표시할 데이터가 없습니다.");
			}
			System.out.println("========");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			//자원 정리
			DBUtil.executeClose(rs, pstmt, conn);
		}

	}

	//상세글 보기
	public void selectDetailInfo(int num)	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM note WHERE num=?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 입력된 값 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행 4 단계 : SQL문을 테이블에 반영하고 결과 집합을 Result Set에 담아서 반환
			rs = pstmt.executeQuery();
			
			//rs.next 값이 primary key에 있는 데이터라면 true를 반환하고 없다면 false를 반환하기 때문에 조건체크를 통해서 출력해야한다
			if (rs.next()) {
				System.out.println("글번호 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("비밀번호 : " + rs.getString("passwd"));
				System.out.println("제목 : " + rs.getString("subject"));
				System.out.println("내용 : " + rs.getString("content"));
				String email = rs.getString("email");
				if(email == null) { // email이 null값이라면 비어있게 출력할 수 있게 조건 체크
					email = ""; }
				System.out.println("이메일 : " + email);
				System.out.println("작성일 : " + rs.getDate("reg_date"));
			}
			else {
				System.out.println("검색된 데이터가 없습니다.");
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	
	//수정 작업
	public void updateInfo(int num , String name, String passwd, String subject,String content, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
				//JDBC 수행문 1,2 단계
				conn = DBUtil.getConnection();
				//SQL문 작성
				sql = "UPDATE note SET name=?,passwd=?,subject=?,content = ?,email=? WHERE num=?";
				//JDBC 수행 3단계
				pstmt = conn.prepareStatement(sql);

				//?에 데이터 바인딩
				pstmt.setString(1, name);
				pstmt.setString(2, passwd);
				pstmt.setString(3, subject);
				pstmt.setString(4, content);
				pstmt.setString(5, email);
				pstmt.setInt(6, num);
				
				//JDBC 수행 4단계 : SQL문을 실행해서 테이블의 데이터를 수정한다.
				int count = pstmt.executeUpdate();
				System.out.println(count+"개 행의 정보를 수정했습니다.");

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//글 삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1, 2 단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM note WHERE num = ?";
			//JDBC 수행 3 단계
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println( count + "개 행을 삭제했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
}
