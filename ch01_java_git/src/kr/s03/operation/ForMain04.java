package kr.s03.operation;

public class ForMain04 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		
		System.out.print("단 입력 : ");
		int dan = input.nextInt();
	
		System.out.println("----------------");
		System.out.println(dan + "단");
		System.out.println("----------------");
		
		for(int i = 1; i<=9; i++) {
			//곱해지는 숫자
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		input.close();
		
	}

}
