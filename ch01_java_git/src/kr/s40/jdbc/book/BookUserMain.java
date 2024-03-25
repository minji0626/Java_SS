package kr.s40.jdbc.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookUserMain {

	//메뉴
	private BufferedReader br;
	private BookDAO book;
	private String me_id; //로그인한 회원 아이디
	private boolean login; // 로그인 여부 저장 로그인 : true, 로그아웃 : false

	public BookUserMain(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			book = new BookDAO();
			callMenu();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) try { br.close();} catch (IOException e) { }
		}
	}

	public void callMenu() throws IOException{
		// 로그인 체크
		while(true) {
			System.out.print("1. 로그인 | 2. 회원 가입 | 3. 종료 >");
			try {
				int no = Integer.parseInt(br.readLine());
				if (no == 1) { // 로그인
					System.out.print("아이디 : ");
					String me_id = br.readLine();
					System.out.print("비밀번호 : ");
					String me_passwd = br.readLine();
					book.loginCheck(me_id, me_passwd);
				}
				else if(no == 2) { // 회원 가입
					System.out.print("아이디 : ");
					String me_id = br.readLine();
					//아이디 중복 체크
					int check = book.checkId(me_id);
					if(check>=1) { // 1: 중복 2: 오류
						System.out.println("중복된 아이디입니다.");}
					else{
					System.out.print("비밀번호 : ");
					String me_passwd = br.readLine();
					System.out.print("이름 : ");
					String me_name = br.readLine();
					System.out.print("전화번호 : ");
					String me_phone = br.readLine();
				
					book.insertMember(me_id, me_passwd, me_name, me_phone);
					}
				}

				else if(no == 3) { // 종료
					System.out.println("회원 프로그램을 종료합니다.");
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}
		while(login) {//로그인 체크 후 메뉴
			System.out.print("1. 도서 대출 | 2. MY대출 목록 | 3. 대출도서 반납 | 4. 종료 > ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) { //도서 대출

				}
				else if(no == 2) { //my 대출 목록

				}
				else if(no == 3) { // 대출 도서 반납

				}
				else if(no == 4) { // 종료
					System.out.println("회원 프로그램을 종료합니다.");
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}

			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}

	}

	public static void main(String[] args) {
		new BookUserMain();
	}
}
