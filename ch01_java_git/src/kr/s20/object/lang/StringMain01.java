package kr.s20.object.lang;

public class StringMain01 {

	public static void main(String[] args) {
		//암시적으로 문자열 생성
		String str1 = "abc";
		String str2 = "abc"; // 문자열이 같기 때문에 객체의 주소를 공유한다
		
		// 객체 비교 : 공유하는 중___메모리를 절약
		if (str1 == str2) {
			System.out.println("str1 과 str2는 같은 객체");
		}
		else {
			System.out.println("str1 과 str2는 다른 객체");
		}
		
		//문자열 비교
		if(str1.equals(str2)) {
			System.out.println("str1 과 str2의 내용이 같다.");
		}
		else {
			System.out.println("str1과 str2의 내용이 다르다");
		}
		
		System.out.println("---------------------------");
		
		// 명시적으로 문자열 생성
		String str3 = new String ("Hello");
		String str4 = new String ("Hello"); // 문자열이 같지만 명시적으로 문자열을 생성했기 때문에 객체의 주소를 공유하지 않는다.
		
		// 객체 비교
		if (str3 == str4) {
			System.out.println("str3과 str4는 같은 객체");
		}
		else {
			System.out.println("str3과 str4는 다른 객체");
		}

		//=> 같은 문자열을 암시적으로 객체를 생성하게 되면 객체 주소와 문자열 모두 같다
		//=> 다른 문자열일 경우에는 객체 주소도 달라지고 문자열도 다르다. 대소문자의 차이도 문자열에서는 다르다고 판단한다!
		//=> 같은 문자열을 명시적으로 객체를 생성하게 되면 객체는 다르지만 문자열은 같다.
		//=> 다른 문자열일 경우 객체 주소도 다르고 문자열도 다르다! 대소문자의 차이도 다른 것이기 때문에 헷갈리지 말 것!
		
		System.out.println("---------------------------");
		
		
		String str5 = "BUS";
		String str6 = "bus";
		
		//대소문자 구분하지 않고 문자열 비교
		if(str5.equalsIgnoreCase(str6)) {
			System.out.println("대소문자 구분 없이 str5와 str6은 내용이 같다.");
		}
		else {
			System.out.println("대소문자 구분 없이 str5와 str6은 내용이 다르다.");
		}
		
	}

}

/*
 * 문자열 - 명시적으로 객체										객체 생성
 * String s = new String ("하늘"); ------------------> s :하늘 
 * String s3 = new String("하늘"); ------------------> s3 : 하늘
 * 
 * 문자열 - 암시적으로 객체										객체 생성
 * String s2 = "바다"; ------------------------------> s2 , s4 : 바다 => 내용이 동일하기 때문에 객체 주소 공유
 * String s4 = "바다"; ------------------------------> s2 , s4 : 바다 => 내용이 동일하기 때문에 객체 주소 공유
 */
