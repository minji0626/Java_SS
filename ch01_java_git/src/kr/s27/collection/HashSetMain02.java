package kr.s27.collection;

import java.util.*;

public class HashSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() < 6) {
			Integer ir = (int)(Math.random()*45) + 1;
			//중복값을 허용하지 않음
			hs.add(ir);
		}

		//HashSet ==> list
		List<Integer> list = new ArrayList<Integer>(hs);

		//오름차순 정렬
		Collections.sort(list);
		for(int num :  list) {
			System.out.print(num + "\t");
		}
	}

}
