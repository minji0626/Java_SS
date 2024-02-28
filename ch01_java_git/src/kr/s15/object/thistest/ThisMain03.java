package kr.s15.object.thistest;

public class ThisMain03 {
	
	//생성자
	public ThisMain03 () {
		/*
		 * 생성자 내부에서 또다른 생성자를 호출할 때 this()를 표시한다
		 * 반복적인 코드를 제고하고 코드를 재사용하기 위해 또 다른 생성자를 호출하여 동작시킨다.
		 */
		
		//this() 전에 코드를 실행하면 오류가 발생한다
		//System.out.println("----------");
		this("여름");
		System.out.println("----------");
	}
	
	public ThisMain03(String msg) {
		System.out.println(msg);
	}

	public ThisMain03(int a) {
									// int -> String
		this(String.valueOf(a));
	}
	
	public static void main(String[] args) {
		
		ThisMain03 tm1 = new ThisMain03();
		ThisMain03 tm2 = new ThisMain03("겨울");
		ThisMain03 tm3 = new ThisMain03(50000);
		
		
		
	}

}
