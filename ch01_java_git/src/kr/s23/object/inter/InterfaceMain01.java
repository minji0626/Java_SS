package kr.s23.object.inter;

//인터페이스
interface A1 {
	public static final int W = 10; 	//원형
	int X = 20;				  //public static final 생략
	static int Y = 30;		 //생략된 형태 ----> 상수
	final int Z = 40;		//생략된 형태 ---> 상수
}

public class InterfaceMain01 {
	public static void main(String[] args) {
		//인터페이스는 객체 생성이 불가능하다.
		//A1 ap = new A1();
		//X는 상수이기 때문에 변경이 불가능하다.
		//A1.X = 50;
		
		System.out.println("W : " + A1.W);
		System.out.println("X : " + A1.X);
		System.out.println("Y : " + A1.Y);
		System.out.println("Z : " + A1.Z);
	
	}

}
