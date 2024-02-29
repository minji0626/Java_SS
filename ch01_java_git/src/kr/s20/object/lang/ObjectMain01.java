package kr.s20.object.lang;

public class ObjectMain01 {

	public static void main(String[] args) {
			ObjectMain01 ob = new ObjectMain01();
			System.out.println(ob.getClass()); // 클래스 정보 주는 실행문
			System.out.println(ob.getClass().getName()); // 클래스 정보 중에서 클래스명을 반환
			System.out.println(ob.hashCode()); //10진수의 유니크한 값 hashcode 반환
			System.out.println(Integer.toHexString(ob.hashCode())); //10진수를 16진수로 변환
			System.out.println(ob.toString());
			System.out.println(ob);
	}

}
