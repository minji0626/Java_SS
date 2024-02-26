package kr.s06.object.instance;

public class InstanceMain {
	//클래스의 기본 구조
	// 멤버 필드 (속성)
	int var1; //멤버 변수
	String var2; //멤버 변수
	
	//생성자, 생략 가능하며 생략하면 컴파일시 자동 생성
	public InstanceMain() {}
	
	//멤버 메서드(동작)
	 					// 데이터를 받는 것 , 함수 안으로 들어가는 입구 역할
	public int sum(int a, int b) {
		// 데이터가 연산되고 뽑아내는 역할
		// 함수를 빠져나가는 출구 역할
		return a+ b;
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		InstanceMain im = new InstanceMain();
		//객체의 멤버 변수에 값을 할당
		im.var1 = 100;
		im.var2 = "서울";
		
		//객체의 멤버 변수 값 호출
		System.out.println(im.var1 + ", " + im.var2);
		
		//객체의 메서드 호출
		int result = im.sum(10, 20); // 값을 넘기는것임 직접 데이터 입력함
		System.out.println("result = "+ result);
		
		
	}

}
