package jun07;

import java.util.Scanner;

//만들어보기
/* 1. 사용자가 입력한 숫자 (예 12) 입력받기
 * 2. 사용자가 입력한 10진법 숫자를 2진법 숫자로 출력하기
 * (예 당신이 입력한 숫자는 12 입니다.  2진법으로는 1100 입니다.)
 */
public class Test {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  // 입력대기
		//System.out.println("입력한 숫자 : " + num);
		System.out.println("2진법  =  " + Integer.toBinaryString(num));
		
		sc.close();// 객체 닫기
	}
}
