package kr.s25.object.inner;

class Outer2 {
	// Outer2의 멤버 변수
	private int x = 100;
	//내부 클래스
	class Inner2 {
		private int y = 200;
		
		public void make() {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}


public class MemberMain02 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2 ();
		Outer2.Inner2 oi = ot.new Inner2();
		oi.make();
		}
}

