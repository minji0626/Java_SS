package kr.s20.object.lang;
import java.util.Random;

public class MathMain02 {
	public static void main(String[] args) {
		String [] gift = {"스마트폰" , "TV" , "냉장고" , "X 꽝 X"};
					//index		0			1			2			3
		
		// 난수 발생 : 0 ~ 1 미만의 실수
		double ran = Math.random();
		System.out.println("발생한 난수 : " + ran);
		
		/*
		 *  0 ~ 0.9999999999
		 *  ----------------------
		 *                         *4
		 *  0 ~ 3.99999999999 => 4 곱하기 후 난수 발생 범위
		 *  ================ > 소수점 날리기 -> double 형 .... > int 형으로 바꾸기
		 */
		
		int index = (int) (ran * 4); // 0 ~ 3 범위
		System.out.println("정수로 변환한 난수 : " + index);
		System.out.println("오늘의 선물 : " + gift[index]);
		
		System.out.println("-------------------------------------------");
		
		String [] luck = {"귀인을 만납니다." , "사랑이 찾아옵니다." , "재물이 들어옵니다." , "별 소득이 없습니다."};
				//index				0						1						2							3
		Random r1 = new Random();
		
		// 0부터 인자로 전달된 값의 전까지의 범위로 난수를 발생 0 ~ 3
		index = r1.nextInt(4)	;
		System.out.println("발생한 난수 : " + index);
		System.out.println("오늘의 운세 : " + luck[index]);
		
	}

}
