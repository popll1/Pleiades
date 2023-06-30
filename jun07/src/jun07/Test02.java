package jun07;


// 이름 만드는 방법, class, method, var, data type
// if, for
class AppleKorea{
	public void apple() {
		System.out.println("i am apple");
	}
	
}

public class Test02 {
	// 메소드 속에 메소드가 들어가??  => 불가능.
	
	public static void ppp() {
		System.out.println("i am ppp");
	}
	public static void print() {
		ppp();
	}
	public static void main(String[] args) {
		
		int i = 100;
		String str = new String("R"); // 인스턴스 만들기 ; new는 클래스 타입의 인스턴스(객체)를 생성해주는 역활을 한다.  
		String str1 = "R"; 
		print();// 이렇게 한다면?
		// 출력순서 main 에서 위 print를 실행하기-> print 메소드-> ppp메소드 -> 종료

       //AppleKorea 클래스 불러오기
		AppleKorea appleKorea = new AppleKorea();
		//메소드 실행하기		
		appleKorea.apple();
	}

}
