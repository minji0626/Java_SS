package kr.s03.operation;

public class WhileMain04 {

	public static void main(String[] args) {
		/*
		 [실습]
		 입력받은 정수값부터 0까지 출력하는 프로그램을 작성하시오
		 (0보다 큰 수를 입력하고, 0이하를 입력하면 "0보다 큰 수를 입력하세요" 라고 출력한다.)

		 [입력 예시]
		 정수 입력: 3

		 [출력 예시]
		 3
		 2
		 1
		 0
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = input.nextInt();

		/* 내가 작성한 코드
		if (num<=0) {
			System.out.println("0보다 큰 수를 입력하세요.");
			System.exit(0);
		}

		while(num >=0)
		{  System.out.println(num--); }
		 */

		if(num>0) {
			while(num>=0) {
				System.out.println(num--);
			}}

		else {
			System.out.println("0보다 큰 수를 입력하세요.");}
		input.close();

	}

}
