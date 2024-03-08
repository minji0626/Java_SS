package kr.s28.iostream;

import java.io.*;
import java.util.*;

/*			콘솔								파일
 * 메뉴 : 영화 정보 입력 /  영화 정보 출력 / 파일 생성 / 파일 일기 / 종료
 * callMenu	 /inputMovie / printMovie / createFile / readFile
 * 조건 체크 : 0분 이상, 음수 불가, 숫자만 사용 가능함
 */

public class MovieMain {	
	ArrayList<Movie> list ;
	BufferedReader br;

	public MovieMain() {
		list = new ArrayList<Movie> ()	;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally { 
			if(br != null) { try {br.close();} catch(IOException e) { } }
		}
	}

	public void callMenu() throws IOException {
		while (true) {
			System.out.print("  1. 영화 정보 입력  |  2. 영화 정보 출력  |  3. 파일 생성  |  4. 파일 열기  |  5. 종료  > ");

			try {
				int num = Integer.parseInt(br.readLine()) ;
				if ( num == 1) {
					inputMovie();
				}
				else if (num == 2) {
					printMovie();
				}
				else if (num == 3) {
					createFile();
				}
				else if (num == 4) {
					readFile();
				}
				else if (num == 5) {
					System.out.println("프로그램을 종료하겠습니다. 다음에 또 이용해주세요.");
					break;
				}
				else {
					System.out.println("메뉴 번호를 정확히 입력해주세요.");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}


	public void inputMovie() throws IOException {
		Movie m = new Movie() ;
		System.out.print("영화 제목 > ");
		m.setName(br.readLine());
		System.out.print("영화 제작연도 > ");
		m.setCreate_year(br.readLine());
		System.out.print("영화 감독 > ");
		m.setDirector(br.readLine());
		System.out.print("영화 출연 배우 > ");
		m.setActor(br.readLine());
		m.setTime(parseInputData("영화 상영 시간 > "));

		list.add(m) ;
		System.out.println("영화 정보가 등록되었습니다.");
	}

	public int parseInputData (String time) throws IOException {
		while (true) {
			System.out.println(time);
			try {
				int num = Integer.parseInt(br.readLine());
				if (num <= 0) {
					System.out.println("상영 시간은 0분보다 길어야 합니다. 다시 입력해주세요.");
					continue;
				}
				return num;
			}
			catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
	}

	public void printMovie() {
		if(list.size() > 0) {
			System.out.printf("등록된 영화의 개수는 %d편 입니다.%n" , list.size());
			System.out.println("------------------------------------------------------------");
			System.out.println("영화제목\t제작연도\t감독\t출연배우\t상영시간");
			System.out.println("------------------------------------------------------------");

			for( Movie m : list) {
//				  System.out.printf("%s\t" , m.getName()); 
//				  System.out.printf("%s\t" ,m.getCreate_year()); 
//				  System.out.printf("%s\t" , m.getDirector());
//				  System.out.printf("%s\t" , m.getActor()); 
//				  System.out.printf("%d%n" ,m.getTime()); 
//				  System.out.println();
				  System.out.print(m.toString());
				  
			}	
		}
		
		else {
			System.out.println("등록된 영화 정보가 없습니다. 영화 정보 등록 후 다시 이용해주세요.");
			System.out.println();
		}
	}


	public void createFile( ) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("movie.txt");
			fw.write("-------------------------------------------\n");
			fw.write("영화제목\t제작연도\t감독\t배우\t상영시간\n");
			fw.write("-------------------------------------------\n");
			for (Movie m : list) {
				fw.write(m.toString());
			}
			fw.flush();
			System.out.println("파일에 영화 정보를 저장했습니다.");
		}
		catch (IOException e) {
			System.out.println("파일에 영화 정보 저장 오류가 발생했습니다.");
		}
		finally {
			if(fw != null) try {fw.close();} catch(IOException e) { } 
		}
	}

	public void readFile() {
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("movie.txt");
			while ( (readChar = fr.read()) != -1) {
				System.out.print((char) readChar);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("생성된 파일이 없습니다.");
		}
		catch (IOException e) {
			System.out.println("파일을 읽어오는데 오류가 발생했습니다.");
		}
		finally {
			if(fr != null) {
				try {fr.close();} catch(IOException e) { }
			}
		}
	}



	public static void main(String[] args) {
		new MovieMain()	;
	}
}
