package kr.s03.operation;

public class IfMain02 {

	public static void main(String[] args) {
		
		System.out.println("==== if ~ else ====");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수형 데이터 한 개 입력 : ");
		int a = input.nextInt();
		
		// if ~ else
		// 조건이 true 이면 if 블럭의 수행문을 실행 
		// 조건이 false 이면 else 블럭의 수행문을 수행
		if(a % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		else {
			System.out.println("홀수입니다.");
		}
		

		input.close();

	}

}
