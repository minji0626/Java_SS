package kr.s27.collection;

import java.util.*;
import java.io.*;

public class ProductMain {
	//멤버 변수 정의
	ArrayList<Product> list;
	BufferedReader br; // 입력 받기

	//생성자 명시
	public ProductMain() {

		list = new ArrayList<Product> () ;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}
		catch(Exception e) {
			e.printStackTrace(); //예외 정보
		}
		finally {
			if( br != null) {
				try { br.close(); } catch(IOException e) { }
			} //IF
		}

	}

	// 메뉴 호출
	public void callMenu() throws IOException {

		while ( true ) {
			System.out.print("  1. 상품 입력  |  2. 상품 목록 보기  |  3. 종료  > ");
			try {
				// String --> int
				int num = Integer.parseInt(br.readLine());

				if (num ==1 ) { // 상품 입력
					input();
				}

				else if ( num == 2) { // 상품 목록 보기
					output();
				}

				else if ( num ==3) { // 종료
					System.out.println("프로그램을 종료합니다. 다음에 다시 이용해주세요.");
					break;
				}

				else {
					System.out.println("잘못 입력하셨습니다.");
				}

			} 
			// 숫자외의 것이 입력 되었을 때의 예외 상황
			catch (NumberFormatException e) {
				System.out.println("숫자만 허용됩니다.");
			}

		}

	}

	//상품 정보 입력
	public void input() throws IOException{

		Product p = new Product();

		System.out.print("상품명 > ");
		p.setName(br.readLine()); //br.readLine 은 무조건 String으로 받는다!
		System.out.print("상품 번호 > ");
		p.setNum(br.readLine());
		System.out.print("상품 가격 > ");
		p.setPrice(Integer.parseInt(br.readLine())); // String으로 받았기 때문에 숫자로 변환 시켜준다!
		System.out.print("제조사 > ");
		p.setMaker(br.readLine());
		System.out.print("상품 재고 > ");
		p.setStock(Integer.parseInt(br.readLine()));
		
		//Product 를 ArrayList 에 저장
		list.add(p) ;
		System.out.println("상품 정보 1건이 추가되었습니다.");

	}

	// 상품 정보 출력
	public void output() {
		System.out.println();
		System.out.printf("상품 리스트 : 총 상품 수 ( %d ) %n" , list.size());
		System.out.printf("상품명\t  상품번호\t  상품가격\t  제조사\t   상품재고%n");
		System.out.println("----------------------------------------------------------------");
		
		// 반복문을 이용한 요소의 출력
		/*
		for ( int i = 0 ; i < list.size() ; i ++ ) {
			Product pt = list.get(i);
			System.out.printf("%s\t" , pt.getName());
			System.out.printf("%s\t" , pt.getNum());
			System.out.printf("%,d원\t" , pt.getPrice());
			System.out.printf("%s\t" , pt.getMaker());
			System.out.printf("%d개%n" , pt.getStock());
			System.out.println();
		}
		*/

		// 확장 for문을 이용한 요소의 출력
		for(Product pt : list ) {
			System.out.printf("%s\t" , pt.getName());
			System.out.printf("%s\t" , pt.getNum());
			System.out.printf("%,d원\t" , pt.getPrice());
			System.out.printf("%s\t" , pt.getMaker());
			System.out.printf("%d개%n" , pt.getStock());
		}
		
		
		
		
	}

	public static void main(String[] args) {

		// 객체 생성
		new ProductMain(); 




	}
}
