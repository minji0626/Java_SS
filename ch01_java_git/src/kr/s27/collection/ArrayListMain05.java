package kr.s27.collection;
import java.util.*;

public class ArrayListMain05 {
	public static void main(String[] args) {
		ArrayList<Integer>	list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(16);

		//저장된 요소의 목록
		System.out.println(list);
		System.out.println("-----------------");
		
		/* 짝수 삭제 잘못된 방법
		이 방법으로 진행하게 된다면 삭제 처리를 놓치는 데이터가 생길 수 있다.
		그래서 큰 인덱스 숫자부터 삭제를 진행시켜야 빠지지 않고 삭제가 될 수 있다.
		for (int i = 0 ; i < list.size();	i++) {
			if(list.get(i)%2 == 0) {
				list.remove(i);
			} if
		} for
		System.out.println(list);
		System.out.println("-----------------");
		*/
		
		
		//짝수 삭제하기
		//마지막 인덱스부터 시작해서 조건체크하면 건너뛰는 데이터가 발생하지 않고 모든 요소의 조건 체크가 가능하다
		// 마지막 인덱스:  길이 - 1
		for (int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i)%2 == 0) {
				list.remove(i);
			} //IF
		} //FOR
		System.out.println(list);
		System.out.println("-----------------");
	}
}
