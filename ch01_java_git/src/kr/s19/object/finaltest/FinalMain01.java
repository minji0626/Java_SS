package kr.s19.object.finaltest;

class A {
	//멤버 필드
	final int NUM = 10;  //상수
	public static final int NUMBER = 20; //객체 생성 없이 호출하면 출력됨
}

public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		// ap.NUM = 20; -> 상수는 변경이 불가능하다.
		System.out.println(ap.NUM);
		
		//Static 상수 호출	// 클래스명.호출하려는 상수 이름
		System.out.println(A.NUMBER);
	
		final int NO = 30;
		System.out.println(NO);
	
	}

}
