package kr.s03.operation;

public class IfMain01 {

	public static void main(String[] args) {

		System.out.println("====단일  if문====");

		int n = 10;

		//단일 if 문: 조건이 true 이면 if 블럭 안의 수행문을 실행한다. 

		if(n > 5) {
			System.out.println("n은 5보다 크다.");
		}

		System.out.println("============");

		//if 문 블럭 내의 수행문이 한 줄이면 {} 생략이 가능하다.
		if(n < 5) 
			System.out.println("~~~~~~~~~~~");
		
		System.out.println("프로그램 종료!");

	}

}
