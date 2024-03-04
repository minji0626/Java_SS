package kr.s21.object.util;
import java.util.*;

public class CalendarMain01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance()	;
		//System.out.println(today);
		System.out.println("======================");
		
		int year = today.get(Calendar.YEAR); // 연도
		int month = today.get(Calendar.MONTH) + 1; //기본값으로 0 ~ 11로 반환하기 때문에 +1을 해줘야 현재 달에 맞게 출력된다.
		int date = today.get(Calendar.DATE) ;
		
		System.out.printf("%d년 %d월 %d일 ", year , month, date);
		
		int day = today.get(Calendar.DAY_OF_WEEK); //요일 반환 1 ~ 7로 반환
		String [] days = {"일" , "월" , "화" , "수" , "목", "금" , "토"}; //인덱스는 0 ~ 6
		// 그래서 요일 반환 값에서 - 1 을 해야 인덱스 값과 같아짐
		System.out.print(days[day - 1] + "요일");
		
		int amPm = today.get(Calendar.AM_PM); // 오전 0 , 오후 1 반환
		String str = amPm == Calendar.AM ? "오전" : "오후" ; //0과 같다면 오전 반환, 다르면 오후 반환
		
		int hour = today.get(Calendar.HOUR); //(12시 표기) //HOUR_OF_DAY(24시 표기)
		int min = today.get(Calendar.MINUTE); // 분
		int sec = today.get(Calendar.SECOND); // 초
		System.out.printf(" %s %d시 %d분 %d초", str , hour, min, sec);
		
	}

}
