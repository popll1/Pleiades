package jun13;

import java.util.Arrays;

//String 사용법
/* 문자열, "값", 값 불변, 주소, 참조타입
 * 
 * 
 */
public class String01 {
	public static void main(String[] args) {

		int num = 10;
		int num2 = 10;

		String str = new String("Hi");
		String str2 = new String("Hi");
		// R 타입 ==은 비교가아닌 같은 주소 비교
		if (str.equals(str2)) {

			System.out.println("같습니다.");
		} else {
			System.out.println("달라요");

		}
		// 문자열 = 문자 + 문자 + 문자 + 문자.....
		char[] ch = { '가', '&', 'A', '1' };
		String str3 = new String(ch);
		System.out.println(str3);

		byte[] by = new byte[] { 65, 66, 67, 68, 69, 70 };
		String str4 = new String(by);
		System.out.println(str4);

		String str5 = new String(by, 0, 3); // src, 시작위치, length
		System.out.println(str5);

		str2 = "안녕하세요.";
		System.out.println(str2.length());
		char ch2 = str2.charAt(0);
		System.out.println(ch2);

		for (int i = 0; i < str2.length(); i++) {
			System.out.println(str2.charAt(i));

		}
		System.out.println("======================");
		str2 = " 가나다라마바사";
		System.out.println(str2.length());
		// 맨 마지막 글자 "사"를 뽑아주세요
		System.out.println(str2.charAt(7));
		System.out.println(str2.charAt(str2.length() - 1));

		String str6 = "vehnlgweohiiwaeejkweahgijgvbajkehfkagwghawjklghawejk";
		// 여기에서 e가 몇개 있는지 갯수를 출력해주세요
		int n = 0;
		for (int i = 0; i < str6.length() ; i++) {

			if (str6.charAt(i)== 'e') {
			 n++;
			}
			
			
			
				
			}
		System.out.println(n);
		System.out.println("===========");
			
			String str7 = str2.concat("님"); //가나다라마바사
			System.out.println(str7);
			
			System.out.println(str2.contains("님"));
			System.out.println(str7.contains("님"));
			System.out.println(str7.contains("가"));
			System.out.println(str7.contains("가나다"));
			
			System.out.println(str7.indexOf("나")); //2
			System.out.println(str7.indexOf("님"));// 8
			System.out.println(str7.indexOf("라마바"));// 4
			System.out.println(str7.indexOf("타"));// -1
			
			String apple = "apple";
			apple = apple.replaceAll("p", "피");
			System.out.println(apple);
			
			//substring
			String result = str2.substring(0); //"가나다라마바사"
			System.out.println(result);
			
			result = str2.substring(1, 5);//시작 index, 끝index
			System.out.println(result);
			
			//equalsIgnoreCase()
			apple = "apple";
			System.out.println(apple.equalsIgnoreCase("apple")); // 대소문자 구분없이 일치하는지
			System.out.println(apple.equalsIgnoreCase("APPLE"));
			System.out.println(apple.equals("apple"));
			System.out.println(apple.equals("APPLE"));
			
			// getByte()
			byte[] appleByte = apple.getBytes();
			System.out.println(Arrays.toString(appleByte));
			
		}
		
	}
