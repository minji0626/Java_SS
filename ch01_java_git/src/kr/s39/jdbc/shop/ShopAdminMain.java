package kr.s39.jdbc.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopAdminMain {

	private BufferedReader br;
	private ShopDAO shop;
	public ShopAdminMain() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			shop = new ShopDAO();
			//메뉴 호출하기
			callMenu();
		}catch (Exception e) {
			e.printStackTrace();
		} finally { // 자원 정리
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}

	//메뉴 
	public void callMenu() throws IOException {
		while(true) {
			System.out.print(" 1. 상품 등록 | 2. 상품 목록 | 3. 회원 목록 | 4. 구매 목록 | 5. 종료 > ");
			try {
				int no = Integer.parseInt(br.readLine());

				if (no == 1) { // 상품 등록
					System.out.print("상품명 : ");
					String item_name = br.readLine();
					System.out.print("상품 가격 : ");
					int item_price = Integer.parseInt(br.readLine());
					shop.insertItem(item_name, item_price);
				} 
				else if( no == 2) {// 상품 목록 보기
					shop.selectItems();
				}
				else if( no == 3) {// 회원 목록 보기
					shop.selectCustomers();
				}
				else if( no == 4) {// 구매 목록 보기
					shop.selectOrders();
				}
				else if ( no == 5) {// 종료
					System.out.println("관리자 프로그램을 종료하겠습니다.");
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}

			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			} 
		}
	}

	public static void main(String[] args) {
		new ShopAdminMain();
	}

}
