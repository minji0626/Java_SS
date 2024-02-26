package kr.s05.object.field;

public class Student03 {
	// 멤버 필드
	String name;
	int age;
	String hobby;
	String job;

	public static void main(String[] args) {
		//객체 선언 및 생성
		Student03 student = new Student03();

		//객체의 멤버 변수에 값 할당
		student.name ="이동욱";
		student.age = 42;
		student.hobby ="요리";
		student.job = "배우";

		System.out.println(student.name + ", " + student.age +", " + student.hobby +", " 
				+ student.job);
		System.out.println("----------------------");

		Student03 student2 = new Student03();
		student2.name = "공유";
		student2.age = 43;
		student2.hobby = "캠핑";
		student2.job = "연예인";

		System.out.println(student2.name + ", " + student2.age + ", " + student2.hobby 
				+ ", " + student2.job);
	}

}
