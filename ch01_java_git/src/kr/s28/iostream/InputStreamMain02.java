package kr.s28.iostream;
import java.io.*;

public class InputStreamMain02 {

	public static void main(String[] args) {
		
		int input = 0;
		
		try {
			// 명시적으로 -1을 만들려면 ctrl + Z 
				while ( (input = System.in.read()) != -1) {
					System.out.println(input + " , " + (char)input);
				}
				System.out.println("프로그램 종료");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
