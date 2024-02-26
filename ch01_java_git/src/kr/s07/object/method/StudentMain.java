package kr.s07.object.method;

public class StudentMain {
	
	//멤버 필드 (속성)
	String name;
	int kor;
	int eng;
	int math;

	//멤버 메서드 (동작)
	//총점 구하기
	public int makeSum() {
		return kor+eng+math;
	}
	
	//평균 구하기
	public int makeAvg() {
		return makeSum() / 3;
	}
	
	//등급 구하기
	public String makeGrade() {
		String grade;
		switch(makeAvg() / 10) {
		case 10 :
		case 9 :
			grade = "A";
			break;
		case 8 :
			grade="B";
			break;
		case 7 :
			grade="C";
			break;
		case 6 :
			grade="D";
			break;
		default :
			grade = "F";
			
		}		
		return grade;
	}
	//성적 출력용 메소드
	public void printScore() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + makeSum());
		System.out.println("평균 : " + makeAvg());
		System.out.println("등급 : " + makeGrade());
	}
	
	public static void main(String[] args) {
		StudentMain student = new StudentMain();
		student.name = "이동욱";
		student.kor = 98;
		student.eng = 97;
		student.math = 96;
		
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math);
		System.out.println("총점 : " + student.makeSum());
		System.out.println("평균 : " + student.makeAvg());
		System.out.println("등급 : " + student.makeGrade());
		System.out.println("----------------------------------");
		
		StudentMain student2 =  new StudentMain();
		student2.name = "이수혁";
		student2.kor = 91;
		student2.eng = 99;
		student2.math = 79;
		
		System.out.println("이름 : " + student2.name);
		System.out.println("국어 : " + student2.kor);
		System.out.println("영어 : " + student2.eng);
		System.out.println("수학 : " + student2.math);
		System.out.println("총점 : " + student2.makeSum());
		System.out.println("평균 : " + student2.makeAvg());
		System.out.println("등급 : " + student2.makeGrade());
		System.out.println("----------------------------------");
		
		StudentMain student3 =  new StudentMain();
		student3.name = "차은우";
		student3.kor = 92;
		student3.eng = 99;
		student3.math = 80;
		student3.printScore();
	
	}

}
