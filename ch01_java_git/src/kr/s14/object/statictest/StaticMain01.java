package kr.s14.object.statictest;

public class StaticMain01 {

	public static void main(String[] args) {
		
		StaticCount sc1 = new StaticCount();
		
		System.out.println("c : " + sc1.c + " , count : " + StaticCount.count); //static항 변수는 클래스 명으로 호출한다.	
		
		StaticCount sc2 = new StaticCount();
		System.out.println("c : " + sc2.c + " , count : " + StaticCount.count);
		
		StaticCount sc3 = new StaticCount();
		System.out.println("c : " + sc3.c + " , count : " + StaticCount.count);
		
	}
	
}



