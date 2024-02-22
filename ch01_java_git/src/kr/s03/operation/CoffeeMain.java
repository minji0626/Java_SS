package kr.s03.operation;

public class CoffeeMain {

	public static void main(String[] args) {
		/*
		 [실습]
		 동전을 넣고 커피를 주문하면 커피를 판매하는 자판기 프로그램
		 자판기는 자판기 보유 동전(1000), 커피 (10), 프림(10), 설탕(10)을 보유하고 있고
		 커피를 주문할 때 마다 자판기 보유 동전 - 거스름돈, 커피 5, 프림 3, 설탕 1씩 차감이 된다.
		 0이 되면 판매를 중단한다.

		 [입력 및 출력 예시]
		 동전을 넣어주세요. 커피 가격은 400원입니다. : 500
		 거스름돈은 100원입니다.
		 맛 좋은 커피가 준비되었습니다.

		 or
		 동전을 넣어주세요. 커피 가격은 400원입니다. :300
		 투입한 동전이 부족합니다! (고객이 투입한 동전이 커피 가격보다 작으면 해당 문구 실행)

		 or
		 동전을 넣어주세요. 커피 가격은 400원 입니다. : 2000
		 거스름돈이 부족합니다! (자판기 보유 동전이 부족하면 해당 문구 실행)

		 or
		 동전을 넣어주세요. 커피 가격은 400원 입니다. : 500
		 커피가 부족합니다! (커피 부족하면 해당 문구 실행)
		 설탕이 부족합니다! (설탕 부족하면 해당 문구 실행)
		 프림이 부족합니다! (프림 부족하면 해당 문구 실행)
		 
		 ======== 현재 자판기 정보 ===========
		 커피 양 :		 
		 프림 양: 		
		 설탕 양 :		
		 자판기 보유 동전 금액 : 900원
		 투입한 동전 금액 : 500원
		 ============================  
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);

		int price = 400; // 커피 가격

		//커피 한 잔에 들어갈 양
		int content_coffee = 5;
		int content_cream = 3;
		int content_sugar = 1;

		int coffee = 10 , cream = 10 , sugar = 10; // 보유 커피, 프림, 설탕

		int balance; //거스름돈
		int payment; // 고객이 낸 동전

		int amount = 0; //투입한 금액이 누적되는 곳
		int coin = 1000; // 자판기 보유 동전

		while(true) {
			System.out.println("==== 커피 자판기 ====");
			System.out.print(" 1 . 커피        2 . 종료 >");

			int num = input.nextInt();

			if(num==1) {
				
				System.out.print("동전을 넣어주세요. 커피 가격은 400원입니다. > ");
				payment = input.nextInt();
				balance = payment - price;	
				
					if (payment < price) {
						System.out.println("투입한 동전이 부족합니다!");
					}
					
					else if (coin < payment) {
						System.out.println("거스름돈이 부족합니다!");
					}
					
					else if (coffee < content_coffee) {
						System.out.println("커피가 부족합니다!");
					}
					else if (cream < content_cream) {
						System.out.println("크림이 부족합니다!");
					}
					else if (sugar < content_sugar) {
						System.out.println("설탕이 부족합니다!");
					}
					else if (payment >= price)  {
						System.out.printf("거스름돈은 %d원입니다. %n커피가 완성되었습니다.%n맛있게 드세요.%n" , balance);
						coffee -= content_coffee;
						cream -= content_cream;
						sugar -= content_sugar;
						amount += payment;
						coin -= balance;
						System.out.println("====== 현재 자판기 정보 ======");
						System.out.printf("커피 양 : %d%n" , coffee);
						System.out.printf("프림 양 : %d%n" , cream);
						System.out.printf("설탕 양 : %d%n" , sugar);
						System.out.printf("자판기 보유 동전 금액 : %d%n" , coin);
						System.out.printf("투입된 동전 금액 : %d%n", amount);
						System.out.println("=====================");
					}

			}

			
			else if (num == 2) { 
				System.out.println("자판기 이용이 종료되었습니다."); 
				System.out.println("다음에도 이용해 주세요!"); 
				break; 
			}

			else {
				System.out.println("잘못 입력하였습니다.");
			}
			
		}
		input.close();

	}

}
