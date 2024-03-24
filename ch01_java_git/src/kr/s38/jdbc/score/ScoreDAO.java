package kr.s38.jdbc.score;

import java.sql.*;

import kr.util.DBUtil;

public class ScoreDAO {
	
	//성적 입력하기
	public void insertScore (String name, int korean , int english , int math, 
										int sum, int avg, String grade) { // 점수는 0~100 사이
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		try {
			conn = DBUtil.getConnection();
			sql = "INSERT INTO score (num, name, korean, english, math, sum, avg, grade, reg_date) VALUES(score_seq.nextval,?,?,?,?,?,?,?,SYSDATE)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, korean);
			pstmt.setInt(3, english);
			pstmt.setInt(4, math);
			pstmt.setInt(5, sum);
			pstmt.setInt(6, avg);
			pstmt.setString(7, grade);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//목록보기
	public void selectScore() {
		//번호, 사람 이름, 총점, 평균, 등급 명시하기
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM score ORDER BY num";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("==========");
			if (rs.next()) {
				System.out.println("번호\t이름\t총점\t평균\t등급");
				do {
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.print(rs.getInt("sum"));
					System.out.print("\t");;
					System.out.print(rs.getInt("avg"));
					System.out.print("\t");
					System.out.println(rs.getString("grade"));
				}

				while(rs.next());
			}
			else {
				System.out.println("등록된 데이터가 없습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	
	//상세 보기
	public void selectDetailScore(int num) {
		//  번호, 이름, 국어, 영어, 수학, 총점, 평균, 등급, 등록날짜
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			sql = "SELECT * FROM score WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			rs = pstmt.executeQuery();
			System.out.println("==========");
			if (rs.next()) {
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("국어 : " + rs.getInt("korean"));
				System.out.println("영어 : " + rs.getInt("english"));
				System.out.println("수학 : " + rs.getInt("math"));
				System.out.println("총점 : " + rs.getInt("sum"));
				System.out.println("평균 : " + rs.getInt("avg"));
				System.out.println("등급 : " + rs.getString("grade"));
				System.out.println("등록 날짜 : " + rs.getDate("reg_date"));
			}
			else {
				System.out.println("등록된 데이터가 없습니다.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	
	//성적 수정
	public void updateScore(int num, String name, int korean, int english, int math,
																			int sum, int avg, String grade)	{
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		try {
			conn = DBUtil.getConnection();
			sql = "UPDATE score SET name = ?, korean = ?, english = ?, math=?, sum=?,avg=?,grade=? WHERE num =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, korean);
			pstmt.setInt(3, english);
			pstmt.setInt(4, math);
			pstmt.setInt(5, sum);
			pstmt.setInt(6, avg);
			pstmt.setString(7, grade);
			pstmt.setInt(8, num);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행이 수정되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//성적 삭제
	public void deleteScore(int num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		try {
			conn = DBUtil.getConnection();
			sql = "DELETE FROM score WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행이 삭제되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
}
