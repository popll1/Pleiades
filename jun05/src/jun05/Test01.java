package jun05;
// 궁금한 거. 한 번 더 봤으면 좋은거

// 모르는 거.
// 컴파일 <-> 스크립트
// 소스코드. java -> 컴파일 ->.class
//클래스 : 클래스변수, 메소드, 생성자  
//메소드 : 함수 "Funcion
//명령어 : 

//이름 만들기 (apple, korea)  = 영어대소문자, 숫자, _, $
//	클래스 			: AppleKorea 	= ****표기법
//	메소드, 변수 	: appleKorea 	= ***표기법
//	상수 			: APPLE_KOREA 	= ***표기법 

public class Test01 {
	public static void main(String[] args) {
		// 우리반 인원수를 저장하고 싶어요.
		// 어떤 데이터 타입을 쓰면 좋은지 적어주세요.
		// 변수명은 member
		// 자바에는 P/R
		// 자바는 타언어의 비해 데이터 타입이 적은편이다.
		byte member = 25;// 128 ~ 0 ~ 127 선언 + 초기화
		//변수 활용
		member = 100;
		System.out.println(member);
		
		int num = 1000; // 데이터 스코프
		//예약어는 중복되어 쓸수 없다.
		num = member; //대입하다  <----------------------------
		// 오른쪽의 값은 왼쪽으로 넣는형식 num = 100
		//num = num + 1;
		//num++;// 변수++ 
		num += 1; // num = num + 1; 	num = ++num;	num = num++;
		num -= 1;
		//num = 0;
		//num %= 5; // 모듈러 : 나머지값
		//위 num에 저장될 값은? 몇 개? 0, 1, 0, 1
		num %= 7;
		System.out.println(num);
		
		//캐스트, 프로모션
		//int, byte
		num = (int) member;
		member = (byte) num;
	}
}
