package kr.s23.object.inter;

//인터페이스 : 형식만 있고 내용이 없음

interface A2 {
	// 추상메소드
	public abstract void abc (); 
	void def(); //public abstract 생략된 형태
}

class B2 implements A2 {
	//인터페이스에 추상메소드를 구현한다
	@Override
	public void abc() {
		System.out.println("abc 메소드");
	}
	@Override
	public void def() {
		System.out.println("def 메소드");
	}
}

public class InterfaceMain02 {
	public static void main(String[] args) {
		B2 bp = new B2 ();
		bp.abc();
		bp.def();
	}

}
