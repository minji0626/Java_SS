package kr.s03.operation;

public class BreakMain02 {

	public static void main(String[] args) {
		// 다중 반복문에서 break 사용하기

		for(int i = 0; i < 3; i ++){
			for (int j = 0; j < 5; j++) {
				if ( j == 3) {
					/*
					 * 특정 조건일 때 반복문을 빠져나감
					 * 다중 반복문일 때 전체 반복문을 빠져나가는 것이 아니라
					 * break가 포함되어있는 반복문만 빠져나간다.
					 */
					break;
				}
				System.out.println( i + "," + j);
			}
		}

	}

}
