package kr.s20.object.lang;

public class WrapperMain01 {
	public static void main(String[] args) {
		
		boolean b = true; // 기본 자료형
		Boolean wrap_b = new Boolean(b);
		//참조 자료형 데이터  -> 기본 자료형 데이터로 전환 시킴
		boolean b2 = wrap_b.booleanValue()	;
		System.out.println(b2);
		
		System.out.println("-------------------------------");
		
		char c = 'A'; // 기본 자료형
		Character wrap_c = c ; 	//기본 자료형 데이터 -> 참조 자료형 데이터
											//auto boxing
		//참조 자료형 데이터 -> 기본 자료형 데이터
		//auto unboxing
		System.out.println(wrap_c);
	
	}

}
