package exception;

//예외처리하기
public class Exception02 {
	public static void main(String[] args) {

		try {

			Class clazz = Class.forName("java.lang.String");

		}

		catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
		System.out.println("try~catch 블럭 끝. 정상종료");
	}
}
