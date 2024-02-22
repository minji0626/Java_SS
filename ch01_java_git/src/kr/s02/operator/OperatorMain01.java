package kr.s02.operator;

public class OperatorMain01 {

	public static void main(String[] args) {
		
		System.out.println("===증감연산자===");
		
		System.out.println("--------------------");
		//증가연산자
		
		int i = 5; //변수 선언 후 초기화 상태
		//증가연산자를 변수 앞에 명시하면 변수의 값을 1 증가시킨 후에 증가된 값을 읽어온다.
		System.out.println(++i); //6
		System.out.println("--------------------");
		
		//증가연산자를 변수명 뒤에 명시하면 변수 값을 우선 읽어온 후에 값을 1 증가시킨다.
		System.out.println(i++); //6
		//i값을 먼저 불러와서 6이라고 출력
		// 그러나 메모리 공간에 1이 증가된 값으로 들어가서 i를 한 번 더 출력.
		 System.out.println(i); // 7이 출력된다.
		 
		 System.out.println("--------------------");
		 //감소연산자
		 
		 int j = 10;
		 //감소연산자를 변수명 앞에 명시하면 변수값을 1 감소시킨 후 감소된 값을 읽어옴
		 System.out.println(--j); //9
		 
		 System.out.println("--------------------");
		 //감소연산자를 변수명 뒤에 명시하면 변수 값을 우선 읽어온 후에 값을 1 감소시킨다.
		 System.out.println(j--); //9
		 System.out.println(j); //8
		 
		 
	}

}
