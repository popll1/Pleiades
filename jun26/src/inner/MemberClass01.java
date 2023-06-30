package inner;

import java.lang.reflect.Member;

//멤버 클래스
/*
 * 내부에 있는 앞에 static 붙으면 정적 클래스
 * 내부에 있는 클래스 앞에 아무것도 없으면 멤버 클래스
 * 
 * 내부 클래스는 클래스 내에 선언되었으므로 인스턴스 속성처럼 사용됩니다.
 * 즉 메소드 {}안에서 유효합니다.
 * 
 * 인스턴스 변수는 클래스 내에서 선언되지만 메소드 밖에서, 생성자 밖에서 
 * 다른 블록밖에서 선언됩니다. 이 경우 반드시 초기화가 필요합니다.
 * 
 * 내부 클래스는 외부 클래스의 멤버를 사용할 수 있지만, 외부클래스는
 * 내부 클래스의 멤버변수를 사용할 수 없습니다.
 * 또한 static 붙은 메소드 내에서는 내부 클래스의 객체 선언은 X 
 *
 */
public class MemberClass01 {
	private int outerDF = 500;
	private static int SI = 100;
	int c = 777;
	
	void outerMethod() { 
		System.out.println(c);
		System.out.println(outerDF);
		System.out.println(MemberClass01.SI);
		//내부 클래스 객체 생성
		InnerMember im = new InnerMember();
		im.method();
		System.out.println(im.ix); //내것처럼 호출하기
		
		}
	public static void outterM() {
//		InnerMember im2 = new InnerMember();// 생성불가능 = static 
	}
		
	
	
	public  class InnerMember {
		private int ix = 1;
		int outDF = 10;
		static final int B2 = 222;//static 은 final 붙은것만 처리가능
		
		public void method() { 
			int methodInt = 130;
			
		}
		}//class end
	public static void main(String[] args) { 
		MemberClass01 inst = new MemberClass01();
		MemberClass01.InnerMember in = inst.new InnerMember();
		in.method();// 이렇게 호출할수 있다.
	}
	}


