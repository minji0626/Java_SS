package kr.s03.operation;

public class SwitchMain04 {

	public static void main(String[] args) {
		
		/*
		 [실습]
		 두 개의 정수와 연산자를 입력한 후 연산의 결과를 출력하시오.
		 
		 [입력 예시]
		 첫번째 수 : 10
		 연산자: + 
		 두번째 수: 20
		 
		 [출력 예시]
		 10 + 20 = 30
		 */
		
		int result = 0;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int first = input.nextInt();
		System.out.print("연산자 : ");
		String operator = input.next();
		System.out.print("두번째 수 : ");
		int second = input.nextInt();
		
		if (operator.equals("/"))
		{ if(second!=0) {  // 두번째 수가 0이 아니라면~
				result = first / second;}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);}
		}
		
		if (operator.equals("%"))
		{ if(second!=0) {  // 두번째 수가 0이 아니라면~
				result = first / second;}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);}
		}
		
		switch (operator){
		
		case  "+":
			result = first + second;
			break;
		
		case  "-":
			result = first - second;
			break;
			
		case  "*":
			result = first * second;
			break;
			
		case  "/":
			result = first / second;
			break;
			
		case  "%":
			result = first % second;
			break;
			
		default:
			System.out.println("잘못된 연산자가 입력되었습니다.");
			System.exit(0);
		}
		
		System.out.println();
		System.out.printf(" %d %s %d = %d" , first, operator, second, result);
		input.close();
		
	}

}
