package kr.s03.operation;

public class WhileMain07 {

	public static void main(String[] args) {
		
		// 은행프로그램 만들기
		java.util.Scanner input = new java.util.Scanner(System.in);

		long balance = 0L; //잔고
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("  1. 예금  |  2. 출금  |  3. 잔고 확인  |  4. 종료  ");
			System.out.println("-----------------------------------------------");
			
			System.out.print("메뉴를 선택하세요 > ");
			int num = input.nextInt();
			
			if(num == 1) {
				System.out.print("얼마를 예금하시겠습니까?>");
				balance += input.nextLong();
			}
			
			else if (num == 2) {
				System.out.print("얼마를 출금하시겠습니까? > ");
				balance -= input.nextLong();
			}
			
			else if (num == 3) {
				System.out.printf("현재 계좌의 잔고는 %,d원 입니다.%n" , balance);
			}
			
			else if (num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			else {
				System.out.println("잘못 입력하였습니다.");
			}				
		}
		
		input.close();

	}

}
