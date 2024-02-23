package kr.s04.array;

public class ArrayMain11 {

	public static void main(String[] args) {
		/*
		 [실습]
		 double형인 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성하시오.

		 [입력 예시]
		 요소의 수 > 3
		 a[0] = 2.2 //input.nextdouble 이용
		 a[1] = 2.2
		 a[3] = 3.3

		 [출력 예시]
		 모든 요소의 합은 7.7입니다. System.out.println();
		 모든 요소의 평균은 2.57입니다. System.out.printf(); 소수점 둘째자리까지 표시
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);

		double sum = 0;
		//double avg = 0;

		System.out.print("요소의 개수를 정해주세요. >");
		int num = input.nextInt();		

		double[] a = new double[num]; //double형 배열 선언

		for(int i = 0; i < a.length; i++) {
			System.out.print("a["+ i + "] = ");
			a[i] = input.nextDouble();
			sum += a[i];
			//avg = sum / a.length;
			//double input_a = input.nextDouble();
			//sum += input_a;
		}
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
		//System.out.printf("모든 요소의 평균은 %.2f입니다." , avg);
		System.out.printf("모든 요소의 평균은 %.2f입니다." , (sum / a.length) );
		input.close();

	}

}
