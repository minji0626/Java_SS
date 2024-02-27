package kr.s11.object.constructor;

class Car {
	String color;
	String gearType;
	int door;
	
	//생성자 , 기본 생성자는 생략 가능
	public Car() {}
		
	}

public class CarMain01 {

	public static void main(String[] args) {
		//생성자는 객체 생성시 단 한 번만 실행되고 객체 생성 이후에는 호출이 불가능하다
		// 멤버 변수를 초기화하는 역할을 수행한다.
		
		Car c1 = new Car ();
		System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
		
		//객체의 멤버 변수에 값을 할당
		c1.color = "red";
		c1.gearType = "Auto";
		c1.door = 5;
		System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);

	}

}
