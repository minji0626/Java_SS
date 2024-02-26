package kr.s05.object.field;

public class Student04 {
		String name;
		int age;
		
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student04 s1 = new Student04();
		s1.name = "장영실" ;
		s1.age = 15;
		System.out.println(s1.name +", " + s1.age);
		// 객체의 참조값 출력
		System.out.println(s1);
		
		System.out.println("-------------------------------------------");
		
		Student04 s2 = new Student04();
		s2.name = "을지문덕";
		s2.age = 30;
		System.out.println(s2.name +", " + s2.age);
		//객체의 참조값
		System.out.println(s2);
	}

}
