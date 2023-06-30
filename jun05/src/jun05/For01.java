package jun05;
// 자바의 반목문 : for 문
/*
 * 프로그래밍에서 필요에 따라 특정 명령을 반복적으로
 * 실행해야 할 때가 있습니다.
 * 이때 사용되는 구문이 반복문입니다.
 * 자바에는 3개의 반목문이 있습니다.
 * for, while, do~ while
 * 
 * 문법
 * for(변수 초기화; 변수 조건문; 변수 증감식){
 *		변수 조건문이 참일때 실행할 반복문;
 *
 */
public class For01 {
	public static void main(String[] args) {
	
		for (int i = 10; i >= 0 ; i--) {// 0~4 
			System.out.println(i ); //1
			if (i == 0 ) {
			System.out.println("발사"); //1
		}
		}

	}
}
