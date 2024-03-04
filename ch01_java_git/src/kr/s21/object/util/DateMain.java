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
		
		System.out.println();

	}
}
