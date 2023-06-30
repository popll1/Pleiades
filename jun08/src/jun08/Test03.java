package jun08;

import java.util.Scanner;

//// 알파벳을 A-Z 까지 저장하는 배열을 만들어주세요
public class Test03 {
	public static void main(String[] args) {
		char[] arr01 = new char[26];
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = (char) (65+i); 
		}
		//System.out.println((int) 'A');//65
		//System.out.println((char) 65);//a
		System.out.println(arr01);
	}
	
}
		




//char[] alphabetArray = new char[26];
//
//// 알파벳 A부터 Z까지 배열에 저장
//for (int i = 0; i < 26; i++) {
//    alphabetArray[i] = (char) ('A' + i);
//}
//
//// 사용자로부터 입력 받기
//Scanner scanner = new Scanner(System.in);
//System.out.print("인덱스를 입력하세요 (0부터 25까지): ");
//int index = scanner.nextInt();
//
//// 입력 받은 인덱스에 해당하는 알파벳 출력
//if (index >= 0 && index < 26) {
//    char selectedAlphabet = alphabetArray[index];
//    System.out.println("선택한 알파벳: " + selectedAlphabet);
//} else {
//    System.out.println("유효한 인덱스 범위가 아닙니다.");
//}
//
//scanner.close();
//}


}
		
		    
	
		

