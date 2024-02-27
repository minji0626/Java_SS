package kr.s08.object.method;

public class OverloadingMain02 {
	
	//문자열의 길이 -> length
	public void getLength(String s) {
		System.out.println(s + "의 길이 : " + s.length());
	}
	public void getLength (int n) {
		String s = String.valueOf(n); // int => String
		getLength(s);
	}
	public void getLength (float a) {
		String s = String.valueOf(a);
		getLength(s);
	}
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();	
		om.getLength("Hello");
		om.getLength(500000);
		om.getLength(3.14f);
	}
}