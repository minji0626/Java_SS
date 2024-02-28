package kr.s17.object.overriding;

class Mom {
	public String getLunch() {
		return "밥";
	}
}

class Daughter2 extends Mom {
	@Override
	public String getLunch() {
		return "빵";
	}
	public String getRice() {
		return super.getLunch();
	}
}

public class OverridingMain03 {

	public static void main(String[] args) {
		Daughter2 d2 = new Daughter2();
		
		System.out.println("딸은 " + d2.getLunch() + "을 먹습니다.");
		System.out.println("딸은 오늘은 왠지 " + d2.getRice() + "이 먹고 싶어졌다.");
	}

}
