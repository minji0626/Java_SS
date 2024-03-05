package kr.s23.object.inter;

//인터페이스 : 형식만 있고 내용이 없음

interface CookieMold {//쿠키틀
	// 추상 메소드
	public abstract void makeStar();
	public abstract void makeCircle();
	public abstract void makeDiamond();
}

class Cookie implements CookieMold {
// 인터페이스가 형식을 제공하면 클래스에서 제공된 형식을 이용해 내용을 채운다.	
	@Override
	public void makeStar() {
		System.out.println("Star shaped Cookie!");
	}
	
	@Override
	public void makeCircle() {
		System.out.println("Circle shaped Cookie!");
	}
	
	@Override
	public void makeDiamond() {
		System.out.println("Diamond shaped Cookie!");
	}
}

public class InterfaceMain03 {
	public static void main(String[] args) {
		
		Cookie c = new Cookie ();
		
		c.makeStar();
		c.makeCircle();
		c.makeDiamond();
		
		
	}

}
