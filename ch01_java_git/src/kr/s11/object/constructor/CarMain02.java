package kr.s11.object.constructor;

class Car2 {
	String color;
	String gearType;
	int door;
	// 생성자 오버로딩
	// 생성자를 여러개 정의하는데 인자의 타입과 개수, 배치 순서를 기준으로 생성자를 구분
	public Car2() {}
	
	public Car2(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
}


public class CarMain02 {

	public static void main(String[] args) {
		//객체 선언 및 생성
		Car2 car2 = new Car2();
		car2.color = "Gold";
		car2.gearType = "Auto";
		car2.door = 4;
		
		Car2 car3 = new Car2("Black" , "Manual" , 4);
		System.out.println(car2.color + " , " + car2.gearType + " , " + car2.door);
		System.out.println(car3.color + " , " + car3.gearType + " , " + car3.door);
	}

}
