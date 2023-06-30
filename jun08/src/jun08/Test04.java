package jun08;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
				String input;
		
		System.out.println("암호화 할 문장을 입력하세요.");
		System.out.println("입력 : ");
		
		input = sc.nextLine();
		//입력받은 문장을 모두 대문자화 하기
		input = input.toUpperCase();
	
//		System.out.println(input);
//		String to char
		
		char[] chinput = input.toCharArray();//스트링 -> char배열
		System.out.println(Arrays.toString(chinput));
				
				for (int i = 0; i < chinput.length; i++) {
					//만약 chinput[i]+3한것이 X를 넘어간다면 다시 A로
					if(chinput[i]+3 >= 'x') {
						System.out.println((char)chinput[i] -23);
					}else { 
						System.out.println((char)chinput[i]+ 3 );
					}
					
					System.out.println((char)(chinput[i] + 3));

}
}
}