package kr.s17.object.overriding;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//일반 계좌 생성
		BankAccount ba = new BankAccount("123-456" , "1234" , "이동욱", 10000000L);


		//계좌 정보 출력
		ba.printAccount();
		
		//입금하기
		System.out.print("얼마를 입금하시겠습니까? > ");
		long money = input.nextLong()	;
		ba.deposit(money);
		System.out.println();
		ba.printAccount();
		
		//출금하기
		System.out.print("얼마를 출금하시겠습니까? > ");
		money = input.nextLong();
		ba.withdraw(money);
		System.out.println();
		ba.printAccount();
		
		input.close();
	}

}
