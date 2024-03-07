package kr.s27.collection;
import java.util.*;

public class HashMapMain01 {

	public static void main(String[] args) {
		
		/*
		 * Map : key 와 value 의 쌍으로 저장
		 * 			저장된 순서가 유지되지 않음
		 */	
		
		HashMap<String,Integer> map = new HashMap<String , Integer>();
		map.put("김신", 95);
		map.put("지은탁", 100);
		map.put("저승사자", 85);
		map.put("써니", 93);
		map.put("유덕화", 70);
		
		//중복된 값이 생기면 맨 나중에 입력된 값이 남고 앞에 있던 데이터는 사라진다.
		map.put("지은탁", 0);
		
		// null을 입력하더라도 에러가 없음, key 처럼 행동함 [key,value에 null을 허용한다]
		map.put("강호동", null);
		map.put(null, 100);

		
		//저장된 데이터(key와 value의 쌍)의 목록
		System.out.println(map);
		System.out.println("---------------------------------------------------------------------");
		
		Integer num = map.get("지은탁");
		System.out.println("지은탁의 성적은 " + num + "점 입니다.");
	
	
	}

}
