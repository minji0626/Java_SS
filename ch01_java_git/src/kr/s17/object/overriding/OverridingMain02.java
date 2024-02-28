package kr.s17.object.overriding;

//부모 클래스
class Mother{
	public String getLunch() {
		return "밥";
	}
}

//자식 클래스
class Son extends Mother{}

class Daughter extends Mother{
	//메소드 오버라이딩(메소드 재정의)
	@Override
	public String getLunch() {
		return "빵";
	}
}


 


public class OverridingMain02 {

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("아들은 " + s.getLunch() + "을 먹습니다.");
		
		Daughter d = new Daughter();
		System.out.println("딸은 " + d.getLunch() + "을 먹습니다.");

	}

}
