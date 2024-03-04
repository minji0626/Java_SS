package kr.s22.object.abs;

// 추상 클래스
abstract class A2 {
	private int x ;
		public void setX ( int x ) {
			this.x = x;
		}
		public int getX () {
			return x;
		}
		
		// 추상 메소드
		public abstract void make();
}

// 자식 클래스
class B2 extends A2 {
	// 부모 클래스의 추상메소드를 구현
		public void make()	{
			System.out.println("make");
		}
}
public class AbstractMain02 {
	public static void main(String[] args) {
		 B2 bp = new B2();
		 bp.make();
	}

}
