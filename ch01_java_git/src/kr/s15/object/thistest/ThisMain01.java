package kr.s15.object.thistest;

public class ThisMain01 {
	
	//생성자
	public ThisMain01() {
		//this는 객체 내부에서 객체를 지칭할 때 사용할 수 있고 일종의
		//참조 변수 역할을 한다.
		//객체의 구성원 (필드, 메소드)을 호출할 때 사용
		System.out.println("객체 생성 : " + this);
		
	}
	
	public static void main(String[] args) {
		ThisMain01 tm = new ThisMain01();
		System.out.println("객체 생성 후 : " + tm);

	}

}
