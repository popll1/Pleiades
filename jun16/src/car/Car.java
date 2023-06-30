package car;

public class Car {
	//필드 = 인스턴스 변수, 클래스 변수
	static String company = "현대자동차"; //클래스 변수 = 클래스명. 변수명
	String model; // 인스턴스 변수 = 인스턴스변수명.변수명
	String color;
	int maxSpeed;
	
	Car() { 
		System.out.println("----------------------");
	}
	
	Car(String model){
		this();// 반드시 첫번쨰 줄에 있어야 합니다.
		this.model = model;
	}

	Car(String model, String color){
//		this.model = model;
		this("퇴근하고 싶다.");
		this.color = color; 
	}
	
	Car(String model, String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
		this(color, color);
		this.maxSpeed = maxSpeed;
	}
	public static void main(String[] args) {
		//static 붙은  변수 호출하기
		//클래스명. static 붙은 변수명;
		Car.company = "현대자동차입니다.";
		
		
		
		Car car1 = new Car();
		System.out.println(Car.company);
		
		Car.company = "현대아니야";
	
		Car car2 = new Car("자가용");
		System.out.println(car2.company);
		System.out.println(car2.model);
		
		Car car3 = new Car("자가용","빨강");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		
		Car car4 = new Car("택시","검정", 200 );
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		
	}

	}

