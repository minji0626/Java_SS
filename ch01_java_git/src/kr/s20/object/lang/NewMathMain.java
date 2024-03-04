package kr.s20.object.lang;
import java.util.Random;
import java.util.Scanner;

public class NewMathMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] item = {"가위" , "바위" , "보"};
								// 0		1		 2

		while(true) {
			System.out.println("--------------------------------");
			System.out.println("   1. Game   |    2. Exit   ");
			System.out.println("--------------------------------");
			System.out.print(" Menu > ");
			int num = input.nextInt()	;

			if (num == 1) {
				System.out.println("Game Start!");
				System.out.println("0 : 가위 | 1 : 바위 | 2 : 보");
				System.out.print("가위 바위 보 ! > ");

				int user = input.nextInt()	; // 사용자가 입력하는 숫자
				if ( 0 < user || 2 < user) {
					System.out.println("Wrong number. Try Again.");
					continue;
				}

				int computer = (int) (Math.random() * 3);
				/*
				 * 컴퓨터 - 사용자 = 결과
				 * 0			0		 0		무
				 * 0			1		-1		사용자 승
				 * 0			2		-2		컴퓨터 승
				 * 1			0		 1		컴퓨터 승
				 * 1			1		 0		무
				 * 1			2		-1		사용자 승
				 * 2			0		 2		사용자 승
				 * 2			1		 1		컴퓨터 승
				 * 2			2		 0		무
				 * 
				 */
				int result =  computer - user;
				System.out.println("-> 컴퓨터 : " + item[computer] + " , 사용자 : " + item[user]);

				System.out.println("결과 : ");
				if (result == - 1 || result == 2) {
					System.out.println("사용자 승리");
				}
				else if(result == -2 || result == 1) {
					System.out.println("컴퓨터 승리");
				}
				else 
					System.out.println("무승부");
				
			}
				else if (num == 2) {
					System.out.println("Exit the Program. Have a nice day!");
					break;
				}

				else 
					System.out.println("This is wrong number.");
				

			}
		
		input.close();
	}
}

