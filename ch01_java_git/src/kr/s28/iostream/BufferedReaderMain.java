package kr.s28.iostream;
import java.io.*;

public class BufferedReaderMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
				//										문자스트림				<--표준입력
			br = new BufferedReader ( new InputStreamReader(System.in));
			System.out.print("당신의 이름 > ");
			String name =  br.readLine();
			System.out.println("당신의 이름은 " + name + "입니다.");
			System.out.print("당신의 나이 > ");
							// Strign --> int
			int age = Integer.parseInt(br.readLine());
			System.out.println("당신의 나이는 " + age + "살 입니다.");
			
		}
		catch(NumberFormatException e)	{
			System.out.println("숫자를 입력하세요");
		}
		catch(IOException e) {
			System.out.println("입력시 오류 발생");
		}
		finally {//자원정리
			if ( br != null) { try {br.close();} catch(IOException e) { } }
		}
	}
}
