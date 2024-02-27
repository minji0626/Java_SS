package kr.s08.object.method;

public class MethodArgMain03 {

	/*
	 Variable Arguments
	 자료형이 일치할 때 전달하고자 하는 값의 개수를 다르게 지정할 수 있는 문법
	 전달되는 데이터는 내부적으로 배열로 인식한다.
	 */
										//데이터를 전달하는 배열이고 배열명이 n이다.
	public void argTest (int ... n) {
		for(int i  =0; i <n.length; i++) {
			System.out.println("n[" + i + "] : " + n[i]);
		}
		System.out.println("=============");
	}
	
	public static void main(String[] args) {
		
		MethodArgMain03 ma = new MethodArgMain03();
		ma.argTest();
		ma.argTest(1);
		ma.argTest(10,20,30);
	}

}
