package sec02.exam01;

public class TrycatchFinallyExample {
	public static void main(String[] args) {
		try { 
			Class claszz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException b) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		
	}
}


