package kr.s38.jdbc.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {

	private BufferedReader br;
	private ScoreDAO score;

	public ScoreMain()	{		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			score = new ScoreDAO();
			//메뉴 호출하기
			callMenu();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}

	public void callMenu() throws IOException {
		while(true) {
			System.out.print("1. 성적 입력 | 2. 성적 목록 | 3. 성적 상세 보기 | 4. 성적 수정 | 5. 성적 삭제 | 6. 종료 > ");
			try {
				int no = Integer.parseInt(br.readLine());
				if (no == 1) { // 성적 입력하기
					System.out.print("이름 : ");
					String name = br.readLine();
					int korean = parseInputData("국어 : ");
					int english = parseInputData("영어 : ");
					int math = parseInputData("수학 : ");
					int sum = makeSum(korean, english, math);
					int avg = makeAvg(sum);
					String grade = makeGrade(avg);
					
					score.insertScore(name, korean, english, math, sum, avg, grade);
				}
				else if (no == 2) {
					score.selectScore();
				}
				else if (no == 3) {
					System.out.print("선택한 학생 번호 : ");
					int num = Integer.parseInt(br.readLine());

					score.selectDetailScore(num);
				}
				else if (no == 4) {
					System.out.print("수정할 학생의 번호 : ");
					int num = Integer.parseInt(br.readLine());
					score.selectDetailScore(num);
					System.out.println("===========");
					System.out.print("이름 : ");
					String name = br.readLine();
					System.out.print("국어 : ");
					int korean = parseInputData("국어 : ");
					int english = parseInputData("영어 : ");
					int math = parseInputData("수학 : ");
					int sum = makeSum(korean, english, math);
					int avg = makeAvg(sum);
					String grade = makeGrade(avg);

					score.updateScore(num, name, korean, english, math, sum, avg, grade);

				}
				else if (no == 5) {
					score.selectScore();

					System.out.println("===========");
					System.out.print("삭제하려는 학생 번호 : ");
					int num = Integer.parseInt(br.readLine());
					score.deleteScore(num);

				}
				else if (no == 6) {
					System.out.println("프로그램을 종료하겠습니다.");
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}
		}

	}

	//총점 구하기
	public int makeSum(int korean, int english, int math) {
		return korean+english+math;
	}
	// 평균 구하기
	public int makeAvg(int sum) {
		return sum / 3;
	}
	// 등급 구하기
	public String makeGrade(int avg) {
		String grade;
		switch (avg / 10) {
		case 10:	
		case 9:
			grade = "A"; break;
		case 8:
			grade = "B"; break;
		case 7:
			grade = "C"; break;
		case 6:
			grade = "D"; break;
		default:
			grade = "F";
		}
		return grade;
		
	}
	
	public int parseInputData(String course) throws IOException {
		while(true) {
			System.out.println(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num<0 || num > 100) {
					throw new ScoreValueException("0부터 100사이만 입력 가능");
				}
				return num;
			}
			catch (NumberFormatException e) {
				System.out.println("숫자만 입력 가능");			
				} catch (ScoreValueException e) {
				System.out.println(e.getMessage());
				}
		}
	}



	public static void main(String[] args) {
		new ScoreMain();
	}

}
