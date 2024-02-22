package kr.s02.operator;

public class OperatorMain06 {

	public static void main(String[] args) {
				
		System.out.println("====비교 (관계) 연산자====");
		
		boolean result;
		int a =10;
		double b = 10.5;
		
		result = a < b;
		System.out.println(" a < b : " + result); //비교 연산자는 boolean으로 나타냄
		
		result = a > b;
		System.out.println(" a > b : " + result);
		
		result = a >= b;
		System.out.println(" a >= b : " + result );

		result = a <= b;
		System.out.println("a <= b : " + result);
		
		result = a == b; // 같다
		System.out.println("a == b : " + result);
		
		result = a != b; // 같지 않다
		System.out.println(" a != b : " + result);
	}

}
