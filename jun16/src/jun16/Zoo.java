package jun16;
//dog 클래스를  만들어 주세요

//생성과 동시에 이름과 나이를 지정하는 생성자를 만들어주세요.
//메인 메소드에서 인스턴스를 발생시키고 출력해주세요.

class Dog {

	
	
	String name, addr;
	int age;
	//this();
	public Dog(String name) {
		
		this.name = name;
//		System.out.println("뭐?");
	}

		
		
		
	public Dog(String name, int age) {
	
		this(name); // 생성자 호출
		this.age = age;
		System.out.println(name + " 입니다." + age + " 짤 입니다.");
	}
	public void sleep() {
		System.out.println(this.name+ "가 잠을 자요");
		
	
	
	}
	
	public Dog(String addr, String name , int age) {
		this(name, age);
		this.addr = addr;
		//생성자 호출
		/* 같은 클래스에 정의된 다른 생성자를 호출하는 키워드 this();
		 * 호출하려면 생성자의 파라미터 순서에 맞게 호출하면 자동으로
		 * 호출됨
		 * 
		 * 단 this 생성자 호출은 생성자 첫줄에만 호출가능
		 * 호출은 단 한번만 가능하다,
		 */
	}
}

public class Zoo {

	public static void main(String[] args) {
		Dog a = new Dog("3피오",5);
		Dog dog = new Dog("개새끼", 5);
		System.out.println(dog.age);
	}

}
