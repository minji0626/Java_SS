package kr.s18.object.poly;

//부모 메소드
class A {
	public void make () {
		System.out.println("make Method");
	}
}

//자식 메소드
class B extends A {
	public void play () {
		System.out.println("play Method");
	}
}


public class PolyMain02 {
	public static void main(String[] args) {
		B bp = new B();
		bp.make();
		bp.play();
		
		//업캐스팅 | 자식클래스타입 -> 부모클래스타입 형변환
		A ap = bp;
		ap.make();
		
		// 호출 범위를 벗어나서 호출이 불가능하다  => ap.play();
		
		//다운캐스팅 (명시적 형변환) | 부모클래스타입 -> 자식클래스타입 형변환
		B bp2 = (B) ap;
		bp2.make();
		bp2.play();
	}

}
