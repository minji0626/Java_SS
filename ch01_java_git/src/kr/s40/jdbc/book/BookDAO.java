package kr.s40.jdbc.book;

import java.sql.*;

import kr.util.DBUtil;

public class BookDAO {

	//admin 도서 등록
	public void insertBook(String bk_name , String bk_category) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql = "INSERT INTO sbook VALUES (sbook_seq.nextval,?,?,SYSDATE)";
			// JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩
			pstmt.setString(1,bk_name);
			pstmt.setString(2,bk_category);
			// JDBC 4 단계
			pstmt.executeUpdate();
			System.out.println("책 정보를 추가하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}

	}
	//admin 도서 목록
	public void selectListBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql = "SELECT * FROM sbook ORDER BY bk_num DESC";
			//JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("======================");
			if(rs.next()) {
				System.out.println("도서번호\t도서명\t도서분류\t등록일");
				System.out.print(rs.getInt("bk_num"));
				System.out.print("\t");
				System.out.print(rs.getString("bk_name"));
				System.out.print("\t");
				System.out.print(rs.getString("bk_category"));
				System.out.print("\t");
				System.out.println(rs.getDate("bk_date"));
			}
			else {
				System.out.println("등록된 책 정보가 없습니다.");
			}
			System.out.println("======================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//admin 회원 목록
	public void selectListMember() {

	}
	//admin 대출 목록(대출 및 반납의 모든 데이터 표시)
	public void selectListReservation(){

	}

	//user 아이디 중복 체크 (count 0이면 미중복, 1이면 중복)
	public int checkId(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		int count = 0;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT me_id FROM member WHERE me_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = 1;
			}
		} catch (Exception e) {
			count = 2; // 오류 발생
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}

	//user 회원 가입
	public void insertMember(String me_id , String me_passwd, String me_name, String me_phone) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql = "INSERT INTO member VALUES (?,?,?,?)";
			// JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 바인딩
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			pstmt.setString(3, me_name);
			pstmt.setString(4, me_phone);
			//JDBC 4 단계
			pstmt.executeUpdate();
			System.out.println("회원가입이 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

	// 사용자 로그인 체크
	public boolean loginCheck(String me_id, String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT me_id FROM member WHERE me_id = ? AND me_passwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				flag = true;
				System.out.println("로그인 완료되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return flag;
	}
	
	// 도서 대출 여부 확인 (도서 번호(bk_num)로 검색해서 re_status의 값이 0이면 대출 가능, 1이면 대출 불가 )

	//user 도서 대출 등록
	public void insertReservation (int bk_num, String me_id) {

	}

	//user MY대출목록 보기(현재 대출한 목록만 표시합니다)
	public void selectMyList(String me_id){

	}

	// 사용자 반납 가능 여부 (대출번호(re_num)와 회원 아이디(me_id)를 함께 조회해서 re_status가 1이면 반납가능 , 0이면 불가능)

	//사용자 반납 처리
	public void updateReservation(int re_num) {

	}
}
