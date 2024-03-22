package kr.s37.jdbc.car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {
	private BufferedReader br;
	private CarDAO car;

	//생성자
	public CarMain() {

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			car = new CarDAO();

			//메뉴 호출하기
			callMenu();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}

	}


	//메뉴
	public void callMenu() throws IOException {
		while(true) {
			System.out.print("1. 자동차 정보 등록 | 2. 자동차 목록 보기 | 3. 자동차 상세 보기 | 4. 자동차 정보 수정 | 5. 자동차 정보 삭제 | 6. 종료 > ");
			try {
				int no = Integer.parseInt(br.readLine());
				if (no == 1) { // 자동차 정보 등록
					System.out.print("자동차명 : ");
					String name = br.readLine();
					System.out.print("자동차 번호 : ");
					String cnumber = br.readLine();
					System.out.print("자동차 색상 : ");
					String color = br.readLine();
					System.out.print("자동차 제조사 : ");
					String maker = br.readLine();
					System.out.print("자동차 가격 : ");
					int price = Integer.parseInt(br.readLine());
					
					car.insertCar(name, cnumber, color, maker, price);
				}
				else if(no == 2) {
					car.selectCar();
				}
				else if(no == 3) {
					System.out.print("선택한 자동차의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					
					car.selectDetailCar(num);
				}
				else if(no == 4) {
					System.out.print("수정할 자동차의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					car.selectDetailCar(num);
					System.out.println("==========");
					System.out.print("자동차명 : ");
					String name = br.readLine();
					System.out.print("자동차 번호 : ");
					String cnumber = br.readLine();
					System.out.print("자동차 색상 : ");
					String color = br.readLine();
					System.out.print("자동차 제조사 : ");
					String maker = br.readLine();
					System.out.print("자동차 가격 : ");
					int price = Integer.parseInt(br.readLine());
					
					car.updateCar(num, name, cnumber, color, maker, price);
				}
				else if(no == 5) {
					car.selectCar();
					
					System.out.println("삭제할 자동차의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					
					car.deleteCar(num);
				}
				else if(no == 6) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}

			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}

		}

	}

	public static void main(String[] args) {
		new CarMain();
	}

}
