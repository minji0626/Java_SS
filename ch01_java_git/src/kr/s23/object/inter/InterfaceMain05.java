package kr.s23.object.inter;

interface Inter1 {
	public int getA ();
}

interface Inter2 {
	public int getB();
}

//인터페이스를 인터페이스에 상속
interface Inter3 extends Inter1, Inter2 {
	public int getData (); // 추상메소드가 포함된것처럼 인식한다
}

interface Inter4 {
	public String getMsg();
}
// 인터페이스를 클래스에 다중 구현 가능
// 다중 상속은 불가능하다.
public class InterfaceMain05 implements Inter3 , Inter4{
		@Override
		public int getA () {
			return 10;
		}
		
		@Override
		public int getB	() {
			return 20;
		}
		
		@Override
		public int getData () {
			return 30;
		}
		
		@Override
		public String getMsg () {
			return "Seoul";
		}
	public static void main(String[] args) {
		
		InterfaceMain05 im = new InterfaceMain05();
		 System.out.println(im.getA());
		 System.out.println(im.getB());
		 System.out.println(im.getData());
		 System.out.println(im.getMsg());
	}

}
