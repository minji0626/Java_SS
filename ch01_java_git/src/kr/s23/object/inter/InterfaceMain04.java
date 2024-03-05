package kr.s23.object.inter;

interface I {
	public abstract void play();
	
}

class	Pianist implements I {
	@Override
	public void play () {
		System.out.println("Playing the piano");
	}
}

class Cellist implements I {
	@Override 
	public void play() {
		System.out.println("Playing the Cello");
	}
}

class Stage {
	public void autoPlay (I i) {
							// 인터페이스 전달 ---> Pianist , Cellist => I
		i.play();
	}
}

public class InterfaceMain04 {
	public static void main(String[] args) {
		
		Stage s = new Stage(); // stage 호출 ...
												// Pianist  -> I
		s.autoPlay(new Pianist ());	// 클래스 타입 -> 인터페이스 타입 형변환
												// 자동적으로 형변환
												// Cellist -> I
		s.autoPlay(new Cellist());		// 클래스 타입 -> 인터페이스 타입 형변환
	}											// 자동적으로 형변환

}
