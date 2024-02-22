package kr.s03.operation;

public class BreakMain03 {

	public static void main(String[] args) {
		// 다중 반복문에서 break 사용하기
		exit_for : // break label
			
		for(int i = 0; i < 3; i ++){
			for (int j = 0; j < 5; j++) {
				if ( j == 3) {
					break exit_for;
				}
				System.out.println( i + "," + j);
			}
		}

		
	}

}

