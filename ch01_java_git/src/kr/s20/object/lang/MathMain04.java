package kr.s20.object.lang;

/*
[실습]
로또 프로그램 제작
길이가 6인 int형 배열을 생성하고 1~45 숫자 범위로 난수를 발생시킨다.
중복되지 않은 6개의 숫자를 생성해서 배열에 저장하고 출력하라.
난수 생성 : Math.random () 또는 Random 클래스의 nextInt 메서드를 사용한다.
 */

public class MathMain04 {
	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 ) + 1 ;
			
		for ( int j = 0; j < i; j++) {
			if(lotto[i] == lotto[j]) {
				lotto[i] = (int)(Math.random() * 45) + 1;
				j = -1;
			}
		}
		System.out.println("행운의 숫자는 ? > " + lotto[i]);
	}
		
	}

}
