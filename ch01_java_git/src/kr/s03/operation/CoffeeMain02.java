package kr.s03.operation;

public class CoffeeMain02 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		int price = 400; // 커피 가격

		//커피 한 잔에 들어갈 양
		int content_coffee = 5;
		int content_cream = 3;
		int content_sugar = 1;

		int coffee = 10 , cream = 10 , sugar = 10; // 보유 커피, 프림, 설탕
		int change;
		int payment; // 고객이 낸 동전

		int amount = 0; //투입한 금액이 누적되는 곳
		int coin = 1000; // 자판기 보유 동전

		while(true) {
			System.out.println("==== 커피 자판기 ====");
			System.out.print(" 1 . 커피        2 . 종료 >");

			int num = input.nextInt();

			if(num==1) {
				System.out.print("동전을 넣으세요 (커피값" + price + "원):");
				payment = input.nextInt();

				//거스름돈 계산
				change = payment - price;

				//커피 구매 가능하기 때문에 연산
				coffee -= content_coffee; //커피 차감
				cream -= content_cream; //커피 차감
				sugar -= content_sugar; //커피 차감
				coin -= change; //거스름돈 차감
				amount += payment; // 투입 금액 누적

				System.out.printf("거스름돈 : %,d원%n" , change);
				System.out.println("맛 좋은 커피가 준비되었습니다.");

				System.out.println("====== 현재 자판기 정보 ======");
				System.out.printf("커피 : %d%n" , coffee);
				System.out.printf("프림 : %d%n" , cream);
				System.out.printf("설탕 : %d%n" , sugar);
				System.out.printf("자판기 보유 동전 금액 : %d%n" , coin);
				System.out.printf("투입된 동전 금액 : %d%n", amount);
				System.out.println("=====================");
			}

				else if (num == 2) { 
					System.out.println("자판기 이용이 종료되었습니다."); 
					System.out.println("다음에도 이용해 주세요!"); 
					break; 
				}

				else 
					System.out.println("잘못 입력하였습니다.");
			}
			input.close();
		}
	}
