package kr.s03.operation;

public class ForMain05 {

	public static void main(String[] args) {

		//2~9단까지 출력하기 위해 다중 for 문 사용

		for(int dan = 2; dan<=9; dan++) {
			//dan : 구구단의 단 2~9단
			System.out.println("** " + dan + "단 **");

			for(int i = 1; i<=9; i++) {
				//i 는 곱해지는 수 1~9까지
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}

		}

	}

}
