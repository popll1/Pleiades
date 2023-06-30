package oop;
/* 자바의 메소드 = function = func() = 
 * 자바는 클래스를 정의하고 저의된 클래스의 인스턴스를 만들어서
 * 여러가지 기능적인 일을 처리하도록 만들어진 객체지향언어입니다.
 * 
 * 위에서 기능적인 일을 담당하는 것이 메소드입니다.
 * 메소드는 우리가 산수시간에 배웠던 함수와 같은 개념입니다.
 * 
 * 즉 특정 기능(일)을 수행하도록 메소드에서 미리 정의하고 
 * 그 일이 필요할 때마다 해당 메소드를 호출해서 사용합니다.
 * 
 * 이렇게 하는 주 이유는 같은 일을 수행하는 것을 반복적으로
 * 코딩하지 않아도 되는 큰 이점이 있기 때문입니다.
 * 
 * 메소드의 기본 형식
 * 		[접근 제어자 ]  리턴타입 메소드명([파라미터..............]){
 * 					구현부 : 메소드가 하는 일 = 명령어의 집합
 * 			}
 * []는 없어도 되는 부분입니다. 나머지는 필수 입니다.
 * 
 * 
 * 메소드의 리턴 타입은 크게 두가지로 나뉩니다.
 * 리턴할 내용이 없을 떄는 void라고 적어줍니다.
 *  
 *만약 리턴할 내용이 있다면 반환되는 데이터의 데이터 타입을 void자리에
 * 적어야합니다.
 * 
 * 명령문 끝에 return이라고 적고 반환할 데이터를 적어줍나다.
 * (기본자료형 / 참조 자료형이나 공통)
 * 
 * void 타입의 리턴일때는 메소드가 값을 리턴하게 됩니다.
 * 이럴때는 에러가 납니다.
 * 
 */

class Animal {
	// 빵만들기 : 입력된 숫자만큼 화면에 " 빵을 만듭니다 " 라고 출력하고
	// 그 갯수를 리턴하는 메소드 makeBread(5)
	int makeBread(int count) {

		count = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("빵을 만듭니다.");
			count++;
		}
		return count;
	}

	int fac(int num) { // 5! = 5*4*3*2*1
		int result = num;

		for (int i = num - 1; i > 0; i--) {
			result *= i;

			System.out.println(i);

		}
		return result;
	}

	String add(int num1, int num2) {
		int result = num1 + num2;
		return result + "입니다.";
		// System.out.println("두 타입이 일치해야 합니다.");

	}

	void sleep() {// 반환타입 : , 메소드명 : , 파라미터 :

		System.out.println("Zzzzzzzzzzzzz...............");
	}

	void work(String[] arr01) {

		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
	}
}

public class OOP02 {
	public static void main(String[] args) {
		if (args[0].equals("사용")) {
			System.out.println("args를 사용합니다.");

			for (int i = 0; i < Integer.parseInt(args[1]); i++) {
				System.out.println(i + 1 + " 번 반복합니다.");
			}

		} else {
			System.out.println("옵션이 없어서 프로그램을 종료합니다.");
			// Animal animal = new Animal();
//		String[] arraSTR = {"고양이", "개", "쥐", "토끼"};
//		animal.work(arraSTR);
		}
		System.out.println("/////////////////////////");
		String[] arr = new String[3];
		arr[0] = "사용";
		arr[1] = "10";
		arr[0] = "false";

		// int number = arr[1];
		int numer = Integer.parseInt("10");
		boolean ch = Boolean.parseBoolean(arr[2]);// "true"/"TRUE" 참
//		boolean ch1 = arr[2].equals("true") ? true : false ; 
		System.out.println(ch);

		System.out.println("=============리턴타입연습=======");
		Animal animal = new Animal();
		System.out.println(animal.fac(5));

		int breadCount = animal.makeBread(5);

		System.out.println("만들어진 빵의 개수: " + breadCount);
	}
}
