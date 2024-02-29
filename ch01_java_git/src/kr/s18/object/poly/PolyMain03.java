package kr.s18.object.poly;

/*
 * 다형성 (Polymorphism)
 * 객체지향개념에서 다형성이란 '여러 가지 형태를 가질 수 있는 능력'을 의미하며
 * JAVA에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써 다형성을 프로그램적으로 구현
 * 부모클래스타입의 참조변수로 자식클래스의 인스턴스를 참조할 수 있도록 하였음.
 * 
 */

//부모 클래스 
class Parent2 {
	public void make() {
		System.out.println("부모클래스의 make");
	}
}

//자식 클래스
class Child2 extends Parent2 {
	//매서드 재정의
	@Override
	public void make () {
		System.out.println("자식클래스의 make");
	}
}
public class PolyMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2 ();
		ch.make(); //메서드를 재정의했기 때문에 자식클래스의 make가 출력된다.
		
		//자식클래스타입 -> 부모클래스타입 형변환
		//업캐스팅 , 자동적으로 형변환
		//부모 영역으로 좁혀지기 때문에 부모 클래스의 make가 출력될 것이라고 생각했는데
		//출력은 재정의 된 자식클래스의 make가 출력되었다. => 메소드의 재정의가 더 강력하기 때문에 형변환을 시키더라도 메소드가 재정의된 부분이 더 강력하다
		//만약 재정의 되기 전의 값을 출력하려면 super을 이용하여 출력하는 것이 방법이다.
		Parent2 p = ch;  
		p.make();
	}

}
