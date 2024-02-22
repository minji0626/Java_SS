package kr.s02.operator;

public class OperatorMain04 {

	public static void main(String[] args) {
		
		/*
		 * [숙제]
		 * pinos71@daum.net 보내주세요.
		 * 
		 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 
		 * 학생당 몇 개를 가질 수 있고 최종적으로 몇 개가 남는지를 구하시오.
		 * 
		 * [출력 예시]
		 *  학생 한 명이 가지는 연필 수 : 17
		 *  남은 연필 수 : 24
		 * 
		 */
		
		int pen = 534;
		int student = 30;
		int quantity = pen / student;
		int rest = pen % student;
		
		System.out.println("학생 한 명이 가지는 연필 수 : " + quantity);
		System.out.println("남은 연필 수 : " + rest);
		

	}

}
