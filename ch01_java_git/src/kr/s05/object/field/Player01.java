package kr.s05.object.field;

public class Player01 {
	
	String name;
	int age;
	
	public static void main(String[] args) {
		// 객체 선언 및 생성
		//Player01 player;
		//player = new Player01();
		Player01 p =new Player01();
		// 자료형				// 클래스 명과 같음(생성자)

		p.name = "대니 구";
		p.age = 32;
		
		System.out.println("연주자의 이름은 " + p.name + "입니다.");
		System.out.println("연주자의 나이는 " + p.age + "입니다.");
	}

}
