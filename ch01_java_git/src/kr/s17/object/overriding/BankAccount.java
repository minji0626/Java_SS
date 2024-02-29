package kr.s17.object.overriding;


public class BankAccount {
	protected String number ;
	protected String password;
	protected String name;
	protected long balance;

	
	// 생성자
	public BankAccount(String number, String password , String name , long balance) {
		// 멤버 변수 =  지역 변수
		this.number = number;
		this.password = password;
		this.name = name;
		this.balance = balance;
		
		System.out.println(number + " 계좌가 개설되었습니다.");
		
	}
	
	// 예금하기
	public void deposit(long amount) {
		if(amount <=0 ) {
			System.out.println("0원 이하의 금액은 입금이 불가능합니다.");
			return;
		}
			balance += amount ;
			System.out.printf(  "%,d원 입금되었습니다. 현재 잔액은 %,d원 입니다.%n" , amount , balance);
	}
	
	//출금하기
	public void withdraw(long amount) {
		if (amount <= 0 ) {
			System.out.println("0원 이하의 금액은 출금이 불가능합니다.");
			return;
		}
		if ( balance < amount) {
			System.out.println("잔액이 부족합니다. 출금 실패");
			return;
		}
		balance -= amount;
		System.out.printf(  "%,d원 출금되었습니다. 현재 잔액은 %,d원 입니다.%n" , amount , balance);
	}
	
	//계좌 정보 출력하기
	public void printAccount () {
		System.out.println("(일반) 계좌 번호 : " + number);
		System.out.println("비밀번호 : " + password);
		System.out.println("예금주 : " + name);
		System.out.printf("계좌 잔액 : %,d원%n" , balance);
		System.out.println("===========================");
	}
	

}
