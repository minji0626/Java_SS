package kr.s19.object.finaltest;

class Me {
	int var = 100;
	//메소드에 final 을 지정하면 자식 클래스에서 매소드 오버라이딩이 불가능하다.
	public final void setVar(int var) {
		this.var = var;
	}
}

public class FinalMain02 extends Me{
	
/* 부모클래스의 final 매소드는 재정의가 불가능하다! 상속은 가능하다!
	@Override
	public void setVar(int var) {
		System.out.println(var);
	}
*/	
	
	public static void main(String[] args) {
		FinalMain02 fm = new FinalMain02();
		fm.setVar(500);
		System.out.println(fm.var); // 변경됨
	}

}
