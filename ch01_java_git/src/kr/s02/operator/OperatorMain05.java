package kr.s02.operator;

public class OperatorMain05 {

	public static void main(String[] args) {
		
		//입력 작업 시작
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("국어 : ");
		// 입력된 정수를 변수에 대입
		int kor = input.nextInt(); //입력 받은 점수를 korean에 저장한다. input.nextInt(); -> 입력받는 함수
		
		System.out.print("영어 : ");
		int eng = input.nextInt(); 
		
		System.out.print("수학 : ");
		int math = input.nextInt();
		
		// 총점 구하기
		int sum = kor+eng+math;
		// 평균 구하기
		//double avg = sum / 3; -> 평균의 소수점 자리가 나타나지 않음, 형변환이 필요함 
		double avg = sum / 3.0;
		
		System.out.println("-------성적표-------");
		System.out.printf("국어 : %d%n", kor);
		System.out.printf("영어 : %d%n", eng);
		System.out.printf("수학 : %d%n", math);
		System.out.printf("총점 : %d%n", sum);
		System.out.printf("평균 : %.2f%n", avg);
		
		input.close();
		//입력 작업 끝
	}

}
