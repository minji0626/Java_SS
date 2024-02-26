package kr.s07.object.method;

public class MethodMain01 {
	// 반환하는 데이터가 있는 경우
	// 반환하는 데이터의 자료형(반환형) : int	
	// 메서드명 : add	
					 // 입구 | a, b => 인자
	public int add(int a , int b) {
		//출구  //반환하는 데이터
		return a + b;
	}
		public void print (String str) {
			System.out.println(str);
		}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain01 method = new MethodMain01();
		
		//객체의 멤버 메서드 호출
		int result = method.add(5, 8);
		System.out.println("result = " + result);
		
		method.print("오늘은 월요일");
	}

}
