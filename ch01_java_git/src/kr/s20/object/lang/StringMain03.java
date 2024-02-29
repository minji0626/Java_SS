package kr.s20.object.lang;

public class StringMain03 {

	public static void main(String[] args) {
			String s1 = "  aBa  ";
			String s2 = "abc";
			int a = 100;
			String msg = null;
			
			// 대문자 처리
			msg = s1.toUpperCase()	;
			System.out.println("msg : " + msg); 
			
			// 소문자 처리
			msg = s1.toLowerCase()	;
			System.out.println("msg : " + msg); 
			
			// Old 문자를 New 문자로 대체
			msg = s1.replace("aB", "b"); 
			System.out.println("msg : " + msg);
			
			//앞, 뒤 공백을 제거시킴
			msg = s1.trim(); 
			System.out.println("msg : " + msg);
			
			//문자열 중에 메소드의 인자로 전달된 문자열이 포함되어있는지 검증
			boolean f = s1.contains("aB");
			System.out.println("f : " + f);
			
			//메소드의 인자로 전달된 문자열로 시작하는지 검증
			f = s2.startsWith("ab");
			System.out.println("f : " + f);
			
			//메소드의 인자로 전달된 문자열로 끝나는지 검증
			f = s2.endsWith("bc");
			System.out.println("f : " + f);
			
			// int => String 변환
			msg = String.valueOf(a);
			System.out.println("msg : " + msg);
			
			// 빈 문자열로 넣어주면 연결되어서 새로운 문자열을 만들어낸다. valuOf, 빈문자열 모두 사용 가능
			msg = a + "" ;
			System.out.println("msg : " + msg);
			
			
			
	}

}
