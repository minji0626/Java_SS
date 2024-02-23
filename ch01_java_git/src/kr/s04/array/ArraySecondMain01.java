package kr.s04.array;

public class ArraySecondMain01 {

	public static void main(String[] args) {	
		// 2차원 배열
		int [] [] test; //선언

		test = new int [2] [3]; //생성 ([2행] [3열])
		//		행	열
		test [0][0] = 100; // 초기화
		test [0][1] = 200;
		test [0][2] = 300;
		
		test [1][0] = 400;
		test [1][1] = 500;
		test [1][2] = 600;
		
		//배열의 요소 출력
		System.out.println(test [0][0]);
		System.out.println(test [0][1]);
		System.out.println(test [0][2]);
		
		System.out.println(test [1][0]);
		System.out.println(test [1][1]);
		System.out.println(test [1][2]);
		
		System.out.println("================");
		
		//반복문을 이용한 배열의 요소 출력
		//						행의 길이
		for (int i =0; i < test.length; i++){
			for (int j =0; j < test[i].length; j++){
				System.out.println( "test["+i+"]["+j+ "]"+ test[i][j]);	
			}
		}
		
		System.out.println("================");
		
		//3행 3열의 2차원 배열을 선언, 생성
		int[][] test2 = new int [3][3];
		for (int i =0; i < test2.length; i++){
			for (int j =0; j < test2[i].length; j++){
				System.out.println(test2[i][j]);	
			}
		}
		System.out.println("================");
		//2행 3열의 2차원 배열 선언, 생성(명시적 배열 생성), 초기화
		int[][] test3 = new int[][] {{10, 20, 30},{40, 50, 60}};
		for (int i =0; i < test3.length; i++){
			for (int j =0; j < test3[i].length; j++){
				System.out.println(test3[i][j]);	
			}
		}
		System.out.println("================");
		//2행 3열의 2차원 배열 선언, 생성(암시적 배열 생성), 초기화
		int[][] test4 = {{100, 200, 300},{400, 500, 600}};
		for (int i =0; i < test4.length; i++){
			for (int j =0; j < test4[i].length; j++){
				System.out.println(test4[i][j]);	
			}
		}
		
		
	}
}
