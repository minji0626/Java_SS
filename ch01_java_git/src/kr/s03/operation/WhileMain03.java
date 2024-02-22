package kr.s03.operation;

public class WhileMain03 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("단을 입력하세요 : ");
		int dan = input.nextInt();
		
		System.out.println("-----------------------");
		System.out.println( dan + " 단 ");
		System.out.println("-----------------------");
		
		int i =1;
				//조건식
		while(i<=9) {
			System.out.println(dan + " * " + i + " = " + dan*i );
			//증감
			i++;	
		}
		
		
		input.close();
		
	}
}
