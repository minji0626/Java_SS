package kr.s01.basic;

public class VariableTypeMain01 {

	public static void main(String[] args) {
		
		//논리형 (true , false)
		System.out.println("------논리형------");
		boolean b = true;
		System.out.println("b = " + b );
		System.out.println();
		
		//문자형, 크기 : 2 byte (16bit), 표현범위 : 0 ~ 65,535 
		//다국어 처리를 위한 유니코드(unicode) 방식을 사용함
		//문자코드 => 유니코드는 16진수를 사용하여 나타낸다. 유니코드 안에 아스키코드가 포함되어 있다. 
		//한글은 유니코드로만 명시 가능함
		//아스키코드는 10진수를 사용한다. 
		System.out.println("------문자형------");
		char c1 = 'A'; 		//내부적으로 아스키코드값 65가 2byte로 변수 c1에 담김
		System.out.println("c1 = " + c1);
		
		char c2 = 65; 		//A에 해당되는 아스키코드값 65를 직접 대입
		System.out.println("c2 = " + c2);
		
		char c3 = '\u0041'; 	//A를 의미하는 유니코드
		System.out.println("c3 = " + c3);
		
		char c4 = '자';	//한글은 아스키코드값이 없음
		System.out.println("c4 = " + c4);
		
		char c5 = '\uc790';		//유니코드
		System.out.println("c5 = " + c5);
		System.out.println();
		
		System.out.println("------정수형------");
		//byte , 크기 : 1 byte , 표현 범위 : -128 ~ 127
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		
		//short , 크기 : 2 byte , 표현 범위 : -32,768 ~ 32,678
		short s1 = 32678;
		System.out.println("s1 = " + s1);
		
		//int, 크기 : 4 byte , 표현 범위 : -2,147,483,648 ~ 2,147,483,647 , 정수 표현의 기본
		int i1 = 1234;
		System.out.println("i1 = " + i1);
		
		//long , 크기 : 8 byte 
		long lg = 1234L;
		System.out.println("lg = " + lg);
		System.out.println();
		
		System.out.println("------실수형------");
		//float , 크기 : 4 byte
		float f1 = 9.1f;
		System.out.println("f1 = " + f1);
		
		//double , 크기 : 8 byte
		double du = 9.8;
		System.out.println("du = " + du);
		System.out.println();
		
		System.out.println("------문자열 표시------");
		//문자열 표시 (기본자료형이 아님, 참조자료형)
		String str = "Hello World!!";
		System.out.println("str = " + str);
		
	}

}
