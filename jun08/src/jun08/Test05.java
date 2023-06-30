package jun08;
//string 자르기
public class Test05 {
	public static void main(String[] args) {
		
		String word = "Hello";
		//             01234
		System.out.println(word.length());//5 
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print( (char) (word.charAt(i) + 3));
		}
		
		
		//System.out.println(word.charAt(4));
		System.out.println("====================");
		System.out.println(word.substring(2)); // index 위치 2 부터
		System.out.println(word.substring(0,2));//	he 
		System.out.println(word.substring(2,4));//	he 
		
		String name = "가나다라마법사";
	    String shortName = name.substring(4, name.length());
	    System.out.println(shortName);
	    
	}
}
