package jun07;

public class Test03 {
	public static void main(String[] args) {
		boolean bool = !(1 + 1 == 3);
		int num = 10;
		
		if ( num  < 5  || bool) {// 조건식이 참일때 실행할 문장 if
			System.out.println("참일때 실행할 문장");
		} else {
			System.out.println("거짓일때 실행할 문장");
		}//탈출	
	}
}
