package kr.s02.operator;

public class OperatorMain13 {

	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 키보드에서 입력한 정수값에 마지막 자리수를 제외한 값과 마지막 자리 수를 표시하시오.
		 * 
		 * [입력 예시]
		 *  정수값 : 123
		 *  
		 *  [출력 예시]
		 *  마지막 자릿수를 제외한 값 : 12
		 *  마지막 자릿수 : 3
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수값 : ");
		int num = input.nextInt();
				
		System.out.println("마지막 자릿수를 제외한 값 : " + num/10);
		System.out.println("마지막 자릿수 : " + num%10);
		
		input.close();
		
	}

}
 	