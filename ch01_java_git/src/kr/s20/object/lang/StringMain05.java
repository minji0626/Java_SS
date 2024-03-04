package kr.s20.object.lang;

/*
[실습]
아래 문자열의 대문자 -> 소문자 , 소문자 -> 대문자
 */
public class StringMain05 {

	public static void main(String[] args) {
		
		String str = "abcMDye-4W?EWzz";
		String result = "" ;
		for(int i = 0; i < str.length(); i ++) {
			char c = str.charAt(i);
			
			 if ( 64 < c && c < 91 ) { //대문자 구간
				 // char --> String 변환 후 소문자로 변환
				result += String.valueOf(c).toLowerCase();
			}
			 
			 else if ( 96 < c && c < 123) { //소문자 구간
				 // char --> String 변환 후 대문자로 변환
				result += String.valueOf(c).toUpperCase();
			 }
			 
			 else { //대.소문자가 아닌 문자들
				 result += c;
			 }
		}
		
		System.out.println(result);
		System.out.println("------------------------------");
		
		String result2 = "";
							// String - > char []
		for(char c : str.toCharArray()) {
			// 대문자이면 true 반환
			if (Character.isUpperCase(c)) {
				// 대문자 ---> 소문자
				result2 += Character.toLowerCase(c);
			}
			
			// 소문자이면 true 반환
			else if (Character.isLowerCase(c)) {
				// 소문자 ---> 대문자
				result2 += Character.toUpperCase(c);
			}
			else
				// 대.소문자 아닌 문자들
				result2 += c;
			
		}
		System.out.println(result2);
		System.out.println("------------------------------");
		
		String result3 = "";
		
		for (int i = 0; i<str.length(); i ++) {
			char c = str.charAt(i);
			 if ( 64 < c && c < 91 ) { //대문자 구간
				 result3 += (char) ( c + 32 ); // 아스키코드 대문자와 소문자의 간격이 32 ,  아스키코드 --> char로 형변환
			}
			 
			 else if ( 96 < c && c < 123) { //소문자 구간
				 result3 += (char) ( c - 32 );
			 }
			 
			 else { //대.소문자가 아닌 문자들
				 result3 += c;
			 }
			
		}
		
		System.out.println(result3);
		
		
		
	}
}
