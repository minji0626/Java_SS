package kr.s40.jdbc.book;

import java.sql.*;

import kr.util.DBUtil;

public class BookDAO {

	//admin 도서 등록 -- 완료
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
	//admin 도서 목록 -- 완료
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
			System.out.println("도서번호\t도서명\t도서분류\t등록일");
			if(rs.next()) {
				do {
					System.out.print(rs.getInt("bk_num"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_name"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_category"));
					System.out.print("\t");
					System.out.println(rs.getDate("bk_regdate"));
				} while(rs.next());
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
	//admin 회원 목록 -- 완료
	public void selectListMember() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql = "SELECT * FROM member ORDER BY me_regdate DESC";
			//JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("======================");
			System.out.println("ID\tPW\t이름\t전화번호\t\t\t가입일");
			if(rs.next()) {
				do {
					System.out.print(rs.getString("me_id"));
					System.out.print("\t");
					System.out.print(rs.getString("me_passwd"));
					System.out.print("\t");
					System.out.print(rs.getString("me_name"));
					System.out.print("\t");
					System.out.print(rs.getString("me_phone"));
					System.out.print("\t");
					System.out.println(rs.getDate("me_regdate"));
				} while(rs.next());
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
	//admin 대출 목록(대출 및 반납의 모든 데이터 표시) -- 완료
	public void selectListReservation(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;

		try {
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql ="SELECT * FROM reservation JOIN sbook USING(bk_num) "
					+ "JOIN member USING(me_id) ORDER BY re_num DESC";
			// JDBC 3단계
			pstmt = conn.prepareStatement(sql);;
			//JDBC 4 단계
			rs = pstmt.executeQuery();
			System.out.println("===================================================");
			System.out.println("대출번호\tID\t도서명\t분류\t대출상태\t\t대출일\t\t반납일");
			while(rs.next()) {
				System.out.print(rs.getInt("re_num"));
				System.out.print("\t");
				System.out.print(rs.getString("me_id"));
				System.out.print("\t");
				System.out.print(rs.getString("bk_name"));
				System.out.print("\t");
				System.out.print(rs.getString("bk_category"));
				System.out.print("\t");
				if(rs.getInt("re_status") == 0) {
					System.out.print("대출가능\t\t");
				}
				else {
					System.out.print("대출중\t\t");
				}
				System.out.print(rs.getDate("re_date"));
				System.out.print("\t");
				if (rs.getDate("re_modifydate") == null) {
					System.out.println(" ");
				} 
				else {
					System.out.println(rs.getDate("re_modifydate"));
				}
			}
			System.out.println("===================================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}

	}

	//user 아이디 중복 체크 (count 0이면 미중복, 1이면 중복) -- 완료
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

	//user 회원 가입 -- 완료
	public void insertMember(String me_id , String me_passwd, String me_name, String me_phone) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql = "INSERT INTO member VALUES (?,?,?,?,SYSDATE)";
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

	// 사용자 로그인 체크 -- 완료
	public boolean loginCheck(String me_id, String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM member WHERE me_id = ? AND me_passwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			else {
				System.out.println("해당 회원이 존재하지 않습니다. 회원 가입 진행 후 로그인 해주세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return flag;
	}

	// 도서 대출 여부 확인 (도서 번호(bk_num)로 검색해서 re_status의 값이 0이면 대출 가능, 1이면 대출 불가 )
	public int getStatusReservation(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		int count = 0;
		try{
			conn = DBUtil.getConnection();
			sql = "SELECT re_status FROM sbook LEFT OUTER JOIN (SELECT * FROM reservation WHERE re_status = 1) "
					+ "USING (bk_num) WHERE bk_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bk_num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt("re_status");
			} else {
				count = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}

	// 사용자 반납 가능 여부 (대출번호(re_num)와 회원 아이디(me_id)를 함께 조회해서 re_status가 1이면 반납가능 , 0이면 불가능)
	public int getStatusBack(int re_num , String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		int count = 0;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT re_status FROM reservation WHERE bk_num = ? AND me_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			pstmt.setInt(2, re_num);
			rs = pstmt.executeQuery();
			count = rs.getInt("re_satus");
			if(count == 1) {
				System.out.println("반납 가능");
			} else  {
				System.out.println("반납 불가능");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}

	//user 도서 대출 등록 -- 완료
	public void insertReservation (int bk_num, String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;;
		try {
			int status = getStatusReservation(bk_num);
			if (status == 1) {
				System.out.println("이 책은 현재 대출이 불가능합니다.");
				return;
			}
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql ="INSERT INTO reservation (re_num, bk_num, me_id, re_status) VALUES(reservation_seq.nextval,?,?,1)";
			// JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 바인딩
			pstmt.setInt(1, bk_num);
			pstmt.setString(2, me_id);
			//JDBC 4 단계
			pstmt.executeUpdate()	;
			System.out.println("대출이 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

	//user MY대출목록 보기(현재 대출한 목록만 표시합니다)
	public void selectMyList(String me_id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;

		try {
			//JDBC 1,2 단계
			conn = DBUtil.getConnection();
			//sql 문 
			sql ="SELECT * FROM reservation JOIN sbook USING(bk_num) "
					+ "JOIN member USING(me_id) WHERE me_id = ? ORDER BY re_num DESC ";
			// JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 바인딩
			pstmt.setString(1, me_id);

			//JDBC 4 단계
			rs = pstmt.executeQuery();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("대출번호\tID\t도서명\t분류\t대출상태\t대출일\t\t반납일");
			while(rs.next()) {
				if(rs.getInt("re_status") == 1) {
					System.out.print(rs.getInt("re_num"));
					System.out.print("\t");
					System.out.print(rs.getString("me_id"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_name"));
					System.out.print("\t");
					System.out.print(rs.getString("bk_category"));
					System.out.print("\t");
					if(rs.getInt("re_status") == 0) {
						System.out.print("대출가능\t");
					}
					else {
						System.out.print("대출중\t");
					}
					System.out.print(rs.getDate("re_date"));
					System.out.print("\t");
					if (rs.getDate("re_modifydate") == null) {
						System.out.println("");
					}

					else {
						System.out.println("대출 내역이 존재하지 않습니다.");
					}
					
				}
			}
			System.out.println("-----------------------------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}


	//사용자 반납 처리
	public void updateReservation(int re_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			conn = DBUtil.getConnection();
			sql = "UPDATE reservation SET re_status = 0, re_modifydate = SYSDATE WHERE  re_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, re_num);
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 도서가 반납 처리 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

	//	public void deleteMember(String me_id, String me_passwd) {
	//		Connection conn = null;
	//		PreparedStatement pstmt = null;
	//		String sql = null;
	//		try {
	//			conn = DBUtil.getConnection();
	//			sql = "DELETE FROM member WHERE me_id = ? AND me_passwd = ?";
	//			pstmt = conn.prepareStatement(sql);
	//			pstmt.setString(1, me_id);
	//			pstmt.setString(2, me_passwd);
	//			pstmt.executeUpdate();
	//			System.out.println("탈퇴 처리가 완료되었습니다.");
	//		}catch (Exception e) {
	//			e.printStackTrace();
	//		}finally {
	//			DBUtil.executeClose(null, pstmt, conn);
	//		}
	//	}

	//회원 탈퇴하기
	public void deleteMember(String me_id, String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM member WHERE me_id = ? AND me_passwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				// 회원이 존재하는 경우에만 삭제 수행
				sql = "DELETE FROM member WHERE me_id = ? AND me_passwd = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, me_id);
				pstmt.setString(2, me_passwd);
				int rowsAffected = pstmt.executeUpdate();
				if (rowsAffected > 0) {
					System.out.println("탈퇴 처리가 완료되었습니다.");
				} else {
					System.out.println("회원 정보를 찾을 수 없습니다.");
				}
			} else {
				System.out.println("회원 정보를 찾을 수 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}

}
