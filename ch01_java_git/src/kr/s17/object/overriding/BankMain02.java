package kr.s17.object.overriding;
import java.util.Scanner;


public class BankMain02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//계좌 생성 , 계좌 정보 출력
		MinusAccount ma = new MinusAccount("567-8910" , "5678", "이수혁" , 10000L , 100000L );
		ma.printAccount();
		
		//예금하기
		System.out.print("얼마를 입금하시겠습니까? > ");
		long money2 = input.nextLong();
		ma.deposit(money2);
		System.out.println();
		ma.printAccount();
		
		//출금하기
		System.out.print("얼마를 출금하시겠습니까? > ");
		money2 = input.nextLong();
		ma.withdraw(money2);
		System.out.println();	
		ma.printAccount();
		
		input.close();
	}

}
