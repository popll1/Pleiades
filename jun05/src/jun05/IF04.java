package jun05;

import java.util.Scanner;

public class IF04 {
	public static void main(String[] args) {
		// /n 줄바꿈 \t
		System.out.println("숫자를 입력하세요\n 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		//0~9
		if ( input == 0 ) {
		System.out.println("0입니다.");
		} else if  (input == 1) {
		System.out.println("1입니다.");
		} else if  (input == 2) {
		System.out.println("2입니다.");
		} else if  (input == 3) {
		System.out.println("3입니다.");
		} else if  (input == 4 ) {
		System.out.println("4입니다.");
		} else if (input == 5) {
		System.out.println("5입니다.");
		}else {
		System.out.println("5보다 큽니다..");
	}
	
	}
}
