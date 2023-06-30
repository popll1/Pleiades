package jun07;

public class Test07 {
	public static void main(String[] args) {
		//String 클래스는 같은 값이 있으면 동일한 값을 저장합니다.
		//String 는 변경불가는한 값은 저장
		String str = "admin";
		String str2 = "admin";
		str = "111111";
		
		//참조타입에서는 값 비교가 아니라 객체비교
		//https://shanepark.tistory.com/330  String 해당 site 참고		
				
				System.out.println(str == str2);
	}
}
