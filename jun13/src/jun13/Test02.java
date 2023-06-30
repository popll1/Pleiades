package jun13;

import java.time.LocalDate;
import java.time.LocalDateTime;

// 사용하지 않는 import  지우기 : ctrl + shift + 

//아스키 코드 시계
public class Test02 {
	public static void main(String[] args) {
		// 1 1
		// 3 10
		// 10 1010
		// 12 1100

		System.out.println(Integer.toBinaryString(59));
		// 1 1 1 0 1 1
		// 32 16 8 4 2 1
		System.out.println(32 + 16 + 8 + 2 + 1);
		System.out.println("========================");
		//Date
		LocalDate ld = LocalDate.now();
		// 현재 년-월-일 가져오기
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());//영어식
		System.out.println(ld.getMonthValue());//숫자
		System.out.println(ld.getDayOfMonth());
		
		System.out.println("=================");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());
		
		System.out.println(Integer.toBinaryString(ldt.getHour()));
		System.out.println(Integer.toBinaryString(ldt.getMinute()));
		System.out.println(Integer.toBinaryString(ldt.getSecond()));
	}
	
}
