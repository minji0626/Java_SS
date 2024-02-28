package kr.s15.object.thistest;

/*
 [실습]
 Animal 정의
 1) 멤버 변수 : 이름(String name), 나이(int age), 비행 여부(boolean fly) - 은닉화 private  O
 2) 멤버 메소드 : public set/get 메소드 정의
 3) 생성자 :  인자가 있는 생성자, 인자가 없는 생성자

 AnimalMain 정의
 인자가 있는 생성자를 이용해서 객체를 생성한다.
 이름, 나이, 비행여부를 출력한다.
 비행 여부는  true / false -> 가능 / 불가능 으로 출력한다.

인자가 없는 생성자를 이용하여 객체를 생성한다.
이름, 나이, 비행여부를 설정한다.
이름, 나이, 비행 여부를 출력한다. 비행 여부는 가능 / 불가능 으로 출력한다.
 */

public class Animal {
	//멤버 변수 은닉화
	private String name;
	private int age;
	private boolean fly;

	//생성자
	public Animal() {}
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
}
