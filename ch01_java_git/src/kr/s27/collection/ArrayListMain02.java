package kr.s27.collection;
import java.util.*;

public class ArrayListMain02 {
	public static void main(String[] args) {
		/*
		 * list 구조의 특징
		 * 저장된 순서 유지, 중복 저장 허용
		 */
		ArrayList list = new ArrayList();
		list.add("이동욱"); // String -> Object
		list.add("이수혁"); // String -> Object
		list.add("유재석"); // String -> Object
		list.add("손석구"); // String -> Object
		
		// 저장된 요소의 목록
		System.out.println(list);
		System.out.println("---------------");
		
		for (int i = 0; i < list.size(); i ++) {
			String name = (String) list.get(i)	;
			System.out.println(name);
		}
		
	}

}
