package kr.s20.object.lang;

class Car {
	private String name;
	public Car(String name) {
		this.name = name;
	}
	//Object의 toString 재정의
	@Override
	public String toString () {
		return name;
	}
}


public class ObjectMain02 {
	public static void main(String[] args) {
			Car c1 = new Car("스포티지");
			System.out.println(c1.toString());
			//System.out.println(c1);
	System.out.println("-------------------");
	
	Car c2 = new Car ("소나타");
	System.out.println(c2);
	
	}
}
