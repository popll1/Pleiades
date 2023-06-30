package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//phone phone  = new phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();  // smartPhone 에서 Phone 에 있는 turnon 을 호출했으니 phoneexample 에도 호출가능
		smartPhone.internetSerch();
		smartPhone.turnOff();		
	}
}
