package kr.s27.collection;
import java.util.*;

import javax.xml.transform.sax.SAXSource;

public class ArrayListMain06 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("딸기");		//0
		list.add("샤인머스캣");	//1
		list.add("자두");		//2
		list.add("딸기");		//3
		list.add("체리");		//4
	
		//인덱스 탐색
		int index1 = list.indexOf("딸기");
		System.out.println("첫 번째 딸기 : " + index1);
		
		// 마지막 인덱스 탐색
		int index2 = list.lastIndexOf("딸기");
		System.out.println("마지막 딸기 : "  + index2);
		
		//없는 데이터는 -1 반환 시킴
		int index3 = list.indexOf("망고");
		System.out.println("망고의 위치?  " + index3);
	
		//샤인머스캣이 포함되어 있으면 true / 없으면 false
		boolean f1 = list.contains("샤인머스캣");
		System.out.println("샤인머스캣 포함?  " + f1);
		
		// 미포함 과일이기 때문에 false 반환
		boolean f2 = list.contains("방울토마토");
		System.out.println("방울토마토 포함?  " + f2);
		
		System.out.println("-------------------------");
		
		// 요소의 목록 출력
		System.out.println(list);
		System.out.println("------------------------------------");
		
		// 사전에 명시된 순서대로 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 역순으로 정렬
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("------------------------------------");
		
		// INT 형
		ArrayList <Integer> list2 = new ArrayList<Integer> ();
		
		list2.add(10);
		list2.add(100);
		list2.add(15);
		list2.add(2);
		list2.add(40);
		
		System.out.println(list2);
		System.out.println("------------------------------------");
		
		//정렬 (오름차순 정렬)
		Collections.sort(list2);
		System.out.println(list2);
		
		//내림차순 정렬
		Collections.reverse(list2);
		System.out.println(list2);
		
	}
}
