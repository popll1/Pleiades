package jun16;

public class Human {

	// 이름이 같아도 파라미터의 수,순서, 타입이 다르면
	// 다른 메소드로 인지 = 메소드 오버로딩
	/*
	 * 
	 * 메소드 오버로딩(overloading)이란 같은 이름의 메소드를 중복하여 정의하는 것을 의미합니다. 자바에서는 원래 한 클래스 내에 같은
	 * 이름의 메소드를 둘 이상 가질 수 없습니다. 하지만 매개변수의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성ㅇ할수있습니다.
	 * 
	 * 많이 나오는 문제중의 하나.... ex) 1. 오버로드/ 오버로딩?? = 같은이름의 메소드 , 메소드 시그니처 = 한 클래스 내에서는 같은
	 * 이름의 메소드가 있으면 안됩니다. = 파라미터가 다르면 같은 이름으로 메소드명을 만들 수 있음. = 파라미터의 갯수, 순서, 타입이 다르면
	 * 다른 메소드 = 메소드를 호출할떄 파라미터로 구분해서 호출합니다.
	 * 
	 * 2. 오버라이드 / 오버라이딩?? = (상속 , 부모자식 관계) = 상위(부모) 클래스에 있는 메소드와 동일한 메소드를 = 하위(자식)
	 * 클래스에서 재정의 해서 사용하는 것.
	 * 
	 * 3. 인터페이스 알아요? = 자바는 다중 상속이 불가능 - > 이를 극복하기 위해 나옴 = 인터페이스는 스스로 객체를 생성하지 못 함.
	 * 상속용도로 사용하기 위함 = 인터페이스는 미구현 메소드(바디가 없음)로 구성됨,
	 */
	int age;
	String name;

	
	
	public Human(String name1) {
		name = name1;
	}

	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	public void add(int num1, int num2, int num3) {

	}

	public void add(long num1, int num2, int num3) {

	}

	public void add(int num1, int num2, int num3, int num4) {
	}

	public Human(int age1) {
		age = age1;
	}

	public Human(int age1, String name1) {
		age = age1;
		name = name1;
	}

	public void add(int... i) {// 무한입력되었다면
		int result = 0;
		for (int j = 0; j < i.length; j++) {
			result += i[j];

		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// 생성자 : 생성자도 메소드 : 객체의 초기화 담당
		Human h = new Human("홍길동");
		h.add(10, 20);

		System.out.println(h);
	}

}
