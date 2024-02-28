package kr.s17.object.overriding;

class GrandParent{
	public String getCar() {
		return "구형 자동차";
	}
	
}

class Father extends GrandParent{
	//Method Overriding (메서드 재정의)
	//상속관계에서 자식 클래스에 메소드 재정의를 하면 부모클래스의 메소드가 호출되는 것이 아니라 자식 클래스의 메소드가 호출된다.
	//@Override 어노테이션은 메소드 재정의 문법에 맞게 재정의가 되었는지를 검증하는 역할 수행, 문법에 맞게 재정의 되지 않으면 컴파일 오류가 발생한다.
	@Override
	public String getCar() {
		return "신형 자동차";
	}
}

class Oncle extends GrandParent {

}

public class OverridingMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father ft = new Father();
		System.out.println("아버지는" + ft.getCar() + "를 좋아해요");
	
		Oncle on = new Oncle();
		System.out.println("삼촌은" + on.getCar() + "를 좋아해요");
		
	}

}
