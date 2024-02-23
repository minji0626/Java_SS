package kr.s04.array;

public class ArrayMain08 {
							//함수 			//인자
	public static void main(String[] args) {
		// 클래스를 실행할 때 외부에서 데이터 전달
		//run as -> run configuration -> browse에서 현재 파일 선택 -> arguments에서 출력하고 싶은 문구 입력후 run실행
		
		if(args.length > 0) {
			for (int i = 0; i <args.length; i++) {
				System.out.println( i + " : " + args[i]);
			}
		}
		else {
		//전달되는 데이터가 없음
			 System.out.println("입력한 내용이 없습니다.");
		}
	}

}
