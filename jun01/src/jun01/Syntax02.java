package jun01;

public class Syntax02 {//클래스
	
	int num () {//메소드
		return 1;
		
}
	void add() {//메소드
	}	
	static void sum() {//메소드
		
	}
	public static void print() {//메소드
		System.out.println("프린트 메소드 입니다.");
	
	}
	
	
	// 아래 "메인메소드"가 처음 인식(시작)되어 위의 메소드들은 읽지 않는다.
	// 구동순서 :  클래스 -> 메인메소드 -> } 종료
	
	
	
	public static void main(String[] args) {
		//명령어 : 메소드 속에 들어가 있어야 합니다.
		//선언, 대입, 초기화, 명령
		int number = 10 ;//변수 선언 = 초기화
		number = 100;//대입
		System.out.println(number);//변수 출력
	//} 주석해제시 아래 출력안됨
		print();// print 메소드 호출
	}
	
}
