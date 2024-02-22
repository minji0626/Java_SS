package kr.s03.operation;

public class SwitchMain01 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("정수형 숫자 입력 : ");
		int a = input.nextInt();
		
		// switch 의 인자값은 long 지외한 정수형 ( byte, short, int ) , char, 문자열 사용 가능
		// 인자값과 조건값이 일치하는지 여부를 체크한다.
		switch(a) {
		
		case 1:
			System.out.println("1. 입력");
			break; //수행문을 실행한 후에 switch 블럭을 빠져나감
		
		case 2:
			System.out.println("2. 입력");
			break;
			
		case 3:
			System.out.println("3. 입력");
			break;
		
		default:
			System.out.println("1,2,3이 아닌 숫자 입력");

		}
				
		input.close();
	}

}
