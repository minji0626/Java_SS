package kr.s26.exception;
import java.io.*;

public class ExceptionMain06 {
	/*
	 * throws 예약어의 사용
	 * 메서드에 throws 예외 클래스를 명시하면 메소드 내에 try~catch 블럭을 생략하고
	 * 예외가 발생하면 예외를 임시 보관하고 메소드를 호출하는 곳에 try ~ catch 블럭이 있을 경우
	 * 그 곳으로 예외를 양도한다.
	 */
	
	public void printData() throws IOException , NumberFormatException{
		// 예외를 임시보관
		// 입력받을 준비 Scanner 대신 쓰는 애
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		System.out.print("단 입력 > ");
		
			// String -> int 변환
			int dan = Integer.parseInt(br.readLine()); // 한 라인에 입력한 데이터를 반환
			System.out.println(dan + "단");
			System.out.println("---------------------");
		
			for( int i = 1 ; i <= 9; i ++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}

	}
	public static void main(String[] args) {
		ExceptionMain06 em = new ExceptionMain06();
		try { 
			em.printData();
		}
		catch(IOException e) {
			System.out.println("입력시 오류 발생");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}
	}
}
