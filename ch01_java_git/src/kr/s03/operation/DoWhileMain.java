package kr.s03.operation;

public class DoWhileMain {

	public static void main(String[] args) {
		
		int su = 0;
		String str = "Hello World";
		
		//선 처리 후 비교
		do {
			System.out.println(str); // 무조건 한 번 실행했기 때문에 일반 while보다 한 번 더 출력하게 된다.
		}
		while(su++ < 5);
		System.out.println("============");
		
		//선 비교 후 처리
		int su2 = 0;
		while(su2++ < 5) {
			System.out.println(str);
		}

	}

}
