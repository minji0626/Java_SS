package kr.s37.jdbc.car;

import java.sql.*;
import kr.util.DBUtil;

public class CarDAO {

	//자동차 정보 등록
	public void insertCar(String name, String cnumber, String color, String maker, int price) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();

			//SQL문 입력하기
			sql = "INSERT INTO car VALUES(car_seq.nextval,?,?,?,?,?,SYSDATE)";

			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);

			//?에 데이터 바인딩
			pstmt.setString(1,name);
			pstmt.setString(2, cnumber);
			pstmt.setString(3, color);
			pstmt.setString(4, maker);
			pstmt.setInt(5, price);

			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	} // insertCAR end

	//목록 보기
	public void selectCar() {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM car ORDER BY num";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("==========");
			if (rs.next()) {
				System.out.println("번호\t자동차명\t가격\t제조사\t등록일");
				do {
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.print(rs.getInt("price"));
					System.out.print("\t");;
					System.out.print(rs.getString("maker"));
					System.out.print("\t");
					System.out.println(rs.getDate("reg_date"));
				}

				while(rs.next());
			}
			else {
				System.out.println("등록된 데이터가 없습니다.");
			}


		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}


	}

	//자동차 상세 보기
	public void selectDetailCar(int num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM car WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("자동차명 : " +rs.getString("name"));
				System.out.println("자동차 번호 : " +rs.getString("cnumber"));
				System.out.println("자동차 색상 : " +rs.getString("color"));
				System.out.println("자동차 제조사 : " +rs.getString("maker"));
				System.out.println("자동차 가격 : " +rs.getInt("price"));
				System.out.println("등록일 : " +rs.getDate("reg_date"));
			}
			else {
				System.out.println("검색된 데이터가 없습니다.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}

	}

	//자동차 정보 수정하기
	public void updateCar(int num,String name, String cnumber, String color, String maker, int price) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			conn = DBUtil.getConnection();
			sql = "UPDATE car SET name=?, cnumber =? , color =? , maker = ?, price = ? WHERE num =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, cnumber);
			pstmt.setString(3, color);
			pstmt.setString(4, maker);
			pstmt.setInt(5, price);
			pstmt.setInt(6, num);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}

	}

	//자동차 정보 삭제하기
	public void deleteCar(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			conn = DBUtil.getConnection();
			sql = "DELETE FROM car WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}

	}

}
