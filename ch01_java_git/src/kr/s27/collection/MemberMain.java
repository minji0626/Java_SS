package kr.s27.collection;
import java.util.*;
import java.io.*;

/*
[실습]
메뉴 : 회원 정보 입력, 회원 정보 출력, 종료
메소드 : 메뉴 출력 callMenu() , 회원 정보 입력 register() , 회원 정보 출력 printUserInfo()
입력시 조건 체크 : 나이는 1살 이상 입력 가능 (음수 , 0 입력 불가)
 */

public class MemberMain {
	ArrayList<Member> list;
	BufferedReader br;
	
	public MemberMain(){
		list = new ArrayList<Member>();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			if ( br != null ) {
				try {br.close(); } catch (IOException e) {}
			}
		}
	}
	
	public void callMenu() throws IOException {
		
		while(true) {
			System.out.print("  1. 회원 가입  |  2. 회원 정보 조회  |  3. 종료하기  > ");
			
			try {
				int num = Integer.parseInt(br.readLine());
				
				if(num == 1) {
					register();
				}
				else if ( num ==  2) {
					printUserInfo();
				}
				else if ( num == 3 ) {
					System.out.println("프로그램을 종료하겠습니다.");
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요!");
			}
		}
	}

	public void register() throws IOException{
		Member m = new Member();
		
		System.out.print("이름  > ");
		m.setName(br.readLine());
		m.setAge(parseInputData("나이  > "));
		System.out.print("직업  > ");
		m.setJob(br.readLine());
		System.out.print("주소  > ");
		m.setAddress(br.readLine());
		System.out.print("전화번호  > ");
		m.setPhone(br.readLine());
		
		list.add(m);
		System.out.println("회원 가입이 완료되셨습니다.");
		System.out.printf("현재 총 회원 수는 %d명 입니다. %n" , list.size());
		System.out.println();
	}
		
	
	
	//나이 조건 체크
	public int parseInputData (String item) throws IOException{
		while (true) {
			System.out.print(item);
			try {
				int age = Integer.parseInt(br.readLine());
				if(age <=0) {
					System.out.println("1살 이상 입력 가능");
					continue;
				}
				return age;
			}
			catch (NumberFormatException e ) {
				System.out.println("숫자만 입력 가능합니다.");
			}
		}
	}
	
	public void printUserInfo() {
		System.out.println("회원 정보 조회를 시작합니다. 현재 회원 수는 " + list.size() + "명 입니다.");
		System.out.println("이름\t나이\t직업\t주소\t전화번호");
		System.out.println("============================================");
		
		for ( int i = 0 ; i < list.size(); i++) {
			Member mb = list.get(i);
			System.out.printf("%s\t" , mb.getName() );
			System.out.printf("%d\t" , mb.getAge());
			System.out.printf("%s\t" , mb.getJob());
			System.out.printf("%s\t" , mb.getAddress());
			System.out.printf("%s%n" , mb.getPhone());
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		new MemberMain();
	}

}
