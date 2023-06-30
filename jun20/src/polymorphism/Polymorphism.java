package polymorphism;

import java.util.HashSet;
import java.util.Set;

//다형성 Polymorphism
/*
 * 다양한 형태로 변할 수 있는 것.
 * 다형성은 동적 바인딩 : 런타임 때 최종 타입이 결정되는 것
 * 다형성을 지원하려면 그 언어가 동적 바인딩을 지원해야 함.
 * 
 * 컴파일 타임 떄 에러 판정이 납니다.
 * 
 * 다형성의 한계 : 상위 클래스에 만들어진 메소드에 한해 가능합니다.
 * 
 */
class Hero{
	public String name;
	public void attack() {
		System.out.println("기본 공격");
	}
}
class Ironman extends Hero { 
	public int suitCount;
	
	@Override
	public void attack() {
		System.out.println("레이저 공격");
	}
		public void makeSuit() { 
		System.out.println("Javis! 슈트만들어.");
	}
}

class Hulk extends Hero { 
	@Override
	public void attack() {
			System.out.println("주먹공격");
		
	}
}

class SpiderMan extends Hero{ 
	@Override
	public void attack() {
				System.out.println("거미줄");
	
	}
}

public class Polymorphism {
		public static void main(String[] args) {
			
			Hero h1;//컴파일
			h1 = new Ironman();//런타임때
				// 반드시 상위 타입이 앞에 와야 합니다.
			
			h1.attack();
			Ironman ironman = (Ironman) h1;
			ironman.makeSuit();
			
			System.out.println(h1);
			System.out.println(ironman);
			
			Hulk hulk = new Hulk();
			SpiderMan man = new SpiderMan();
//			ironman.attack();
//			hulk.attack();
//			man.attack();
		
		
			Set<Hero> set = new HashSet<Hero>();
			set.add(ironman);
			set.add(hulk);
			set.add(man);

			for (Hero hero : set) {
				hero.attack(); // List, 배열에 대입해 보기
			}
			
		
		}
}
