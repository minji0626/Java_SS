package kr.s05.object.field;

public class Student02 {
	//멤버 필드 (속성)
		String name;
		int age;
		String hobby;
		
	public static void main(String[] args) {
		
		Student02 student = new Student02();
		//객체가 생성되면 객체의 멤버 변수는 기본값으로 초기화 됨
		System.out.println(student.name+", " + student.age + ", " + student.hobby);
		System.out.println("--------------------");
		
		//객체의 멤버 변수에 값 할당
		student.name = "이동욱";
		student.age = 42;
		student.hobby = "연기";
		
		System.out.println(student.name+", " + student.age + ", " + student.hobby);
		
		
	}

}
