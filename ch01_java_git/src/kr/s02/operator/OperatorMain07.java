package kr.s02.operator;

public class OperatorMain07 {

	public static void main(String[] args) {
		
		System.out.println("====논리 연산자===");
		
		boolean a, b, result;
		a = true;
		b = false;
		
		// 논리곱 (&&)
		//주어진 조건들이 모두 true 일 때 결과값이 true 가 된다.
		result = a && b;
		System.out.println(" a && b : " + result);
		
		//논리합 (||)
		//주어진 조건 중 하나라도 true 이면 결과값이  true 가 된다.
		result = a || b;
		System.out.println(" a || b : " + result);
		
		//부정(!)
		// true 를 부정하면 false, false 를 부정하면 true
		result = !a;
		System.out.println(" !a : " + result);
		

	}

}
