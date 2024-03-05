package kr.s25.object.inner;

public class StaticMain {
	//static 내부 클래스
	//static 내부 클래스를 포함한 클래스를 먼저 객체 생성하는 것이 아니라 static 내부 클래스를 단독으로 객체 생성하여 사용한다.
	public static class Inner{
		//인스턴스 변수
		int iv = 100;
		//static 변수
		static int cv = 200;
		
		//static 메소드
		public static void make() {
			System.out.println("HAHAHAHA");
			}
	}

	public static void main(String[] args) {
		//StaticMain s = new StaticMain();
		//StaticMain.Inner si = s.new Inner();
		
		//static 내부 클래스 객체 생성
		Inner i = new Inner ();
		
		//인스턴스 변수 호출
		System.out.println(i.iv);
		
		// static 변수 호출
		System.out.println(Inner.cv);
		
		//static 메소드 호출
		Inner.make();
	}

}
