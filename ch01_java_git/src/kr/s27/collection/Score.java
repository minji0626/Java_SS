package kr.s27.collection;

public class Score {
	private String name; //학생 이름
	private int kor; // 국어 성적
	private int eng; // 영어 성적
	private int math; // 수학 성적
	
	public int makeSum() { // 합계
		return kor + eng + math ;
	}
	
	public double makeAvg () { // 평균
		return makeSum() / 3.0;
	}
	
	public String makeGrade() { // 학점
		
		switch ( (int) (makeAvg() / 10)) {
		case 10:
		case 9:
			return "A"; 
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//총점 구하기 (int makeSum)
	//평균 구하기	(double makeAvg)
	//등급 구하기 (String makeGrade)
	
	
}
