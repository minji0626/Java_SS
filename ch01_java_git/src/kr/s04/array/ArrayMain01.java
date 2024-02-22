package kr.s04.array;

public class ArrayMain01 {

	public static void main(String[] args) {
		//배열 선언
		char [] ch; // char [] => 배열의 자료형
		//배열 생성
		ch = new char [4]; // char [4] => 배열의 길이를 의미함 방이 4개! 
		//마지막 index의 수는 (길이 - 1) 을 구하면 알 수 있음
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		// 배열의 요소 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		//반복문을 이용한 배열의 요소 출력
		for (int i = 0; i < 4; i++) {
						//4는 배열의 길이
			System.out.println("ch[" + i + "] : " + ch[i]);
			
		}
		
		//배열의 선언 및 생성
		int[] it = new int[6];
		
		// 배열의 선언 및 생성(명시적 배열 생성), 초기화
		char[] ch2 = new char[] {'J','a','v','a'};
		//배열의 선언 및 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'자', '바'};
 		
	}

}
