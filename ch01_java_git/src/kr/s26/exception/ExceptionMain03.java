package kr.s26.exception;

public class ExceptionMain03 {

	public static void main(String[] args) {
		// 예외 처리
		try {
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력한 데이터가 없습니다.");
		}
		System.out.println("프로그램 종료");
		
	}

}
