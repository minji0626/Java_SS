package kr.s04.array;

public class Arraymain03 {

	public static void main(String[] args) {
		//배열 선언 및 생성 (암시적 배열 생성), 초기화
		int [] array = {10,20,30,40,50};
		
		//반복문을 이용한 배열의 요소 출력
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println("\n------------------------");
		
		//확장 for문을 이용한 배열의 요소 출력
		for(int num : array) {
			System.out.print(num + "\t");
		}
	}

}
