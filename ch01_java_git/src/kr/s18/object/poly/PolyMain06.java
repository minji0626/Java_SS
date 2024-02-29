package kr.s18.object.poly;

// 부모 클래스
class Car {
	String color;
	int door;
	public void drive () {
		System.out.println("운전하다!");
	}

	public void stop() {
		System.out.println("정지하다!");
	}
}

//자식 클래스
class FireEngine extends Car {

	public void water() {
		System.out.println("물을 뿌리다!");	
	}
}

public class PolyMain06 {
	public static void main(String[] args) {
			FireEngine fe = new FireEngine();
			
			if (fe instanceof FireEngine) {
				System.out.println("FireEngine 객체입니다!");
			}
			
			if (fe instanceof Car) {
				System.out.println("Car 객체입니다!");
			}
			
			if (fe instanceof Object) {
				System.out.println("Object 객체입니다!");
			}
	}

}