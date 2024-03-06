package kr.s27.collection;
import java.util.*;

public class ArrayListMain04 {
	public static void main(String[] args) {
		//String 데이터
		ArrayList<String> list = new ArrayList<String>();
		list.add("손석구"); //String
		list.add("김우석"); //String
		list.add("이동욱"); //String
		list.add("이수혁"); //String
		list.add("이동욱");//String
		
		//반복문을 이용한 요소의 출력
		for(int i = 0; i <list.size(); i++) {
			System.out.println(i+ " : " + list.get(i));
		}
		
		System.out.println("--------------");

		// 요소의 삭제
		//인덱스 명시하여 삭제
		list.remove(2); 
		// 중복된 데이터가 있으면 동시는 삭제는 불가능하며, 앞에서부터 삭제된다
		list.remove("이동욱"); 
		for(int i = 0; i <list.size(); i++) {
			System.out.println(i+ " : " + list.get(i));
		}
		
		System.out.println("--------------");
		
		
		// int 데이터
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(40);
		//요소의 출력
		for(int i = 0; i <list2.size(); i++) {
			System.out.println(i+ " : " + list2.get(i));
		}
		
		System.out.println("--------------");
				
		//요소의 삭제
		//인덱스 명시하여 삭제
		list2.remove(2);
		//40을 쓰면 인덱스 40으로 인식하기 때문에 Integer.valueOf() 를 써서 Integer라는 것을 알려줘야한다.
		list2.remove(Integer.valueOf(40)); 
		for(int i = 0; i <list2.size(); i++) {
			System.out.println(i+ " : " + list2.get(i));
		}
		
		System.out.println("--------------");
		
		//요소의 변경
		// 바꿀 인덱스 번호, 바꿀 값 [인덱스 1의 값을 30으로 바꾼다]
		list2.set(1, 30);
		for(int i = 0; i <list2.size(); i++) {
			System.out.println(i+ " : " + list2.get(i));
		}
		
	}
}
