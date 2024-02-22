package kr.s03.operation;

public class WhileMain02 {

	public static void main(String[] args) {
		
		//초기
		int sum = 0;
		int su = 1;
		
		//조건식
		while(su <= 100) {
			//누적
			sum += su;
			//증감식
			//su++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}

}
