package kr.s04.array;

public class ArrayMain07 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);


		String[] course = {"국어" , "영어", "수학"};
		int [] score = new int[course.length]; // 0 : 국어 1: 영어 3: 수학

		int sum = 0;
		float avg =0.0f;

		// 반복문을 이용하여 입력 처리
		for(int i = 0; i < score.length; i++) {
			//입력값을 0~100 만 가능하도록 조건을 만들어준다.
			do {
				System.out.print(course[i] + "=");
				score[i] = input.nextInt();
			}

			while(score[i]<0 || score[i]>100);

			sum += score[i];

		}
		// 평균 구하기
		avg = sum / (float) (course.length);

		System.out.println();


		//과목의 점수 출력
		for(int i = 0; i<score.length; i++) {
			//과목 명 ,점수
			System.out.printf("%s = %d%n", course[i], score[i]);
		}
		System.out.printf("총점은 %d입니다.%n",sum);
		System.out.printf("평균은 %.2f입니다.", avg);

		input.close();
	}

}
