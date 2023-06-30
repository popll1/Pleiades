package jun07;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 주민등록번호 뒷자리 첫숫자를 입력했을떄
		// 남자인지, 연자인지 판별하는 프로그램
		// 840505-4000000
		
		System.out.println("---------------------- 남자 & 여자 판별기------------------");
		System.out.println("주민번호 뒷자리 첫번째 숫자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if ( num == 1 || num ==3 ) {
			System.out.println("남자입니다.");
			
		} else if ( num == 2 || num == 4){
			System.out.println("여자입니다.");
			
		}else {
			System.out.println("잘못 입력하셧습니다.");
			
		}
		System.out.println("--------------------------------------------------------");
	
		sc.close();
		
	}
}
