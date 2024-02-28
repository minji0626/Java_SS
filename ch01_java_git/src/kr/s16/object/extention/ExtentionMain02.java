package kr.s16.object.extention;

//부모 클래스
class People extends Object {
	public void eat() {
		System.out.println("식사하다");
	}
}

//자식 클래스 
class Student extends People {
	public void study () {
		System.out.println("공부하다");
	}
}

public class ExtentionMain02 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.eat(); //people의 메소드를 상속 받아서 호출
		s.study(); //student의 메소드
		System.out.println(s.toString()); //Object의 메소드를 상속받아서 호출
	}

}
