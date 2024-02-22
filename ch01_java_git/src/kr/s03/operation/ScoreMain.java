package kr.s03.operation;

public class ScoreMain {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		int kor, eng, math, sum;
		char grade;
		float avg; //실수 실수 연산하기!

		do {
			System.out.print("국어 : ");
			kor = input.nextInt();
		}
		while ( kor< 0 || kor >100 );
	

		do {
			System.out.print("영어 : ");
			eng = input.nextInt();
		}
		while ( eng < 0 || eng >100 );
		
		do {
			System.out.print("수학 : ");
			math = input.nextInt();
		}
		while ( math < 0 || math >100 );

		//총점 구하기
		sum = kor + eng + math ;
		//평균 구하기
		avg = sum / 3.0f  ;
		
		//등급 구하기
		switch((int) (avg / 10)) {
		case 10:
		case 9:
			grade = 'A'; break;
		
		case 8:
			grade = 'B'; break;
		
		case 7:
			grade = 'C'; break;
		
		case 6:
			grade = 'D'; break;
			 
		default:
			grade = 'F';
		}
		
		//성적표 출력하기
		System.out.println("총점은 " + sum+ "입니다.");
		System.out.printf("평균은 %.2f입니다.%n" , avg);
		System.out.printf("%c 학점입니다." , grade);
		
		input.close();


	}

}
