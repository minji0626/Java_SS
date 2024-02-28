package kr.s16.object.extention;

//부모 클래스
class A {
	int x = 100;
	private int y = 200;
	
	public int getY() {
		return y;
	}
	
}

class B extends A {
	int z = 300;
	 
}


public class ExtentionMain03 {

	public static void main(String[] args) {
		 B bp = new B();
		 System.out.println(bp.x);
		System.out.println(bp.getY());  //private에 있어서 상속은 받았지만 사용할 수 없기 때문에 getY() 호출
		System.out.println(bp.z);
	}

}
