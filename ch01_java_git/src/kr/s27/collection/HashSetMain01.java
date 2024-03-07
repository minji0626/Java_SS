package kr.s27.collection;
import java.util.*;

public class HashSetMain01 {
	public static void main(String[] args) {
		// HashSet : 중복값 불허
		String[] array = {"Java" , "JSP", "Java", "Oracle"};
		HashSet<String> hs = new HashSet<String>();
		
		for (String n : array)	{
			hs.add(n); //중복 불허
		}
		// 저장된 요소의 목록
		System.out.println(hs);
		System.out.println("----------------------------------");
		// 저장된 요소의 출력
		Iterator<String>ir = hs.iterator();
		while (ir.hasNext()){
			System.out.println(ir.next());
		}
		System.out.println("----------------------------------");
		for (String s : hs) {
			System.out.println(s);
		}
	}
}