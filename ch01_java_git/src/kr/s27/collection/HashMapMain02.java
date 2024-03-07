package kr.s27.collection;
import java.util.*;

public class HashMapMain02 {
	public static void main(String[] args) {
		String [] msg = {"Berlin", "Paris","Seoul","NewYork","London"};
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//HashMap에 key와 value 저장
		for(int i = 0; i < msg.length; i++) {
			map.put(i, msg[i]);
		}
		//HashMap의 데이터 목록 호출
		System.out.println(map);
		System.out.println("---------------------------------------------------");
		
		//Set<Integer> s = map.keySet()	;
		//Iterator<Integer> keys = s.iterator()	;
		
		Iterator<Integer>keys	= map.keySet().iterator()	;
		
		while(keys.hasNext()) {
			Integer key = keys.next()	;
			System.out.println(key + " , " + map.get(key));
		}
		
	}
}
