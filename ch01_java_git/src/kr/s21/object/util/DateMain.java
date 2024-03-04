package kr.s21.object.util;
import java.util.Date;
import java.text.*;

public class DateMain {
	public static void main(String[] args) {
		Date now = new Date	();
		System.out.println(now);
		System.out.println(now.toString());
		System.out.println("-----------------------------");
		
		//deprecated 되어 사용하지 않음
		//System.out.println(now.toLocaleString());
		
		//연도 - 2자리 출력 , 시, 분까지 출력
		DateFormat df = DateFormat.getInstance()	;
		String today = df.format(now);
		System.out.println(today);
		System.out.println("-----------------------------");
		
		//연도 - 4자리 출력 , 시. 분. 초 모두 출력
		df = DateFormat.getDateTimeInstance()	;
		String today2	= df.format(now);
		System.out.println(today2);
		System.out.println("-----------------------------");
		
		//날짜만 출력 , 연도 - 4자리
		df = DateFormat.getDateInstance();
		String today3 = df.format(now);
		System.out.println(today3);
		System.out.println("-----------------------------");
		
		//시간만 출력, 시. 분. 초 모두 출력
		df = DateFormat.getTimeInstance();
		String today4 = df.format(now);
		System.out.println(today4);
		System.out.println("-----------------------------");

		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh:mm");
		String today5 = sf.format(now);
		System.out.println(today5);
	}
}
