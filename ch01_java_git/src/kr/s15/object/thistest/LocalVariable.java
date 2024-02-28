package kr.s15.object.thistest;

public class LocalVariable {

	//멤버 변수 :  클래스 블럭 내에서 정의된 변수
	int b = 200;

	public void make() {
		/*
		 * 지역변수 : 매서드 생성자, 제어문 블럭 내에서 생성된 변수,
		 *             해당 블럭이 종료되면 변수는 소멸한다.
		 */
		int a = 100;

		System.out.println("지역 변수 a : " + a) ;
		System.out.println("멤버 변수 b : " + b);
	}

	public void fun() {
		//a는 make()메소드에서 선언한 지역 변수이기 때문에 다른 메소드에서 호출이 불가능하다.
		//System.out.println("지역 변수 a : " + a);   // 지역 변수 a는 make 메소드를 벗어나면 사용이 불가능해진다.
		System.out.println("멤버 변수 b : " + b);
	}


	public static void main(String[] args) {

		//제어문
		for (int i = 1 ; i <= 5 ; i++) { //제어문 블럭
			System.out.print(i + "\t");
		}
		System.out.println("\n--------------------------------");
		//System.out.println(i); => 여기서 사용된 i는 제어문 블럭에서만 사용 가능한 지역 변수이다.
		
		
		int a;
		for (a = 1; a <= 5; a ++) {
			System.out.print(a + "\t");
		}
		System.out.println("\n----------------------------------");
		System.out.println(a);
	}

}