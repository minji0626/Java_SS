package kr.s27.collection;
import java.util.*;
import java.io.*;

/*
[실습]
메뉴 : 성적 입력, 성적 출력, 종료
메서드 명 : callMenu () ,  inputScore() ,  printScore()
				메뉴				성적 입력			싱적 출력
입력시 조건 체크 : 점수 입력 시 0 ~ 100까지만 입력 가능

 */
public class ScoreMain {
	ArrayList<Score> list;
	BufferedReader br;

	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}
		catch(Exception e) {
			e.printStackTrace(); // 예외 정보 출력
		}
		finally {
			if(br != null) {
				try {br.close();} catch(IOException e) { }
			}
		}
	}

	public void callMenu() throws IOException	{ // 메뉴
		while(true) {
			System.out.print("  1. 성적 입력  |  2. 성적 출력 |  3. 종료  > ");

			try {
				int num = Integer.parseInt(br.readLine());
				if( num == 1 ) {
					inputScore();
				}
				else if( num == 2 ) {
					printScore();
				}	
				else if ( num == 3) {
					System.out.println("프로그램을 종료하겠습니다.");
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다. ");
				}
			}
			catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}

	public void inputScore() throws IOException { // 성적 입력하기

		Score s = new Score();

		System.out.print("이름  > ");
		s.setName(br.readLine());
		/*
		System.out.print("국어  > ");
		s.setKor(Integer.parseInt(br.readLine()));
		System.out.print("영어  > ");
		s.setEng(Integer.parseInt(br.readLine()));
		System.out.print("수학  > ");
		s.setMath(Integer.parseInt(br.readLine()));
		*/
		s.setKor(parseInputData("국어 > "));
		s.setEng(parseInputData("영어 > "));
		s.setMath(parseInputData("수학 > "));

		list.add(s);
		System.out.println("성적 입력이 완료되었습니다.");

	}

	// 성적 입력 가능 점수 0 ~ 100 
	public int parseInputData (String course) throws IOException{
		while (true) {
			System.out.print(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if ( num < 0 || num > 100 ) {
					throw new ScoreValueException("0점 이상 100점 이하의 점수를 입력해주세요.");
				}
				return num;
			}
			catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
			catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void printScore() { // 성적 출력하기
		System.out.printf("성적이 입력된 학생 수는 %d명 입니다.%n" , list.size());
		System.out.println("-------------------------------------------------------------");
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t학점%n");
		System.out.println("-------------------------------------------------------------");

		for(int i = 0; i < list.size(); i ++) {
			Score sc = list.get(i);
			System.out.printf("%s\t" , sc.getName());
			System.out.printf("%d\t" , sc.getKor());
			System.out.printf("%d\t" , sc.getEng());
			System.out.printf("%d\t" , sc.getMath());
			System.out.printf("%d\t" , sc.makeSum());
			System.out.printf("%.2f\t" , sc.makeAvg());
			System.out.printf("%s%n" , sc.makeGrade());
			System.out.println();
		}

	}


	public static void main(String[] args) {
		new ScoreMain();
	}

}
