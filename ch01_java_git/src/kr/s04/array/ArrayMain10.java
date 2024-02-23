package kr.s04.array;

public class ArrayMain10 {

	public static void main(String[] args) {
		/*
		 [실습]
		 1) 10,20,30,40,50 을 초기값으로 갖는 1차원 배열을 test 이름으로 선언, 생성, 초기화 하시오.
		 2) 반복문을 이용해서 출력하시오.
		 3) 확장 for문을 이용하여 출력하시오.
		 4) index 3의 데이터를 100으로 변경하시오.
		 5) 마지막 요소의 값을 200으로 변경하시오. 
		 6) 반복문을 사용하여 모든 요소의 값을 0으로 초기화하시오.
		 7) 홀수 인덱스에 10, 짝수 인덱스에 20을 저장하시오.
		 8) 모든 요소의 총합과 평균(총합을 요소의 수로 나눔) 을 구하시오.
		 */
		// 배열의 선언, 생성, 초기화
		int [] test = {10,20,30,40,50};
		System.out.print(test[0] + "\t");
		System.out.print(test[1]+ "\t");
		System.out.print(test[2]+ "\t");
		System.out.print(test[3]+ "\t");
		System.out.println(test[4]);
		System.out.println("-------------------");

		//반복문을 이용한 출력
		for(int i = 0; i < test.length; i++) {
			System.out.println("test[" + i + "] = " + test[i]);
		}
		System.out.println("-------------------");

		//확장 for문을 이용한 출력
		for(int num : test) {
			System.out.println(num);
		}
		System.out.println("-------------------");

		//index 3의 데이터를 100으로 변경
		test[3] = 100;
		//마지막 요소의 값을 200으로 변경
		test[test.length -1] = 200;
		for(int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		System.out.println("-------------------");

		// 반복문을 사용하여 모든 요소의 값을 0으로 초기화
		for(int i = 0; i < test.length; i++) {
			test[i] = 0;
			System.out.println(test[i]);
		}
		System.out.println("-------------------");

		//홀수 인덱스에 10 저장, 짝수 인덱스에 20저장
		for(int i = 0; i < test.length; i ++) {

			if (i % 2 == 0) {
				test[i] = 20;
			}
			else if (i % 2 == 1) {
				test[i] = 10;
			}
			System.out.println(test[i]);
		}
		System.out.println("-------------------");

		//모든 요소의 총합과 평균
		int sum = 0;
		float avg = 0;

		for(int i = 0; i < test.length; i++) {
			sum += test[i];
			avg = sum / (float) test.length;	
		}
		System.out.printf("모든 요소의 총합: %d%n" , sum);
		System.out.printf("모든 요소의 평균: %.1f" , avg);
	}

}
