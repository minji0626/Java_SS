package kr.s07.object.method;

public class MethodMain02 {
	
	/*
	 [실습]
	 입력한 int형 정수값이 음수이면 -1을, 0이면 0을, 양수면 1을 반환하는 signOf 메서드를 정의한다. 
	 */
	
	/*public int signOf (int n) {
		if (n < 0 ) {
			return -1;
		}
		else if (n > 0) {
			return 1;
		}
		else
		{return 0;}
	}*/
	
	public int signOf(int n) {
		int sign = 0;
		
		if (n>0) {//양수
			sign = 1;
		}
		else if (n<0) {//음수
			sign = -1;
		}
		//else {
			//sign = 0;
		//}  초기화를 0으로 했기 때문에 굳이 쓸 필요가 없다.
		
		return sign;
	}
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		MethodMain02 me = new MethodMain02();
		System.out.println("정수 x를 입력하세요. >");
		int x = input.nextInt();
		
		int result = me.signOf(x);
				
		System.out.println("signOf(x)는 " + result + "입니다.");
		
		input.close();
	}

}
