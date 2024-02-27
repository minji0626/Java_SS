package kr.s13.object.array;

public class ScoreMain {

	public static void main(String[] args) {
		Score [] scoreArray = new Score[3];
		
		//반복문을 이용한 배열의 요소 출력	
		System.out.println("이 름  국어  영어  수학  총 점  평균  등급");	
		System.out.println("=====================");
		scoreArray[0] = new Score("이동욱" , 99 , 98, 97);
		scoreArray[1] = new Score("이수혁" , 89 , 91, 92);
		scoreArray[2] = new Score("유재석" , 79 , 81, 85);
		
		for(int i = 0; i <scoreArray.length; i++) {
			System.out.printf("%s  " , scoreArray[i].getName());
			System.out.printf("%d   " , scoreArray[i].getKor());
			System.out.printf("%d   " , scoreArray[i].getEng());
			System.out.printf("%d   " , scoreArray[i].getMath());
			System.out.printf("%d   " , scoreArray[i].makeSum());
			System.out.printf("%d   " , scoreArray[i].makeAvg());
			System.out.printf("%s %n" , scoreArray[i].makeGrade());
		}
		System.out.println("-----------------------------------------");
		
		//확장 for문을 이용한 배열의 요소 출력
		for(Score s : scoreArray) {
			System.out.printf("%s  " , s.getName());
			System.out.printf("%d   " , s.getKor());
			System.out.printf("%d   " , s.getEng());
			System.out.printf("%d   " , s.getMath());
			System.out.printf("%d   " , s.makeSum());
			System.out.printf("%d   " , s.makeAvg());
			System.out.printf("%s%n" , s.makeGrade());
		}

		
	}

	
}
