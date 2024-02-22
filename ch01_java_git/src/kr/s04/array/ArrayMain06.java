package kr.s04.array;

public class ArrayMain06 {

	public static void main(String[] args) {
		// 문자열 배열
		String [] array = new String [3];

		array [0] = "JAVA" ; 
		array [1] = "Oracle";
		array [2] = "jsp";
		
		//반복문을 잉요한 배열의 요소 출력
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("==============");
		
		//확장 for문을 이요한 배열의 요소 출력
		for(String str : array) {
			System.out.println(str);
		}
	}

}
