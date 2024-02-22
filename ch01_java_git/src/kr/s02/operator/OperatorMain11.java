package kr.s02.operator;

public class OperatorMain11 {

	public static void main(String[] args) {
		
		System.out.println("===조건 (삼항) 연산자===");
		
		char ch = 'M';
		String str; //대문자인지 판단한 결과를 저장할 문자열 변수 선언
		
		//str = ch>=65 && ch<=90 ? "대문자" : "소문자";
		str = ch>='A' && ch<='Z' ? "대문자" : "소문자";
		System.out.println(ch + "=> " + str );

	}

}
