package kr.s27.collection;
import java.util.*;	

public class HashTableMain {
	public static void main(String[] args) {
		Hashtable<String,Object> h = new Hashtable<String,Object>();

		h.put("name", "홍길동");
		h.put("age", 27);
		h.put("tel", "010-1234-5678");
		h.put("job", "경찰");
		h.put("address", "서울");
		h.put("name", "홍길순"); //-> key가 중복되면 마지막에 입력한 값이 출력된다.
		//h.put("hobby", null);
		//h.put(null, "프로그래머");
		//-> key와 value에 null을 사용할 수 없다.
		
		//저장된 데이터 (key와 value의 쌍)의 목록
		System.out.println(h);
		System.out.println("-----------");

		//key를 통해서 value 구하기
		String name = (String) h.get("name");
		Integer age = (Integer)h.get("age");
		System.out.println(name +" , " +age);
		System.out.println("-----------");

		
		//Enumeration을 이용해서 key 구하기
		Enumeration<String> en = h.keys()	;
		while(en.hasMoreElements()) {
			String key = en.nextElement()	;
			System.out.println(key + "," + h.get(key));
		}
	}
}
