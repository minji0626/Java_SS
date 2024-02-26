package kr.s08.object.method;

import javax.xml.transform.sax.SAXSource;

//은행 프로그램

class Account{
	//  멤버 변수
	String account_num; //계좌번호
	String name; //예금주
	int balance; //잔고

	// 멤버 메소드

	//예금하기
	public void deposit (int money) {
		balance += money; // 잔고에 money 추가하기
	}

	//출금하기
	public void withdraw (int money) {
		balance -= money; // 잔고에서 money 빼기
	}

	//계좌 정보
	public void printAccount () {
		System.out.println("계좌번호 > " + account_num);
		System.out.println("예금주 > " + name);
		System.out.printf("현재 잔고 > %,d원%n", balance);
	}

}

public class BankMain {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		//계좌 생성
		Account a = new Account();

		//계좌 기본 정보 입력
		System.out.println("계좌 기본 정보를 입력하여 계좌를 개설해주세요.");
		System.out.print("계좌 번호 > ");
		a.account_num = input.nextLine()	;
		System.out.print("예금주 > ");
		a.name = input.nextLine()	;

		System.out.println("현재 잔고 > ");
		a.balance = input.nextInt()	;

		System.out.println( a.name + " 님의 계좌가 개설되었습니다.");
	
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("  1 . 예금  |  2 . 출금  |  3 . 계좌 정보 | 4 . 종료  ");
			System.out.println("----------------------------------------------------");
			System.out.print("메뉴를 선택해주세요 >");
			int num = input.nextInt()	;

			if (num == 1) {
				System.out.print("얼마를 예금하시겠습니까? >");
				int deposit_num = input.nextInt();
				a.deposit(deposit_num);
				System.out.printf("%,d원 입금하여 현재 계좌 잔액은 %,d원입니다.%n", deposit_num, a.balance);
			}
			else if (num == 2) {
				System.out.print("얼마를 출금하시겠습니까? >");
				int withdraw_num = input.nextInt()	;
				a.withdraw(withdraw_num);
				System.out.printf("%,d원 출금하여 현재 계좌 잔액은 %,d원입니다.%n", withdraw_num, a.balance);
			}

			else if (num == 3) {
				System.out.println("계좌 정보를 출력하겠습니다.");
				a.printAccount();
			}
			else if (num == 4) {
				System.out.println("프로그램을 종료합니다!");
				break;
			}
			else {
				System.out.println("메뉴에 없는 번호입니다. 잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요!");
			}
			
		}
		input.close();
	}

}
