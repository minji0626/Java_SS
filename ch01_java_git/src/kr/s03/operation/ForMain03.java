package kr.s03.operation;

public class ForMain03 {

	public static void main(String[] args) {
	
		int sum = 0; //변수를 선언하고 초기화 시킨다. 
		
		for(int i = 1; i <=100; i++) {
			//누적 작업
			sum += i; //sum 안에다가 누적 작업을 하는 것이다. 1 ~ 100까지
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		
		System.out.println("--------------------------------------------");
		
		
		int total = 0;
		
		/*for (int i = 1; i<=100; i+=2) {
			
			total += i;
		}*/
		
		for(int i = 1; i<=100; i++) {
			if (i % 2 == 0) {
				total += i;
			}
			
		}
		
		System.out.println("1부터 100까지 짝수의 합 : " + total);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
