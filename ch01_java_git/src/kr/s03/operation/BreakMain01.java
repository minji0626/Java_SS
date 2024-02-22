package kr.s03.operation;

public class BreakMain01 {

	public static void main(String[] args) {
		// break 는 switch 블럭을 빠져나갈 때, 반복문에서 특정 조건일 때 반복문을 빠져나가는 용도로 사용함
		
		int n = 1;
		while (n<=10) {
			System.out.println(n);
			n++;
			if (n == 8)
				break;
		}
		

	}

}
