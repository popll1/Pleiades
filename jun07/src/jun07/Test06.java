package jun07;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//아이디 = admin , 비밀번호 = 01234567
				String id = "admin";
				String pw = "01234567";
				String inputID , inputPW;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("ID 입력 : ");
				inputID = sc.nextLine();
				
				System.out.println("PASSWORD 입력 : ");
				inputPW = sc.nextLine();
				//p타입 비교떄 사용하는 == , R 타입의 == 같은 객체	
				if( id.equals(inputID) && pw.equals(inputPW) ) { 
					System.out.println("정보가 일치 합니다.");
					
				} else { 
					System.out.println("정보가 일치 하지 않습니다.");
				}
				
				
			
	}
}
