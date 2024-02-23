package kr.s04.array;

public class ArrayMain09 {

	public static void main(String[] args) {
		//(테스트 조건)main에 전달할 데이터는 두 개의 정수
		
		//main의 인자로 데이터를 전달하면 전달한 데이터의 자료형은
		//모두 String으로 인식하기 때문에 + 연산이 되지 않고 문자열 연결이 된다.
		System.out.println(args[0] + args[1]);
		System.out.println("--------------------");
		
		// String -> int 문자열을 정수로 변환시켜주는 함수
		int num_1 = Integer.parseInt(args[0]);
		int num_2 = Integer.parseInt(args[1]);
		
		System.out.println("합계 : " + (num_1 + num_2 ));
	}

}
