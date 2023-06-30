package jun02;
// 문자형, 논리형
/*
 * 문자형 : 한글자만 저장합니다.
 * 문자 하나를 저장하기 위한 타입
 * 반드시 값으로는 문자 하나만 존재해야 하며
 * 하나 이상일 경우엔 String 에 저장합니다.
 * char 타입은 정수 타입입니다.
 *
 * 크기는 음수가 없는 2byte의 범위를 가집니다.
 * (0 ~ 65,535)
 * 
 * 문자값을 표현할 때에는 반드시 홀따옴표를 이용
 * 정수타입이기 때문에 int 에 프로모션 됩니다.
 * int값 또한 문자로 변경될 수 있습니다.(cast)
 * 
 *
 */
public class DataType04 {
	public static void main(String[] args) {
		char ch = '가';// 문자열 "",캐릭터''
		ch = 'a';
		ch = '亞';
		ch = '\ub059';// 유니코드 표기, 아스키코드
		System.out.println(ch);
		
		String str = ch + "";//연결     캐릭터 + 문자열
		System.out.println(str);
		// 0 1 2 3 4 
		str = "안녕하세요";
		System.out.println(str);
		//문자열 자르기 -> char 타입으로 출력됨
		ch = str.charAt(0);
		System.out.println(ch);
		
		ch = '9';
		System.out.println(ch);
		
		ch = 57;
		System.out.println(ch);
		
		int num =57;
		
		ch = (char) num;
		System.out.println( num );
		System.out.println( (char) num);
		
		ch = (char) (ch + 9);
		System.out.println( ch );
		
		System.out.println( 65 );
		System.out.println( 66 );
		System.out.println( 67 );
		System.out.println( 68 );
		
		for (int i = 97; i < 123; i++) {
			
			System.out.println((char) i);
/* 10진수 2진수
 *	0		0
 *	1		1 		= 1비트
 *	2		10
 *	3		11
 *	4		100
 *	5		101
 *	6		110
 *	7		111		= 3비트 = 2^2 +2^1 +2^0
 *	8		1000
 *	9		1001
 *	10		1010	= 4비트
 *	
 *    
 */
			
		}
	}
}
