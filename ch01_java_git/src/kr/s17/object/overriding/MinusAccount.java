package kr.s17.object.overriding;
/*
 [실습]
 한도를 의미하는 minusLimit (long type) 멤버 변수를 정의한다.
 BankAccount를 상속 받는다.
 생성자에서 number, password, name, balance, minusLimit을 전달 받아서 멤버 변수에 저장한다.
 withdraw , printAccount 메소드 재정의
 */
// 상속 받기
public class MinusAccount extends BankAccount {
	// 멤버 변수 정의하기
	protected long minusLimit ;
	//멤버변수 저장하기
	public MinusAccount (String number , String password , String name, long balance , long minusLimit) {
		// 상속 받은 멤버 변수 super 이용하여 저장하기
		super(number, password, name, balance);				
		this.minusLimit = minusLimit;
	}
	
	// 출금하기 재정의
	@Override
	public void withdraw(long amount) {
		if (amount <= 0) {
			System.out.println("0원 보다 큰 금액을 출금해주세요.");
			return;
		}
		if (balance + minusLimit < amount){
			System.out.println("한도 초과로 출금이 불가능합니다.");
			return;
		}
		balance -= amount ;
		System.out.printf("%,d원 출금하셨습니다. 현재 잔액은 %,d원 입니다." ,  amount , balance);
	}
	
	//계좌정보 출력 재정의
	@Override
	public void printAccount () {
		System.out.println("(마이너스) 계좌 번호 : " + number);
		System.out.println("비밀번호 : " + password);
		System.out.println("예금주 : " + name);
		System.out.printf("계좌 잔액 : %,d원%n" , balance);
		System.out.printf("마이너스 한도 : %,d원%n" , minusLimit);
		System.out.println("===========================");
	}
}
