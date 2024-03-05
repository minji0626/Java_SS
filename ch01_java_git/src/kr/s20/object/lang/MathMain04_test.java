package kr.s20.object.lang;
import java.util.*; // array 관련 함수 쓰기 위해 필요함
/*
[실습]
로또 프로그램 제작
길이가 6인 int형 배열을 생성하고 1~45 숫자 범위로 난수를 발생시킨다.
중복되지 않은 6개의 숫자를 생성해서 배열에 저장하고 출력하라.
난수 생성 : Math.random () 또는 Random 클래스의 nextInt 메서드를 사용한다.
 */

public class MathMain04_test {

	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto [i] = (int)(Math.random() * 45) + 1 ;// 1~ 45
			
			//중복된 숫자가 있는지 검증하기
			for (int j = 0 ; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--; //중복되면 생성한 난수를 불허한다
						//i의 값을 1 줄여서 중복된 값을 제거하고
						//새로운 값을 저장한다.
					break;
				}
			}
	
		}
		
		Arrays.sort(lotto); // 오름차순 정렬
		for(int num : lotto ) {
			System.out.print(num + "\t");
		}
	}

}
