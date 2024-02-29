package kr.s20.object.lang;
import java.util.Scanner;
/*
[실습]
Scanner로 입력 받기
입력 받은 문자열을 한 문자씩 읽어서 역순으로 표시

[입력 예시]
문자열 : Hello

[출력 예시]
olleH
 */

public class StringMain04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. >");
		String str = input.nextLine();
		
		// 길이 - 1 !!
		for (int i = str.length() - 1;  i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
input.close();
	}

}
