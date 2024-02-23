package kr.s04.array;

public class ArraySecondMain02 {

	public static void main(String[] args) {
		
		int[][] score = {{99, 98, 97}, {89, 72, 88}, {99, 97, 92} , {81,92,99} , {99,90,79}};
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==================");
								// 행의 길이
		for(int i =0; i < score.length; i++) {
			int sum = 0;
			System.out.print("  " + (i+1) + "  ");
								//	열의 길이
			for(int j = 0; j<score[i].length; j++){
				// 총점 구하기
				sum += score[i][j];
				
				// 과목 점수 출력
				System.out.print(score[i][j] + " ");
			}
			// 총점 출력 및 평균 출력
			System.out.println(sum + "  " + (sum/score[i].length) );
		}
		
	}
}