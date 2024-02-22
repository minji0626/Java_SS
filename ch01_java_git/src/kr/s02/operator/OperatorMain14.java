package kr.s02.operator;

public class OperatorMain14 {

	public static void main(String[] args) {
		
		/*
		 * [실습]
		 * A전자대리점에서는 그날 물건 판매액의 15%를 할인해주기로 했습니다.
		 * 판매한 상품명과 상품의 단가와 수량을 입력해서 지불 금액을 출력하는 프로그램을 작성하시오.
		 * (단, 출력 시에는 소수점 이하는 절삭하세요.)
		 * 
		 * [입력 및 출력 예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 냉장고 3대의 가격은 1,275,000원
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("상품명 입력 : ");
		String item = input.nextLine();
		
		System.out.print("단가 입력 : ");
		int price = input.nextInt();
		
		System.out.print("판매 수량 입력 : ");
		int quantity = input.nextInt();
		
		int total = (int) (quantity * price * 0.85) ;
		
		System.out.printf("%s %d대의 가격은 %,d원" , item, quantity, total);
		
		input.close();

		
	}

}
