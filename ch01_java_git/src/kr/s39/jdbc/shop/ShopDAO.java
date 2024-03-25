package kr.s39.jdbc.shop;

import java.sql.*;

import kr.util.DBUtil;

public class ShopDAO {

	//관리자 상품 등록
	public void insertItem (String item_name , int item_price) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		try {
			// JDBC 1,2 단계
			conn = DBUtil.getConnection();
			// SQL 문 작성
			sql = "INSERT INTO sitem VALUES(sitem_seq.nextval,?,?,SYSDATE)";
			//JDBC 3 단계
			pstmt = conn.prepareStatement(sql);
			// ?에 바인딩
			pstmt.setString(1, item_name);
			pstmt.setInt(2, item_price);
			// JDBC 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삽입했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

	//관리자 & 사용자 상품 목록(공유)
	public void selectItems () {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 1,2 단계 
			conn = DBUtil.getConnection()	;
			//SQL문 작성
			sql = "SELECT * FROM sitem ORDER BY item_num DESC";
			//JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("======================");
			if ( rs.next() ) {
				System.out.println("번호\t상품명\t상품가격\t등록일");
				do {
					System.out.print(rs.getInt("item_num"));
					System.out.print("\t");
					System.out.print(rs.getString("item_name"));
					System.out.print("\t");
					System.out.printf("%,d" , rs.getInt("item_price"));
					System.out.print("\t");
					System.out.println(rs.getDate("item_date"));
				} while(rs.next());
			}
			else {
				System.out.println("등록된 상품이 없습니다.");
			}
			System.out.println("======================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}

	//관리자 회원 목록
	public void selectCustomers() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 1,2 단계 
			conn = DBUtil.getConnection()	;
			//SQL문 작성
			sql = "SELECT * FROM customer ORDER BY cust_id";
			//JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("======================");
			if(rs.next()) {
				System.out.println("아이디\t\t이름\t전화번호\t\t\t주소");
				do {
					System.out.print(rs.getString("cust_id"));
					System.out.print("\t");
					System.out.print(rs.getString("cust_name"));
					System.out.print("\t");
					System.out.print(rs.getString("cust_tel"));
					System.out.print("\t");
					System.out.println(rs.getString("cust_address"));
				} while(rs.next());
			}
			else {
				System.out.println("등록된 회원이 없습니다.");
			}
			System.out.println("======================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}

	//관리자 구매 목록
	public void selectOrders() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//JDBC 1,2 단계 
			conn = DBUtil.getConnection()	;
			//SQL문 작성
			sql = "SELECT * FROM sorder JOIN sitem USING(item_num) JOIN customer USING(cust_id) ORDER BY order_num DESC";
			//JDBC 3단계
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("======================");
			if(rs.next()) {
				System.out.println("주문번호\t주문자ID\t\t이름\t\t상품명\t상품 가격\t주문일자");
				do {
					System.out.print(rs.getInt("order_num"));
					System.out.print("\t");
					System.out.print(rs.getString("cust_id"));
					System.out.print("\t\t");
					System.out.print(rs.getString("cust_name"));
					System.out.print("\t\t");
					System.out.print(rs.getString("item_name"));
					System.out.print("\t");
					System.out.print(rs.getInt("item_price"));
					System.out.print("\t");
					System.out.println(rs.getDate("order_date"));
				} while(rs.next());
			}
			else {
				System.out.println("구매 내역이 없습니다.");
			}
			System.out.println("======================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}

	//사용자 회원 등록
	public void insertCustomer(String cust_id, String cust_name , String cust_address, String cust_tel) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		try {
			// JDBC 1,2 단계
			conn = DBUtil.getConnection();
			// SQL 문 작성
			sql = "INSERT INTO customer VALUES(?,?,?,?,SYSDATE)";
			//JDBC 3 단계
			pstmt = conn.prepareStatement(sql);
			// ?에 바인딩
			pstmt.setString(1, cust_id);
			pstmt.setString(2, cust_name);
			pstmt.setString(3, cust_address);
			pstmt.setString(4, cust_tel);
			// JDBC 4단계
			pstmt.executeUpdate();
			System.out.println("회원가입이 완료되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

	//사용자 회원 상세
	public void selectDetailCustomer(String cust_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM customer WHERE cust_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cust_id);
			rs = pstmt.executeQuery();
			System.out.println("======================");
			if(rs.next()) {
				System.out.println("아이디 : " + rs.getString("cust_id"));
				System.out.println("이름 : " + rs.getString("cust_name"));
				System.out.println("주소 : " + rs.getString("cust_address"));
				System.out.println("전화번호 : " + rs.getString("cust_tel"));
				System.out.println("가입일 : " + rs.getDate("cust_date"));
			}
			else {
				System.out.println("검색된 회원 정보가 없습니다.");
			}
			System.out.println("======================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}

	}

	//사용자 상품 구매
	public void insertOrder(String cust_id, int item_num)	{
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		try {
			// JDBC 1,2 단계
			conn = DBUtil.getConnection();
			// SQL 문 작성
			sql = "INSERT INTO sorder VALUES(sorder_seq.nextval,?,?,SYSDATE)";
			//JDBC 3 단계
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cust_id);
			pstmt.setInt(2, item_num);
			// JDBC 4단계
			int count = pstmt.executeUpdate();
			System.out.println("구매 완료하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}

	// 사용자 구매 내역
	public void selectOrdersById(String cust_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM sorder JOIN sitem USING (item_num) WHERE cust_id = ? ORDER BY order_num DESC";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cust_id);
			rs = pstmt.executeQuery();
			System.out.println("-----------------------------------------");
			System.out.println(cust_id + "님의 구매 내역");
			System.out.println("-----------------------------------------");
			if(rs.next()) {
				System.out.println("주문번호\t아이디\t상품번호\t주문일자");
				do {
					System.out.print(rs.getInt("order_num"));
					System.out.print("\t");
					System.out.print(rs.getString("cust_id"));
					System.out.print("\t");
					System.out.print(rs.getInt("item_num"));
					System.out.print("\t");
					System.out.println(rs.getDate("order_date"));
				} while(rs.next());
			}
			else {
				System.out.println("구매 내역이 없습니다.");
			}
			System.out.println("======================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}

}
