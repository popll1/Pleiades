package inner;
//중첩 클래스 406 페이지
//클래스 속 클래스 
//2023-06-27
/* 
 * 
 */

class A{
//멤버필드
	
	class B{}  //인스턴스 멤버 클래스
	static class C {} // 정적 멤버 클래스  

	public void me1() { 
		class B{}  //인스턴스 멤버 클래스
	}
	public void me2() {
	
		class B{}
	
	
}



public class InnerClass01 {
	public static void main(String[] args) {
			A a = new A();
	}
}
}