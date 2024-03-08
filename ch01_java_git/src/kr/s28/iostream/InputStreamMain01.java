package kr.s28.iostream;
import java.io.*;

public class InputStreamMain01 {
	public static void main(String[] args) {
		System.out.print("영문자 1개 입력 : ");
		try {
			//문자 하나를 입력 받아서 아스키 코드로 반환
			int a = System.in.read();
			System.out.println(a + "," + (char)a);
			
			System.in.read(); //enter 처리 \r : 13
			System.in.read(); //enter 처리 \n : 10
					
			System.out.print("숫자 1개 입력 : ");
			int b = System.in.read();
			System.out.println("입력한 숫자의 아스키 코드 : " + b);
			
			System.in.read(); //enter 처리 \r : 13
			System.in.read(); //enter 처리 \n : 10
			
			
			System.out.print("숫자 1개 입력 : ");
			int c = System.in.read() - 48 ;
			System.out.println("입력한 숫자 : " + c);

		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
