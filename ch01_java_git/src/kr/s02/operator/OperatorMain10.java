package kr.s02.operator;

public class OperatorMain10 {

	public static void main(String[] args) {
		
		System.out.println("===조건 (삼항) 연산자===");
		
		int a = 5, b = 10;
		int max; //최대값을 저장하는 변수 선언
		int min; //최소값을 저장하는 변수 선언
		
		//최대값 구하기
		max = a > b ? a: b ;
		System.out.println("최대값은  " + max + "입니다.");
		System.out.println("max = " + max);
		
		//최소값 구하기
		min = a < b ? a: b ;
		System.out.println("최소값은  " + min + "입니다.");
		System.out.println("min = " + min);
		
		

	}

}
