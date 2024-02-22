package kr.s02.operator;

public class OperatorMain03 {

	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * 변수 선언시 자료형은 모두 int로 지정하고
		 * 변수 korean, english, math 를 선언하고 90,95,88로 초기화한다.
		 * 
		 * 총점을 구해서 변수 sum에 저장하고 평균을 구해서 변수 avg에 저장하시오
		 * 
		 * [출력 예시]
		 * 국어 : 90점
		 * 영어 : 95점
		 * 수학 : 88점
		 * 총점 :     점
		 * 평균 :     점   
		 * 
		 */
		
		int kor = 90, eng = 95 , math = 88;
		int sum = kor + eng + math; //총점 구하기
		int avg = sum / 3; // 평균 구하기(몫)
		
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		
	}

}
