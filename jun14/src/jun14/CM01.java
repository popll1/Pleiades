package jun14;
//사람을 만들어보겠습니다.

class Human {
	
	// 필드
	
	String name;
	byte age;
	String addr;
	String id;

	// 메소드 : 되돌려 주는 타입, void 는 되돌려 주는 값이 없을때
	public double what() {
		return 3.14;
	}

	public boolean eat() {
		return 1 + 1 == 3;
	}

	public int sleep() {
		return 1;

	}

	public void work() {
		System.out.println(name + "Zzzzzz");
		String ng = "홍길동";
		name = ng;
		System.out.println(name);
	}
}
	public class CM01 {
		public static void main(String[] args) {
			
			
			Human human = new Human();
			System.out.println(human.name);
			System.out.println(human.sleep());
			human.work();
			
			Apple a1= new Apple();
			System.out.println(a1.age);
			
		}
	}

