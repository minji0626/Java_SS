package kr.s07.object.method;

public class MethodMain03 {
/* 혼자 해결 X
 [실습]
 배열의 요소 수를 입력 받아서 배열 x 생성
 입력 받은 정수를 배열 x에 저장하고
 배열 x가 가진 모든 요소의 합을 구하는  sumOf(int [] a) 메서드를 정의하시오.
 
 [입력 예시]
 요소 수 : 3 	(길이가 3인 배열)
 x[0] = 1
 x[1] = 2
 x[2] = 3
 
 [출력 예시]
 모든 요소의 합은 6 입니다.
 */
	public int sumOf (int [] a) {
			int sum = 0; 
			for(int i = 0; i <a.length; i++) {
				sum += a[i]; // 누적시키기
			}
			
			return sum; //반환시키기
	}

	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// 요소의 수 입력 받기
		System.out.print("요소 수를 입력해주세요. >");
		int num = input.nextInt();
		
		//num 개의 요소를 가지는 배열
		int[] x = new int [num];
		
		for (int i = 0; i < num; i++ ) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextInt();
		}
		
		//객체 선언 및 생성
		MethodMain03 me = new MethodMain03();
		int result = me.sumOf(x);
		System.out.println("모든 요소의 합은 " + result + " 입니다.");
	
		input.close();
	}

}
