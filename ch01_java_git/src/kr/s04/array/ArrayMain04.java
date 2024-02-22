package kr.s04.array;

import java.lang.reflect.Array;

public class ArrayMain04 {

	public static void main(String[] args) {
		int sum = 0;
		float avg = 0.0f;
		
		//배열 선언, 생성, 초기화
		int[] score = {100,88,88,100,90};
		
		//총점 구하기
		for( int i = 0; i < score.length; i++ ) {
			sum += score[i];
		}
		
		avg = (float) sum / score.length;
		
		System.out.println(sum);
		System.out.println(avg);

	}

}
