package kr.s02.operator;

public class OperatorMain09 {

	public static void main(String[] args) {
		
		System.out.println("===조건 (삼항) 연산자===");
		
		int x = 10;
		int y = -10;
		
		// 조건 (삼항) 연산자
					//조건 		  참값 : 거짓값
		int absX = x >=0 ? x : -x;
		//x = 10 => true 
		int absY = y >=0 ? y : -y;
		//y= -10 => false
		
		System.out.println(" x = 10일 때, x의 절대값은 " + absX +"입니다.");
		System.out.println(" y = -10일 때, y의 절대값은 " + absY +"입니다.");
		
		
	}

}
