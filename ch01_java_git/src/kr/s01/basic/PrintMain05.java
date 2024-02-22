package kr.s01.basic;

public class PrintMain05 {

	public static void main(String[] args) {
		//System.out.printf(포맷문자, 데이터)를 이용한 출력
		//데이터의 종류를 표시할 수 있는 포맷문자 지원
		
		// 쉽게 명시할 수 있는데 간단하게 하는 것이 좋음
		
		//문자
						//포맷 문자, 전달될 데이터
		System.out.printf("%c", 'A');
		//%c - 문자 , %n - 줄바꿈
		System.out.printf("%c%n", 'A');
		System.out.printf("%6c%n", 'B');
		//-> 6칸 확보 후 오른쪽 정렬
		System.out.printf("%-6c%n", 'C');
		//-> 6칸 확보 후 왼쪽 정렬
		
		System.out.println("==============");
		
		//정수
		System.out.printf("%d%n", 67);
		//%d - 정수 의미
		System.out.printf("%,d%n", 100000);
		//-> 3자리 단위로 쉼표 표시, 읽기 편하게 하기 위해
		System.out.printf("%5d%n", 20);
		//-> 5칸 확보 후 오른쪽 정렬
		System.out.printf("%-5d%n", 20);
		//-> 5칸 확보 후 왼쪽 정렬
	
		System.out.println("=============");
		
		//실수
		System.out.printf("%f%n", 35.896);
		//%f - 실수 의미, 실수를 명시할 때는 소수점 자리 수를 6자리를 확보
		//비어있는 자리는 0으로 채워 나타낸다.
		System.out.printf("%.2f%n", 35.896);
		//-> 소수점 셋째 자리에서 반올림하여 둘째 자리까지 나타냄
		System.out.printf("%10.2f%n", 35.8962);
		//-> 전체 자리 10칸 확보 후 소수점 셋째 자리에서 반올림하여 둘째 자리까지 왼쪽 정렬
		
		System.out.println("=============");
		
		//문자열
		System.out.printf("%s%n", "우주");
		System.out.printf("%5s%n", "하늘");
		//-> 5칸 확보 후 오른쪽 정렬
		System.out.printf("%-5s%n", "지구");
		//-> 5칸 확보 후 왼쪽 정렬
		
		//논리값
		System.out.printf("%b%n", true);
		
		//데이터의 종류가 여러개일 경우
		System.out.printf("%s는 %d점입니다.%n", "점수", 98);
		//점수 -> %S(문자열), 98 -> %d(정수)
		System.out.printf("중간고사 성적은 총점 %d, 평균 %d입니다.%n", 284, 95);
		//포맷문자는 어차피 문자열로 나오기 때문에 굳이 %s를 쓰지 않아도 괜찮다. %d가 여러개 쓰일때는 순서에 맞춰서 쓰면 된다.
		//줄 바꿈을 하려면 포맷 문자의 맨 마지막에 %n을 넣어주면 된다.
		
		
		
		
	}

}
	