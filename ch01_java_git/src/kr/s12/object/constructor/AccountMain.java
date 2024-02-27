package kr.s12.object.constructor;

public class AccountMain {

	String accountNo; //계좌 번호
	String ownerName; //예금주
	int balance; //잔고

	//생성자 *일치시켜야함
	public AccountMain(String a, String o,int b) {
		accountNo = a;
		ownerName = o;
		balance = b;
		System.out.println(ownerName + "님 계좌가 개설되었습니다.");
	}
	
	//입금하기
	public void deposit (int amount) {
		if(amount <= 0) {
			System.out.println("0원보다 큰 금액을 입력해주세요.");
			//void형 메소드에서 특정 조건일 때 메소드를 빠져나간다.(메소드 종료)
			return; // 함수가 종료되어 아래 코드 실행 안 함
		}
			balance += amount;
			System.out.println(amount + "원 입급되었습니다. 현재 계좌 잔액은" + balance+"입니다.");
	}
	
	//출금하기
	public void withdraw (int amount) {
		if (amount <= 0) { 
			System.out.println("0원은 출금이 불가능합니다. 더 큰 금액을 입력해주세요.");
			return ;
		}
		if (amount > balance) {
			System.out.println("계좌 잔액이 부족합니다. 다음에 다시 이용해주세요.");
			return;
		}
		balance -= amount;
		System.out.println(amount +"원 출금하였습니다. 현재 계좌 잔액은" + balance + "입니다.");
	}

	public static void main(String[] args) {
		//계좌 생성
		AccountMain account1 = new AccountMain("123-456" , "이동욱" , 10000);
		System.out.println("계좌 번호 : " + account1.accountNo);
		System.out.println("예금주 : " + account1.ownerName);
		System.out.printf("계좌 잔고 : %,d원%n", account1.balance);
		System.out.println("---------------------------------------");
		
		//예금하기
		account1.deposit(5000);
		//출금하기
		account1.withdraw(10000);
		
		System.out.println("==============================");
		AccountMain account2 = new AccountMain("123-4567-890" , "이수혁" , 1000000);
		System.out.println("계좌 번호 : " + account2.accountNo);
		System.out.println("예금주 : " + account2.ownerName);
		System.out.printf("계좌 잔고 : %,d원%n", account2.balance);
	}

}
