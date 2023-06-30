package jun02;

public class Hello01 {
	private static char[] dNumber;

	//메인메소드는 반드시 이 모양이어야 한다.
	public static void main(String[] args) {//main 메소드
		int number;//변수선언
		number = 100;  // 변수에 값 대입
		
		int num = 101; //변수 선언 + 값대입 == 변수 초기화
		//리터럴
		
		//3.14
		double num1 = 3.14; // <--------- int 는 정수 이므로 실수 'double' Data Type 사용.
		
		String num2 = "hello"; // 문자열은 ""로 이루어짐, 'String'Data Type 사용
		// 대입기호수준으로 양 변의 데이터 타입이 동일해야 대입
		
		int num3 = num;
		
		num1 = 3.333333;
		
		num3 = (int) 3.3333333333;//형변환 = 데이터타입 변환
		//cast = 값의 절삭(소수점이 없음)
		
		System.out.println(num3);
		
		int iNumber = 14;
		double dNumber = iNumber; // 자동 대입 = 프로모션 
		//왼쪽변이 더 큰 타입이라 int가 자동 대입됩니다.
		
		System.out.println(dNumber);//14.0

		
		
		
	}

}
//변수 : 변하는 수 <-> 상수 : 변하지 않는 수 
//프로그램이 진행할 때 중간의 값을 저장해두기 위한 공간
//데이터타입 변수이름; = 변수 선언 = 명령어