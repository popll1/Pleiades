package jun13;

import java.util.Scanner;

public class String02 {
	public static void main(String[] args) {
		
	
	//이메일 판별하기
	// poseidon@kakao.com
//	String email = "poseidon@kakao.com";
	System.out.println("이메일을 입력하세요");
	Scanner sc = new Scanner(System.in);
	String email = sc.nextLine();  // 입력대기
	//System.out.println(email.indexOf('@'));// 8
	if(email.indexOf('@') == - 1) {
		System.out.println("올바른 형식이 아닙니다.");
	}else {
//		System.out.println("올바른 e-mail 입니다.");
		String id = email.substring(0, email.indexOf('@'));
		String server = email.substring(email.indexOf('@') +1);
		System.out.println("아이디 : "+ id);
		System.out.println("서버 : "+ server);
		if(server.endsWith(".com") || server.endsWith(".net")) {
			System.out.println("올바른 서버 입니다.");
		}
		
		String msg = String.join("",id, "님 반갑습니다.");
		System.out.println(msg);
		
		
		//endWith()
//		System.out.println(email.endsWith(".com"));
//		System.out.println(email.endsWith(".net"));
		//.com
		//.net
		//.co.kr
		//.org
	}
 	
	
	
}
}
