package kr.s27.collection;
import java.util.*;

/*
[실습]
로또 프로그램 제작
1 ~ 45 중복되지 않는 6개의 숫자를 구해서 ArrayList에 저장하고 출력하기
출력할 때는 오름차순 정렬하여 출력하시오.

난수 생성 : Math.random(), Random 클래스의 nextInt(	) 모두 사용 가능
 */


public class ArrayListMain07 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		int [] lotto =  new int [6];
		System.out.println("로또 추첨을 시작합니다 > ");

		for (int i = 0; i < lotto.length; i++) {
			lotto [i]  = ( (int)(Math.random() * 45) + 1 );

			for(int j = 0 ; j < i ; j++) {
				if (lotto[i] == lotto[j]) {
					lotto [i]  = ( (int)(Math.random() * 45) + 1 );
					j = -1;
				} //IF
			} // inner for
			
			list.add(lotto[i]);
			
		}// outer for
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}
