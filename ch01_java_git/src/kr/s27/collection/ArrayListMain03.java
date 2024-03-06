package kr.s27.collection;
import java.util.*;

public class ArrayListMain03 {
	public static void main(String[] args) {
		
		/*
		 * 제네릭 표현 : 객체를 생성할 때 객체에 저장할 수 있는 요소의 타입을 지정하는 것
		 */
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("이동욱"); //String -> Object
		list.add("이수혁"); //String -> Object
		//list.add(1000);  // Integer -> Object 객체에 저장할 수 있는 데이터의 타입을 String으로 한정시킴
		list.add("손석구"); // String -> Object
		
		// 반복문을 이용한 요소의 출력
		for (int i = 0 ; i < list.size() ; i ++) {
			String name = (String)list.get(i);
			System.out.println(name);
		}
		
		System.out.println("---------------------");
		
		//확장 for문을 이용한 요소의 출력
		for (String name : list) {
			System.out.println(name);
		}
	
	}
	
}
