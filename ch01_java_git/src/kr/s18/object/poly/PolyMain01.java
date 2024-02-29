package kr.s18.object.poly;

//부모 클래스
class Parent {
	int a = 100;
}

//자식 클래스
class Child extends Parent {
	int b = 200;
}

public class PolyMain01 {

	public static void main(String[] args) {
		//참조자료형 = class 명과 같음 : child
		//형변환이 가능함
		Child ch = new Child () ;
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch; //자식 클래스 타입에서 부모 클래스 타입으로 형변환되었다 
		//ch : 주소가  p를 지정	//업캐스팅, 자동적으로 형변환

		System.out.println(p.a); 
		//System.out.println(p.b); -> 호출 불가
		//호출 범위를 벗어나서 호출이 불가능하다.
		
		// 크기를 늘려줘야하기 때문에 명시적 변환을 사용해야 오류가 발생하지 않는다.
		//Child ch2 = p;
		//부모클래스타입 -> 자식클래스타입 형변환
		//다운캐스팅, 명시적으로 형변환
		Child ch2 = (Child)p;
		System.out.println(ch2.a);
		System.out.println(ch2.b);
	}
	
}