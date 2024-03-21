package kr.s33.jdbc.preparedstatement;

import java.sql.*;
import java.io.*;
import kr.util.DBUtil;

public class SelectSearchMain {
	public static void main(String[] args) {

		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("제목 검색어 : ");
			String keyword = br.readLine();
			System.out.println("-------------------------");
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM test3 WHERE title LIKE '%' || ? || '%' ";
			//가변 문자를 넣어야지 keyword가 포함되어있는 제목을 검색할 수 있다.

			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, keyword);
			//JDBC 수행 4단계 : SQL 문을 테이블에 반영해서 결과 집합을 RESULTSET에 담아서 반환
			rs = pstmt.executeQuery();
			
			//IF 문을 이용하여 검색어에 맞는 데이터 행이 있는지 없는지 검색을 우선적으로 진행
			if(rs.next()) {
				System.out.println("번호\t작성자\t등록일\t\t제목");
				//while문을 쓰게 되면 두 개 나와야할 출력문들이 첫 번째로 출력되는 값은 건너뛰고 출력하기 때문에 do-while문을 사용하여 출력해야한다.
				do{ 
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.print(rs.getDate("reg_date"));
					System.out.print("\t");
					System.out.println(rs.getString("title"));
				} 
				while(rs.next());
			} else {
				System.out.println("검색된 데이터가 없습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
			if (br != null) try {br.close();} catch(IOException e) {}
		}
	}

}
