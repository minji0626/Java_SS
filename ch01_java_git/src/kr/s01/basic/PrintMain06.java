package kr.s01.basic;

public class PrintMain06 {

	public static void main(String[] args) {
		/*
		 * [실습]
		 * System.out.printf()를 이용하여 아래와 같이 출력하시오.
		 * 
		 * [출력 예시]
		 * 국어 : 98점
		 * 영어 : 97점
		 * 총점 : 195점
		 * 평균 : 97.5점 -> 실수이기 때문에 %d가 아닌 %f를 써야한다. 
		 * 그리고 소수점 첫째자리까지 나타내면 되기 때문에 %.1f가 된다.
		 */
		
		//1번 방법
		System.out.printf("%s : %d점%n", "국어", 98);
		System.out.printf("%s : %d점%n", "영어", 97);
		System.out.printf("%s : %d점%n", "총점", 195);
		System.out.printf("%s : %.1f점%n", "평균", 97.5);
		System.out.println("----------------------");
		
		//2번 방법
		System.out.printf("국어 : %d점%n", 98);
		System.out.printf("영어 : %d점%n", 97);
		System.out.printf("총점 : %d점%n", 195);
		System.out.printf("평균 : %.1f점%n", 97.5);
		System.out.println("----------------------");
		
		//3번 방법
		System.out.printf("국어 : %d점%n영어 : %d점%n총점 : %d점%n평균 : %.1f점",98,97,195,97.5);
		
		
		
	}

}
