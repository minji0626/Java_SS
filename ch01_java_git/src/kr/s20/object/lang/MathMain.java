package kr.s20.object.lang;

public class MathMain {
	public static void main(String[] args) {

		//절대값 구하기 
		int a = Math.abs(-10);
		System.out.println("a 절대값 : " + a);
		
		//소수점 자리수 올림 처리
		double b = Math.ceil(3.3);
		System.out.println("b 소수점 자리 올림 : " + b);
		
		//소수점 자리 버림 처리
		double c = Math.floor(3.7);
		System.out.println("c 소수점 자리 버림 : " + c );
		
		//소수점 자리 반올림 => 정수로 반환하기 때문에 정수의 결과값을 냄
		int d = Math.round(3.7f);
		System.out.println("d 소수점 자리 반올림 : " + d );
		
		//최대값 구하기
		int e = Math.max(3, 5);
		System.out.println("최대값 구하기 : " + e);
		
		//최소값 구하기
		int f = Math.min(4, 7);
		System.out.println("최소값 구하기 : " + f);
	}

}
