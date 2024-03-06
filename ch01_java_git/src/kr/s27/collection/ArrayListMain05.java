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
		
		//짝수 삭제
		for (int i = 0 ; i < list.size();	i++) {
			if(list.get(i)%2 == 0) {
				list.remove(i);
			} // if
		} // for
		System.out.println(list);
		
		
	}
}
