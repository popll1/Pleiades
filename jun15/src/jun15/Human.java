package jun15;

import Zoo.Animal;
import Zoo.Cat;

//프로그램 로직에 필요한 것과 필요없는 거 생각하기
public class Human {
	//필드
	//사람에게 필요한 정보 -> 필요한 정보만 남기고 필요없는거 빼버림
	//데이터를 저장함.
		String name ;
		int age ;
		
	//생성자 
		//데이터를 초기화 시킴.
		
	//메소드
		//객체 동작에 해당하는것 실행블록
		void myInfo(){
			System.out.println("내 이름은 " +  name + "입니다.");
			System.out.println("내 나이는 " + age + " 살 입니다.");
		
		}
	public static void main(String[] args) {
	
		Human h = new Human();//생성자
		Human[] man = new Human[3];

		System.out.println("h : " + h);//h : jun15.Human@3d012ddd
		
		man[0] = h;
		man[1] = new Human();
		man[2] = new Human();
		man[1] = man[0]; // 메모리에서 [1]이 소거됩니다.GC = 메모리 자동관리
		
		System.out.println("array : " +man);//array : [Ljun15.Human;@626b2d4a 
		System.out.println("array[0] : " +man[0]);//jun15.Human@3d012ddd
		System.out.println("array[1] : " +man[1]);//jun15.Human@3d012ddd
		System.out.println("array[2] : " +man[2]);//jun15.Human@5e91993f
		
		
		h.name = "홍길동";
		System.out.println(h.name);
		System.out.println(man[0].name);
		System.out.println(man[1].name);
		System.out.println(man[2].name);
		
		
		System.out.println("=================");
		System.out.println(h == man[1]);// R Type에서는 객체 비교
		System.out.println(h == man[2]);// R Type에서는 객체 비교
		
		
		man[1] = new Human();
		System.out.println("array[1] : " + man[1]);//array[1] : jun15.Human@1c4af82c

		Human h2 = man[0];
		System.out.println("array[2] : " + man[2]);
		Object[] arr01 = new Object[3];
		arr01[0] = h;
		arr01[1] = 1000;
		arr01[2] = "이것도 됩니다.";
		
		String str =  (String) arr01[2];
		System.out.println(str);
		
		Human h3 = (Human) arr01[0];
		System.out.println("===============");
		//다른 패키지에 있는 클래스 호출
		Animal a = new Animal(); // 상단에 import 생성 후
		//cat 불러 오기 예제  ( ' public ' 가 붙어야 호출가능 ) 
		
		
//		Cat c = new Cat();
//		
//		
//		c.Sleep();
//		c.name  = "톰";
		
}	
}

