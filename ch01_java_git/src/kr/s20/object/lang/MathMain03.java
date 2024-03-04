package kr.s20.object.lang;
import java.util.Scanner;
import java.util.Random;

/*
[실습]
가위 바위 보 게임을 진행한다.
 
[입력 예시]
가위 바위 보 입력 > ( 0. 가위 , 1. 바위 , 2. 보) 1
 
[출력 예시]
컴퓨터 : 가위 , 입력자 : 바위
결과 : 입력자 승리
 */

public class MathMain03 {
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
				
				double ran = Math.random(); // 컴퓨터 난수
				int index = (int)(ran * 3);
				Random com = new Random();
				index = com.nextInt(3);
				
				System.out.print("컴퓨터 : " + item[index] + ", ");
				System.out.println("사용자 : " + item[user]);
				
				/*
				처음 시도해본 코드 -----			
				if (user == 0 && index == 1) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("컴퓨터가 승리하였습니다!");
				}
				else if (user == 0 && index == 2) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("사용자가 승리하였습니다!");
				}
				else if (user == 0 && index == 0) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("비겼습니다!");
				}
				else if (user == 1 && index == 0) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("사용자가 승리하였습니다!");
				}
				else if (user == 1 && index == 1) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("비겼습니다!");
				}
				else if (user == 1 && index == 2) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("컴퓨터가 승리하였습니다!");
				}
				else if (user == 2 && index == 0) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("컴퓨터가 승리하였습니다!");
				}
				else if (user == 2 && index == 1) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("사용자가 승리하였습니다!");
				}
				else if (user == 2 && index == 2) {
					System.out.println("사용자 : " + item[user]);
					System.out.println("비겼습니다!");
					}
				---- 검색하고 직접 적용하여 만든 코드
				 */
			if( item[user].equals("가위") ) {
				if (index == 0) {
					System.out.println("비겼습니다!");
				}
				if (index == 1) {
					System.out.println("컴퓨터가 승리하였습니다!");
				}
				if (index == 2) {
					System.out.println("사용자가 승리하였습니다!");
				}
			}
			
			if ( item[user].equals("바위") ) {
				if (index == 0) {
					System.out.println("사용자가 승리하였습니다!");
				}
				if (index == 1) {
					System.out.println("비겼습니다!");
				}
				if (index == 2) {
					System.out.println("컴퓨터가 승리하였습니다!");
				}
			}
			
			if ( item[user].equals("보") ) {
				if (index == 0) {
					System.out.println("컴퓨터가 승리하였습니다!");
				}
				if (index == 1) {
					System.out.println("사용자가 승리하였습니다!");
				}
				if (index == 2) {
					System.out.println("비겼습니다!");
				}
			}
	
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
