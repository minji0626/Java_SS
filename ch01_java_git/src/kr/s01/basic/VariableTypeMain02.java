package kr.s01.basic;

public class VariableTypeMain02 {

	public static void main(String[] args) {
		
		//확장 특수 출력 문자 ( Escape Sequence )
		// \을 붙여 표현하면 일반 문자로 변환된다.
		char single = '\'';
		System.out.println(single);
		
		// \을 붙여 표현하면 일반 문자로 변환된다.
		String str1 = "오늘은 \"월요일\"입니다.";
		System.out.println(str1);
		
		//문자열 '를 표시하면 자동으로 일반 문자로 변환됨
		String str2 = "오늘은'서울'에 비가 와요!";
		System.out.println(str2);
		
		// 경로 나타낼 때 역슬래쉬를 한 번 더 써줘야 나타난다.
		String str3 ="C:\\javaWork\\workspace";
		System.out.println(str3);
		
		// \n : 엔터 키의 기능을 갖는다. 줄을 바꾼다.
		String str4 = "오늘은 월요일 \n내일은 화요일";
		System.out.println(str4);
		
		// \t : 수평 탭으로 일정한 간격을 띄운다.
		String str5 = "이름\t나이\t취미";
		System.out.println(str5);
		
		
	}

}
