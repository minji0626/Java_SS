package kr.s26.exception;

public class ExceptionMain05 {
	public static void main(String[] args) {
		//try~catch~finally
		// finally 영역은 예외가 발생하든 밣생하지 않든 무조건 수행하는 부분
		
		System.out.println("=====예외 미발생 경우=====");
		
		try {
			System.out.println(1);
			System.out.println(2);
		}
		catch (Exception e) {
			System.out.println(3);
		}
		finally {
			System.out.println(4);
		}
		System.out.println();
		
		
		System.out.println("=====예외 발생 경우=====");
		try {
			System.out.println("1");
			System.out.println(10/0); // 예외 발생!
			System.out.println("2");	// 미실행
		}
		catch (Exception e) { // 예외 발생 후 바로 넘어옴
			System.out.println("3");
		}
		finally { // 예외 실행, 미실행과 관련 없이 무조건 실행
			System.out.println("4");
		}
		
	}
}
