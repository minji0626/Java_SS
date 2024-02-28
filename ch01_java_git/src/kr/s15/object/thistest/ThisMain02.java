package kr.s15.object.thistest;

class ThisTest{
	// 은닉화
	private int a; //멤버 변수
	// 캡슐화
	public void setA(int a) { //지역 변수
	// 멤버변수 = 지역변수
		this.a = a; 
	}
	public int getA() {
		return a; //멤버변수
	}
}

public class ThisMain02 {
	
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(10);
		System.out.println(tt.getA());
	}

}
