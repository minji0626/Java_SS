package kr.s39.jdbc.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopUserMain {

	private BufferedReader br;
	private ShopDAO shop;

	public ShopUserMain() {
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
			System.out.print(" 1. 회원 등록 | 2. 회원 상세 | 3. 상품 구매 | 4. 구매 내역 | 5. 종료 > ");
			try {
				int no = Integer.parseInt(br.readLine());

				if (no == 1) { // 회원 등록
					System.out.print("회원 아이디 : ");
					String cust_id = br.readLine();
					System.out.print("회원 이름 : ");
					String cust_name = br.readLine();
					System.out.print("회원 주소 : ");
					String cust_address = br.readLine();
					System.out.print("전화번호 : ");
					String cust_tel = br.readLine();
					
					shop.insertCustomer(cust_id, cust_name, cust_address, cust_tel);
				} 
				else if( no == 2) { // 회원 상세
					System.out.print("회원 아이디 : ");
					String cust_id = br.readLine();
					shop.selectDetailCustomer(cust_id);
				}
				else if( no == 3) { // 상품 구매
					System.out.print("회원 아이디 : ");
					String cust_id = br.readLine();
					
					System.out.print("상품 번호 : ");
					int item_num = Integer.parseInt(br.readLine());
					
					shop.insertOrder(cust_id, item_num);
				}
				else if (no == 4) { // 구매 내역
					System.out.print("회원 아이디 : ");
					String cust_id = br.readLine();
					shop.selectOrdersById(cust_id);
				}
				else if ( no == 5) { // 종료
					System.out.println("사용자 프로그램을 종료하겠습니다.");
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
		new ShopUserMain();
	}

}
