package kr.s14.object.statictest;

class StaticMethod{
	//인스턴스 변수
	String s1 = "행복";
	//static(클래스) 변수 
	static String s2 = "행운";

	//static 메소드
	public static String getString() {
		return s2; //호출하고 바로 메모리에 올라가기 때문에 오류가 생기지 않는다.
	}

}

public class StaticMain02 {
	public static void main(String[] args) {
		//Static 메소드는 객체 생성 없이 호출할 수 있고 
		//클래스명, 메소드명의 형태로 호출한다
		System.out.println(StaticMethod.getString());
		//static 변수는 클래스명, 변수명의 형태로 호출한다.
		System.out.println(StaticMethod.s2);

		//인스턴스 변수를 호출할 때는 먼저 객체 생성 후
		//참조 변수, 변수명의 형태로 호출한다.
		StaticMethod sm = new StaticMethod();
		System.out.println(sm.s1);
	}



}
