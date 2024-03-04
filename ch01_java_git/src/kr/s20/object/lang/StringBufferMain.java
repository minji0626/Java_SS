package kr.s20.object.lang;

public class StringBufferMain {
	public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("여름 덥다!!");
			System.out.println("1 : " + sb);
			
			// 지정한 인덱스에 문자 삽입
			sb.insert(2, '이');
			System.out.println("2 : " + sb);
			
			// 문자열 뒤에 문자열 붙이기
			sb.append(" 가을은 ");
			System.out.println("3 : " + sb);
			
			sb.append("시원하다.");
			System.out.println("4 : " + sb);
			
			//시작인덱스부터 끝 인덱스 전까지 문자열 대체
			sb.replace(0, 3, "여행가자!!");
			System.out.println("5 : " + sb);
			
			//지정한 인덱스의 문자를 삭제
			sb.deleteCharAt(0);
			System.out.println("6 : " + sb);
			
			// 시작 인덱스부터 끝 인덱스 전까지 문자열 삭제
			sb.delete(0, 3); //=> 2인덱스까지 삭제한다는 뜻
			System.out.println("7 : " + sb);
			
			//StringBuffer -> String 으로 변환
			String str = sb.toString()	;
			System.out.println("str = " + str);
			
	}

}
