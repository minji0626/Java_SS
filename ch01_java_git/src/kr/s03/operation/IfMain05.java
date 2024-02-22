package kr.s03.operation;

public class IfMain05 {

	public static void main(String[] args) {
		/*
		 [실습]
		 정수 하나를 입력하여 짝수면 10을 더하고 홀수면 20을 더해서 결과값을 출력해라
		 
		 [입력 예시]
		 정수 하나 입력: 5
		 
		 [출력 예시]
		 결과 : 25
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int result;
		result = 0;
		
		System.out.print("정수 하나 입력 : ");
		int num = input.nextInt();
		
		if( num %2 == 0 ) {
			result = num + 10;
		}
		else if (num %2 == 1){
			result = num + 20;
		}
		
		System.out.printf("결과 : %d%n" , result);
		
		input.close();


	}

}
