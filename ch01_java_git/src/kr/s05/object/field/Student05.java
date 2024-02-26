package kr.s05.object.field;

public class Student05 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student05 student = new Student05();
		
		student.name = "홍길동";
		student.kor = 98;
		student.eng = 97;
		student.math = 95;
		
		//총점 구하기
		student.sum = student.kor + student.eng + student.math;
		//평균 구하기
		student.avg = student.sum / 3.0;
		
		//객체의 멤버 변수의 값 출력
		System.out.println("이름 : " + student.name);
		System.out.println("국어 :" + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math);
		System.out.println("총점 : " + student.sum);
		System.out.printf("평균 : %.2f" , student.avg);
		
	}

}
