package kr.s13.object.array;

public class Score {

	//은닉화
	private String	name;
	private int	kor;
	private int	eng;
	private int	math;

	//생성자
	public Score (String n , int k ,int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	}

	//총점 구하기
	public int makeSum () {
		return kor + eng + math;
	}

	//평균 구하기
	public int makeAvg() {
		return makeSum() / 3;
	}

	//등급 구하기
	public String makeGrade() {
		//String grade;

		switch (makeAvg() / 10) {
		case 10:
		case 9:
			//grade = "A"; break;
			return "A"; //변수를 만들지 않고 반환 가능함
		case 8:
			//grade = "B"; break;
			return "B";
		case 7:
			//grade = "C"; break;
			return "C";
		case 6:
			//grade = "D"; break;
			return "D";
		default:
			//grade = "F";
			return "F";
		}
		//return grade;
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
}

