package kr.s33.jdbc.preparedstatement;

import java.sql.*;
import java.io.*;
import kr.util.DBUtil;

public class SelectDetailMain {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("번호 : ");
			int num = Integer.parseInt(br.readLine());
			System.out.println("------------------");
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM test3 WHERE num=?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 입력된 값 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행 4 단계 : SQL문을 테이블에 반영하고 결과 집합을 Result Set에 담아서 반환
			rs = pstmt.executeQuery();
			
			//rs.next 값이 primary key에 있는 데이터라면 true를 반환하고 없다면 false를 반환하기 때문에 조건체크를 통해서 출력해야한다
			if (rs.next()) {
				System.out.println("번호 : " + rs.getInt("num"));
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("작성자 : " + rs.getString("name"));
				System.out.println("내용 : " + rs.getString("memo"));
				String email = rs.getString("email");
				if(email == null) { // email이 null값이라면 비어있게 출력할 수 있게 조건 체크
					email = "";
				}
				System.out.println("이메일 : " + email); //빈칸으로 출력되게 할려면 email을 출력시켜야한다.
				System.out.println("등록일 : " + rs.getDate("reg_date"));
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
			if(br != null) try {br.close();} catch(IOException e){}
		}
	}

}
