package kr.s11.object.constructor;

class Student {
	int kor; int eng; int math;
	int history; int science;
	int num;  // 과목수

	//3과목
	public Student(int k , int e, int m) {
		kor = k; eng = e; math = m;
		num = 3; //과목 수 지정
	}

	//5과목
	public Student (int k, int e, int m, int h, int s) {
		kor = k ; eng = e; math = m; history = h; science = s;
		num = 5; // 과목 수 지정
	}

	public int getTotal() {
		int total;
		if(num == 3) {
			total = kor + eng + math;
		}
		else {
			total = kor + eng + math + history + science;
		}

		return total;
	}

	public int getAvg() {
		return getTotal () / num;
	}


}

public class StudentMain {
	public static void main(String[] args) {
		//3과목 시험보기
		Student s1 = new Student(90, 97, 95);

		System.out.printf("합계 = %d점%n" , s1.getTotal());
		System.out.printf("평균 = %d점%n" , s1.getAvg());

		System.out.println("-------------------------------");
		
		// 5과목 시험보기
		Student s2 = new Student(88, 82, 84, 87, 90);

		System.out.printf("합계 = %d점%n" , s2.getTotal());
		System.out.printf("평균 = %d점%n" , s2.getAvg());
	}

}
