package jun14;
//split
import java.util.Arrays;
import java.util.Scanner;

//클래스 선언
class Apple {
		//필드	= 변수 = 인스턴스 변수
		String color;
		int age;
		//생성자= 인스턴스를 발생하기 위한 코드 = 메소드
		
		//메소드
		// 지역변수는 초기화 해야 합니다. = 값선언까지 완료
		// ex ) int i = 10; // 선언 + 값대입 = 초기화
		public void info() { 
			System.out.println("색상 : " + color);
			System.out.println("나이 : " + age );
		}
}

public class String03 {
	public static void main(String[] args) {
		
		String tel = "010-2799-2216" ;
		
		String[] telSplit = tel.split("-"); // - 를 자를 기호로 사용
		
		System.out.println(Arrays.toString(telSplit));
		// [010, 2799, 2216]
		String pet = "R2D2가, 배고프다고, 합니다";//잘라주세요
		//우리가 스물다섯 분이니... 5팀 5명씩?
		//6명씩 4팀(한 팀 7)
		  String[] petSplit = pet.split(",");
	      System.out.println(Arrays.toString(petSplit));
	      String[] petSplit2 = pet.split(",",2);
	      System.out.println(Arrays.toString(petSplit2));
	      System.out.println(petSplit[1]);
	      System.out.println(petSplit2[1]);
		
		
		String test = "가 나다 라마 바 사아자 차카 타파 하";
		String[] spliTest = test.split(" ");
		System.out.println(Arrays.toString(spliTest));
		System.out.println(spliTest[2]);
		System.out.println(spliTest[4]);
	
		//인스턴스 만들기
		// 데이터타입 변수명 = 값;
			int         num = 100;
		Apple apple = new Apple();
		Apple apple2 = new Apple();
		String str = new String("Hi");
		Scanner sc = new Scanner(System.in);
		
		apple.color = "빨강"; 
		apple.age =10;
		apple.info();
		
		System.out.println(apple2.color);
		System.out.println(apple2.age);
	}
}

// 지금까지 했던거....
/*
 * 데이터 타입 이름만들기 변수, 상수, 클래스, 메소드 if, switch for, while, do~while break, continue
 * 랜덤 배열, 1 , 2차, 동적 가변배열 , 배열복사, 깊은복사 , 얕은 복사
 * 
 * main 메소드 속에서만 작업했어. -> 다른 메소드, 다른 클래스, 다른 패키지

 *
 *
 *
 *1. 메인 메소드(파라미터) 사용해보기
 *2.  객체지향
 *3. 클래스 형태, 메소드 형태, 파리미터, 리턴타입
 *
 *
 *
 *
 */



