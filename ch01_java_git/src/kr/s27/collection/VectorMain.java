package kr.s27.collection;
import java.util.*;

public class VectorMain {
public static void main(String[] args) {
	Vector<Double> v = new Vector<Double>();
	
	//요소의 추가
	v.add(100.3);
	v.add(3.14);
	v.add(1000.); // = 1000.0

	// 확장 for 문을 이용한 출력
	for ( Double n : v) {
		System.out.println(n);
	}
	System.out.println("--------------------");
	
	//요소 검색
	double search = 1000.0; // 검색할 요소
	int index = v.indexOf(search);
	if ( index != -1) {
		System.out.println("검색 요소 " + search + "의 위치 : " + index);
	}
	else{
		System.out.println("검색 요소 " + search + " 해당 없음.");
	}
	System.out.println("-------------------------");
	
	//요소 삭제
	double del = 3.14; // 삭제할 요소
	if(v.contains(del)) { // 삭제할 요소가 Vector의 요소인지 검사
		v.remove(del);
		System.out.println(del + " 삭제가 완료되었습니다!");
	}
	else {
		System.out.println("해당 요소가 없습니다.");
	}
}
}
