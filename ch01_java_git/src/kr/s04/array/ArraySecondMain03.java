package kr.s04.array;

public class ArraySecondMain03 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		//과목명
		String[] course = {"국어", "영어", "수학"};

		//인원수
		System.out.println("인원 수를 입력해주세요 > ");
		int num = input.nextInt();
											// 인원수		과목수
											// 행의 길이	열의 길이
		int [][] score = new int [num] [course.length];

		//총점& 평균을 저장하는 배열
		int [] sum = new int [num];
		float [] avg = new float [num];

		// 성적을 입력 받고 총점과 평균을 구하기
								// 행의 길이
		for(int i = 0; i < score.length; i++) {
									// 열의 길이
			for(int j = 0; j < score[i].length; j++) {
				// 성적 입력 받음
				do {
					//과목명 출력
					System.out.print(course[j] + " = ");
					score[i][j] = input.nextInt();
				}
				while(score[i][j] < 0 || score[i][j] > 100);
				
				// 총점 구하기
				sum[i] += score[i][j];
			} //end of inner for
			
			//평균 구하기
			avg[i] = sum[i] / (float) score[i].length;
			System.out.println();
			
		}//end of outer for
		
		//총점 & 평균 출력
								// 인원수
		for (int i = 0; i < num; i ++) {
			System.out.println();
			System.out.printf("총점 = %d%n" , sum[i]);
			System.out.printf("평균 = %.2f%n" , avg[i]);
		}
		
		input.close();
	}

}
