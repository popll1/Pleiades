package inner;
//p409
//로컬 클래스
/* 중첩 클래스는 메소드 내에서도 선언할 수 있습니다.
 *  = 로컬 클래스
 *  로컬 클래스는 접근제어자 및 static를 붙일 수 없습니다.
 *  로컬 클래스는 메소드 내부에서만 사용되므로 접근제어가 필요없다.
 *  로컬 클래스 내부에는 인스턴스 필드와 메소드만 선언가능하고
 *  정적 필드와 메소드는 선언할 수 없습니다.
 *  
 * 
 * 
 * 
 */

class LA { 
	void method() {// 메소드 속 
		class LB {// 로컬 컬래스
			public LB() {//생성자
		System.out.println("LB가 만들어 졌습니다.");
		}//생성자
			int num;
			void method() {}
//			static int number;// 사용하지 말라고!
//			static void method() {}//사용하지마
			
		}//local class end
		LB lb = new LB();
		lb.num = 100;
		lb.method();
	}
}
public class LocalClass01 {
	public static void main(String[] args) {
		LA la = new LA();
		la.method();
		
	}
}
