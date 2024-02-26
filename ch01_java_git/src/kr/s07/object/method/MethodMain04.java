package kr.s07.object.method;

public class MethodMain04 {

	/* 배열 메서드 공부 필요할듯 & 최대값 만들어 봤음 O
	 [실습]
	 배열 요소 수 (사람 수)를 입력 받아서 배열 weight 생성.
	 입력 받은 정수를 배열 weight 에 저장하고 배열 weight 가 가진 모든 요소의 수 중 최소값을 구하는 minOf 메소드를 작성하시오.
	
	[입력 예시]
	사람 수 : 3
	1번의 몸무게 : 90
	2번의 몸무게 : 88
	3번의 몸무게 : 91
	
	[출력 예시]
	가장 마른 사람의 체중은 88kg 이다.
	 */

	public int minOf(int [] a) {
		int min = a [0];
		for (int i = 1; i < a.length; i ++) {
		if (min > a[i]) {
			min = a[i];
		}
	}
		return min;
}
	public int maxOf(int [] b) {
		int max = b[0];
		for(int i = 1; i < b.length; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("사람 수는 몇 명입니까? >");
		int num = input.nextInt();
		
		int [] weight = new int [num];
		
		for(int i = 0; i < num; i ++) {
			System.out.print( (i + 1) + "번의 몸무게 : ");
			weight[i] = input.nextInt();
		}
		
		MethodMain04 me = new MethodMain04();
		
		int result = me.minOf(weight);
		System.out.println("가장 마른 사람의 체중은 " + result + "kg 입니다.");
		
		int result2 = me.maxOf(weight);
		System.out.println("가장 뚱뚱한 사람의 체중은 " + result2 + "kg 입니다.");
		
		
		input.close();

	}

}
