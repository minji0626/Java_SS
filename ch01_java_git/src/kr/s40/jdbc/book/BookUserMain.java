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
			System.out.print("1. 로그인 | 2. 회원 가입 | 3. 회원 탈퇴 | 4. 종료 >");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {//로그인
					System.out.print("ID : ");
					me_id = br.readLine();
					System.out.print("PW : ");
					String me_passwd = br.readLine();
					login = book.loginCheck(me_id, me_passwd);
					
					if(login == true) {
						System.out.println(me_id+"님 로그인되었습니다.");
						break;
					}
				}
				else if(no == 2) {//회원가입
					System.out.print("ID : ");
					me_id = br.readLine();
					//아이디 중복 체크
					int check = book.checkId(me_id);
					if(check>=1) {//1:중복,2:오류
						System.out.println("아이디가 중복되었습니다.");
					}else {//0:미중복
						//비밀번호,이름,전화번호 입력
						//insertMember 호출
						System.out.print("PW : ");
						String me_passwd = br.readLine();
						System.out.print("이름 : ");
						String me_name = br.readLine();
						System.out.print("전화번호 : ");
						String me_phone = br.readLine();

						book.insertMember(me_id, me_passwd, me_name, me_phone);
					}
				} else if(no == 3) { //회원 탈퇴
					System.out.print("ID : ");
					me_id = br.readLine();
					System.out.print("PW : ");
					String me_passwd = br.readLine();
					book.deleteMember(me_id, me_passwd);
				}
				
				else if(no == 4) {//종료
					System.out.println("사용자 프로그램을 종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!");
			}
		}

		while(login) {//로그인 체크 후 메뉴
			System.out.print("1. 도서 대출 | 2. MY대출 목록 | 3. 대출도서 반납 | 4. 종료 > ");
			try {
				int no2 = Integer.parseInt(br.readLine());
				if(no2 == 1) { //도서 대출
					book.selectListBook();
					System.out.print("도서번호 : ");
					int bk_num = Integer.parseInt(br.readLine());
					System.out.print("ID : ");
					String me_id = br.readLine();
					
					book.insertReservation(bk_num, me_id);
				}
				else if(no2 == 2) { //my 대출 목록
					System.out.print("ID : ");
					me_id = br.readLine();
					book.selectMyList(me_id);
				}
				else if(no2 == 3) { // 대출 도서 반납
					System.out.print("ID : ");
					me_id = br.readLine();
					book.selectMyList(me_id);
					System.out.print("대출 번호 : ");
					int re_num = Integer.parseInt(br.readLine());
					book.updateReservation(re_num);
				}
				else if(no2 == 4) { // 종료
					System.out.println("회원 프로그램을 종료합니다.");
					break;
				} else {
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
